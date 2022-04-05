package it.omar.entity;

import java.io.Serializable;

import javax.persistence.*;

import it.omar.enumeration.Type;
@Entity
@DiscriminatorValue("A")
public class Appartment extends Immobile implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name="FLOOR")
	private int floor;
	public Appartment() {
		super();
	}
	public Appartment(int surface, int localNumber, Address address, Type type,int floor) {
		super(surface, localNumber, address, type);
		this.floor=floor;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	@Override
	public String estateType() {
		return super.estateType() + " the floor number is : " + this.floor;
	}

}
