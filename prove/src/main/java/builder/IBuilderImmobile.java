package builder;

import entity.*;

public interface IBuilderImmobile <T extends Immobile> {
	
	IBuilderImmobile <T> surface(int surface);

	IBuilderImmobile <T> localNumber(int localNumber);

	IBuilderImmobile <T>  floor(int floor);

    IBuilderImmobile <T>  address(Address address);

	IBuilderImmobile <T>  type(String type);
	
	IBuilderImmobile <T>  numberOfSwimmingpools(int numberOfSwimmingpools);
	
	IBuilderImmobile <T>  gateType(String gateType);
	
	T build();
	
	
}
