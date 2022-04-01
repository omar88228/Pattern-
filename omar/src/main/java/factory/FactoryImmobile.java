package factory;

import builder.*;
import entity.Address;
import entity.Immobile;

public class FactoryImmobile implements IFactoryImmobile {

	@Override
	public Immobile getBuilder(int surface, int localNumber, Address address, String type, int floor,
			int numberOfSwimmingpools, String gateType) {
		
		if (type.equalsIgnoreCase("VILLA")) {
			BuilderVilla builderVilla = new BuilderVilla();
			return builderVilla.gateType(gateType).numberOfSwimmingpools(numberOfSwimmingpools)
					.address(address).localNumber(localNumber).surface(surface)
					.type(type).buildVilla();
		}
		if (type.equalsIgnoreCase("GARAGE")) {
			BuilderGarage builderGarage = new BuilderGarage();
			return  builderGarage.gateType(gateType)
					.address(address).localNumber(localNumber).surface(surface)
					.type(type).buildGarage();
		}
		if (type.equalsIgnoreCase("APARTMENT")) {
			BuilderAppartment builderAppartment = new BuilderAppartment();
			return  builderAppartment.floor(floor)
					.address(address).localNumber(localNumber).surface(surface)
					.type(type).buildAppartment();
		}
		return null;
	}

}
