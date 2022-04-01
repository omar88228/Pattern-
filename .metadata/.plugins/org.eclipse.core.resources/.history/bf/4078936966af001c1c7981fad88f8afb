package builder;

import entity.*;
import enumeration.Type;

public class BuilderImmobile  implements IBuilderImmobile {
	private int surface;
	private int localNumber;
	private int numberOfSwimmingpools;
	private int floor;
	private String gateType ;
	private Address address;
	private Type type;
	
	@Override
	public IBuilderImmobile surface(int surface) {
		this.surface=surface;
		return this;
	}

	@Override
	public IBuilderImmobile localNumber(int localNumber) {
		this.localNumber=localNumber;
		return this;
	}

	@Override
	public IBuilderImmobile floor(int floor) {
		this.floor=floor;
		return this;
	}

	@Override
	public IBuilderImmobile address(Address address) {
		this.address=address;
		return this;
	}

	@Override
	public IBuilderImmobile type(String type) {
		this.type=Type.valueOf(type);
		return this;
	}

	@Override
	public IBuilderImmobile numberOfSwimmingpools(int numberOfSwimmingpools) {
		this.numberOfSwimmingpools=numberOfSwimmingpools;
		return this;
	}

	@Override
	public IBuilderImmobile gateType(String gateType) {
		this.gateType=gateType;
		return this;
	}

	@Override
	public Villa buildVilla() {
		return new Villa(numberOfSwimmingpools, gateType, surface, localNumber, address, type);
	}

	@Override
	public Garage buildGarage() {
		return new Garage(surface, localNumber, address, type, gateType);
	}

	@Override
	public Appartment buildAppartment() {
		return new Appartment(surface, localNumber, address, type, floor);
	}




}
