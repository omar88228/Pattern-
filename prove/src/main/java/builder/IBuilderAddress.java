package builder;


import entity.Address;
import entity.Immobile;

public interface IBuilderAddress <T extends Immobile>{
	
	IBuilderAddress street(String street);

	IBuilderAddress city(String city);

	IBuilderAddress province(String province);

	IBuilderAddress region(String region);

	IBuilderAddress cap(int cap);

	Address build();
}
