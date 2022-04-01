package builder;

import entity.Address;
import entity.Appartment;
import entity.Garage;
import entity.Immobile;
import entity.Villa;

public interface IBuilderImmobile {
	
	IBuilderImmobile surface(int surface);

	IBuilderImmobile localNumber(int localNumber);

	IBuilderImmobile floor(int floor);

    IBuilderImmobile address(Address address);

	IBuilderImmobile type(String type);
	
	IBuilderImmobile numberOfSwimmingpools(int numberOfSwimmingpools);
	
	IBuilderImmobile gateType(String gateType);
	
	Villa buildVilla();
	
	Garage buildGarage();
	
	Appartment buildAppartment();
	
}
