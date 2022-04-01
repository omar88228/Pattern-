package entity;

import enumeration.Type;

public class Garage extends Immobile {
	private String gateType;

	

	public Garage(int surface, int localNumber, Address address, Type type,String gateType) {
		super(surface, localNumber, address, type);
		this.gateType = gateType;
	}

	public void setGateType(String gateType) {
		this.gateType = gateType;
	}

	public String getGateType() {
		return gateType;
	}

	@Override
	public String estateType() {
		// TODO Auto-generated method stub
		return super.estateType() + " the gate type is : " + this.gateType;
	}

}
