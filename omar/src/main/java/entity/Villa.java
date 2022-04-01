package entity;

import enumeration.Type;

public class Villa extends Immobile {
	
	private int numberOfSwimmingpools;
	private String gateType ;
	
	public Villa(int numberOfSwimmingpools, String gateType,int surface, int localNumber, Address address,Type type) {
		super(surface, localNumber, address, type);
		this.numberOfSwimmingpools = numberOfSwimmingpools;
		this.gateType = gateType;
	}
	
	public Villa(int surface, int localNumber, Address address, Type type) {
		super(surface, localNumber, address, type);
		// TODO Auto-generated constructor stub
	}

	public void setNumberOfSwimmingpools(int numberOfSwimmingpools) {
		this.numberOfSwimmingpools = numberOfSwimmingpools;
	}
	public void setGateType(String gateType) {
		this.gateType = gateType;
	}
	
	@Override
	public String estateType() {
		return super.estateType() + " the gate type is : " + this.gateType + " and the number of swimming pool is : " + this.numberOfSwimmingpools;
	}

	
}
