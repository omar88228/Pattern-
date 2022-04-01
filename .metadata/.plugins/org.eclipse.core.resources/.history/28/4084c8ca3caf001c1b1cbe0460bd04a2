package entity;

import enumeration.Type;

public class Appartment extends Immobile {
	private int floor;

	

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
