package it.omar.builder;

import it.omar.entity.Address;

/**
 * class that allows you to create an address object 
 * @author o.oueslati
 */
public class BuilderAddress implements IBuilderAddress {

	private Address address;

	public BuilderAddress() {
		address = new Address();
	}

	/**
	 * set a street for the address object
	 * @param street
	 */
	@Override
	public IBuilderAddress street(String street) {
		address.setStreet(street);
		return this;
	}

	/**
	 * set a city for the address object
	 * @param city
	 */
	@Override
	public IBuilderAddress city(String city) {
		address.setCity(city);
		return this;
	}

	/**
	 * set a province for the address object 
	 * @param province
	 */
	@Override
	public IBuilderAddress province(String province) {
		address.setProvince(province);
		return this;
	}

	/**
	 * set a region for the address object
	 * @param region
	 */
	@Override
	public IBuilderAddress region(String region) {
		address.setRegion(region);
		return this;
	}

	/**
	 * set a cap for the address object
	 * @param cap
	 */
	@Override
	public IBuilderAddress cap(int cap) {
		address.setCap(cap);
		return this;
	}

	/**
	 * build a Address object
	 * @return Address object
	 */
	@Override
	public Address build() {
		return address;
	}

}
