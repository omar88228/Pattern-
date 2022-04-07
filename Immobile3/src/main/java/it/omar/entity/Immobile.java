package it.omar.entity;

import java.io.Serializable;

import javax.persistence.*;

import it.omar.enumeration.Type;
@Entity
@Table( name= "T_IMMOBILE")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="IMMOBILE_TYPE")
public class Immobile implements IEstate,Serializable {
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
    @Column(name="ADDRESS")
    @Embedded
	private Address address;
    @ManyToOne
	private ImmobileOwner immobileOwner ;
	public Immobile(int surface, int localNumber, Address address, Type type) {
		super();
		this.surface = surface;
		this.localNumber = localNumber;
		this.address = address;
		this.type = type;
	}

	public Immobile() {
		super();
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

	public ImmobileOwner getImmobileOwner() {
		return immobileOwner;
	}

	public void setImmobileOwner(ImmobileOwner immobileOwner) {
		this.immobileOwner = immobileOwner;
	}

	@Override
	public String estateType() {
		return " immobile type is :  " + this.type.name() + " and ";
	}

}
