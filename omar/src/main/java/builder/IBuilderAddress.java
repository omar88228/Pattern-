package builder;


import entity.Address;

public interface IBuilderAddress {
	
	IBuilderAddress street(String street);

	IBuilderAddress city(String city);

	IBuilderAddress province(String province);

	IBuilderAddress region(String region);

	IBuilderAddress cap(int cap);

	Address build();
}
