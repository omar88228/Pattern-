package it.omar.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;

import it.omar.enumeration.Type;
@Entity
@Table( name= "IMMOBILE")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="IMMOBILE_TYPE")
public class Immobile implements IEstate,Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="IMMOBILE_ID")
	private int id ;
	
	@Column(name="SURFACE")
	@Min(value = 20, message = "surface should not be less than 18")
    @Max(value = 300, message = "surface should not be greater than 300")
	private int surface;
	
	@Column(name="LOCAL_NUMBER")
	@Positive
	private int localNumber;
	
    @Enumerated(EnumType.STRING)
	private Type type;
    
    @OneToMany(cascade ={CascadeType.DETACH,CascadeType.REFRESH,CascadeType.MERGE})
	private List<Resident> residents;
    
    @ManyToMany(cascade = {CascadeType.DETACH,CascadeType.REFRESH,CascadeType.MERGE})
	private List<ImmobileOwner> immobileOwners;
	
    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.REFRESH,CascadeType.MERGE})
    private Address address ;
    
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



	public List<Resident> getResidents() {
		return residents;
	}

	public void setResidents(List<Resident> residents) {
		this.residents = residents;
	}

	public List<ImmobileOwner> getImmobileOwners() {
		return immobileOwners;
	}

	public void setImmobileOwners(List<ImmobileOwner> immobileOwners) {
		this.immobileOwners = immobileOwners;
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

	

	@Override
	public String estateType() {
		return " immobile type is :  " + this.type.name() + " and ";
	}

	@Override
	public String toString() {
		return "Immobile [id=" + id + ", surface=" + surface + ", localNumber=" + localNumber + ", type=" + type
				+ ", residents=" + residents + ", immobileOwners=" + immobileOwners + ", address=" + address + "]";
	}

}
