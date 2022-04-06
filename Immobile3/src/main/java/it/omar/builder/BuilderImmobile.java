package it.omar.builder;

import it.omar.entity.*;
import it.omar.enumeration.Type;

/**
 * class that allows you to create an immobile object
 * @author o.oueslati
 */
public class BuilderImmobile implements IBuilderImmobile {
	private int surface;
	private int localNumber;
	private int numberOfSwimmingPools;
	private int floor;
	private String gateType;
	private Address address;
	private Type type;

	/**
	 * set surface for the immobile object 
	 * @param surface
	 */
	@Override
	public IBuilderImmobile surface(int surface) {
		this.surface = surface;
		return this;
	}

	/**
	 * set local number for the immobile object
	 * @param localNumber
	 */
	@Override
	public IBuilderImmobile localNumber(int localNumber) {
		this.localNumber = localNumber;
		return this;
	}

	/**
	 * set floor for immobile object
	 * @param floor
	 */
	@Override
	public IBuilderImmobile floor(int floor) {
		this.floor = floor;
		return this;
	}

	/**
	 * set a address for the immobile object
	 * @param address object
	 */
	@Override
	public IBuilderImmobile address(Address address) {
		this.address = address;
		return this;
	}

	/**
	 * set a type for the immobile object
	 * @param type
	 */
	@Override
	public IBuilderImmobile type(String type) {
		this.type = Type.valueOf(type);
		return this;
	}

	/**
	 * set number of swimming pools for the immobile object
	 * @param numberOfSwimmingPools
	 */
	@Override
	public IBuilderImmobile numberOfSwimmingPools(int numberOfSwimmingPools) {
		this.numberOfSwimmingPools = numberOfSwimmingPools;
		return this;
	}

	/**
	 * set gate type for the immobile object
	 * @param gateType
	 */
	@Override
	public IBuilderImmobile gateType(String gateType) {
		this.gateType = gateType;
		return this;
	}

	/**
	 * build object type Villa
	 * @return Villa object
	 */
	@Override
	public Villa buildVilla() {
		return new Villa(numberOfSwimmingPools, gateType, surface, localNumber, address, type);
	}

	/**
	 * build object type Garage
	 * @return Garage object
	 */
	@Override
	public Garage buildGarage() {
		return new Garage(surface, localNumber, address, type, gateType);
	}

	/**
	 * build object type Appartment
	 * @return Appartment object
	 */
	@Override
	public Appartment buildAppartment() {
		return new Appartment(surface, localNumber, address, type, floor);
	}

}
