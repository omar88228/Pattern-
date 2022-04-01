package builder;

import entity.Address;

import entity.Immobile;

public interface IBuilder {
	
	IBuilder surface(int surface);

	IBuilder localNumber(int localNumber);

	IBuilder floor(int floor);


   IBuilder address(Address address);

	IBuilder type(String type);
	
	Immobile build();
	
}
