package builder;


import entity.Address;

public class BuilderAddress implements IBuilderAddress {
	
	Address address;

	public BuilderAddress() {
		address=new Address();
	}
	
	@Override
	public IBuilderAddress street(String street) {
		address.setStreet(street);
		return this;
	}

	@Override
	public IBuilderAddress city(String city) {
		address.setCity(city);
		return this;
	}

	@Override
	public IBuilderAddress province(String province) {
		address.setProvince(province);
		return this;
	}

	@Override
	public IBuilderAddress region(String region) {
		address.setRegion(region);
		return this;
	}

	@Override
	public IBuilderAddress cap(int cap) {
		address.setCap(cap);
		return this;
	}

	@Override
	public Address build() {
		// TODO Auto-generated method stub
		return address;
	}

}
