package it.rest.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import it.rest.enumeration.Type;

@Entity
@Table( name= "IMMOBILE")
@XmlRootElement
public class Immobile implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="IMMOBILE_ID")
	private int id ;
	
	@Column(name="SURFACE")
	private int surface;
	
	@Column(name="LOCAL_NUMBER")
	private int localNumber;
	
    @Enumerated(EnumType.STRING)
	private Type type;
	
    @ManyToOne(cascade = {CascadeType.ALL})
    private Address address ;
    
	public Immobile() {
		super();
	}

	public Immobile(int surface, int localNumber, Type type, Address address) {
		super();
		this.surface = surface;
		this.localNumber = localNumber;
		this.type = type;
		this.address = address;
	}

	public int getSurface() {
		return surface;
	}

	public void setSurface(int surface) {
		this.surface = surface;
	}

	public int getLocalNumber() {
		return localNumber;
	}

	public void setLocalNumber(int localNumber) {
		this.localNumber = localNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
