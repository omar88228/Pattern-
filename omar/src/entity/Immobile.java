package entity;

import java.util.Arrays;

import enumeration.Type;

public class Immobile implements IEstate {
	private int surface;
	private int localNumber;
	private int floor;
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	private Address address;
	private Type type ;

	public Immobile() {

	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public void setSurface(int surface) {
		this.surface = surface;
	}

	public void setLocalNumber(int localNumber) {
		this.localNumber = localNumber;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}


	


	@Override
	public Type estateType() {
		// TODO Auto-generated method stub
		return this.getType();
	}

}
