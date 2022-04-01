package factory;


import entity.Address;
import entity.Immobile;

public interface IFactoryImmobile {
	Immobile getBuilder(int surface,int localNumber,Address address,String type,int floor,int numberOfSwimmingpools,String gateType);
}
