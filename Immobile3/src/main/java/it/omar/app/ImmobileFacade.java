package it.omar.app;

import java.util.ArrayList;
import it.omar.builder.BuilderAddress;
import it.omar.builder.BuilderImmobile;
import it.omar.entity.Address;
import it.omar.entity.Immobile;

public class ImmobileFacade {

	private BuilderImmobile builder = new BuilderImmobile();
	private BuilderAddress builderAddress = new BuilderAddress();

	public ImmobileFacade() {
		this.builder = new BuilderImmobile();
		this.builderAddress = new BuilderAddress();
	}

	public ArrayList<Immobile> createImmobile(ArrayList<String> data) {
		int surface = 0;
		int localNumber = 0;
		int floor = 0;
		int numberOfSwimmingpools = 0;
		String gateType = null;
		String type = null;
		String street = null;
		String province = null;
		String city = null;
		String region = null;
		int cap = 0;
		Immobile immobile = null;
		ArrayList<Immobile> listOfImmobili = new ArrayList<Immobile>();
		String[] firstRowOfData = data.get(0).split(",");
		for (int i = 1; i < data.size(); i++) {
			String[] attributesImmobile = data.get(i).split(",");

			for (int j = 0; j < attributesImmobile.length; j++) {
				if (firstRowOfData[j].equals("surface")) {
					surface = Integer.parseInt(attributesImmobile[j]);
				}
				if (firstRowOfData[j].equals("localNumber")) {
					localNumber = Integer.parseInt(attributesImmobile[j]);
				}
				if (firstRowOfData[j].equals("floor") && !attributesImmobile[j].isBlank()) {
					floor = Integer.parseInt(attributesImmobile[j]);
				}
				if (firstRowOfData[j].equals("type")) {
					type = attributesImmobile[j];
				}
				if (firstRowOfData[j].equals("street")) {
					street = attributesImmobile[j];
				}
				if (firstRowOfData[j].equals("city")) {
					city = attributesImmobile[j];
				}
				if (firstRowOfData[j].equals("province")) {
					province = attributesImmobile[j];
				}
				if (firstRowOfData[j].equals("region")) {
					region = attributesImmobile[j];
				}
				if (firstRowOfData[j].equals("cap")) {
					cap = Integer.parseInt(attributesImmobile[j]);
				}
				if (firstRowOfData[j].equalsIgnoreCase("numberOfSwimmingpools") && !attributesImmobile[j].isBlank()) {
					numberOfSwimmingpools = Integer.parseInt(attributesImmobile[j]);
				}
				if (firstRowOfData[j].equals("gateType")) {
					gateType = attributesImmobile[j];
				}
			}
			Address address = builderAddress.cap(cap).city(city).street(street).region(region).province(province)
					.build();

			if (type.equalsIgnoreCase("VILLA")) {

				immobile = builder.address(address).gateType(gateType).localNumber(localNumber)
						.numberOfSwimmingpools(numberOfSwimmingpools).surface(surface).type(type).buildVilla();
				listOfImmobili.add(immobile);
			}
			if (type.equalsIgnoreCase("GARAGE")) {

				immobile = builder.address(address).gateType(gateType).localNumber(localNumber).surface(surface)
						.type(type).buildGarage();
				listOfImmobili.add(immobile);
			}
			if (type.equalsIgnoreCase("APARTMENT")) {

				immobile = builder.address(address).floor(floor).localNumber(localNumber).surface(surface).type(type)
						.buildAppartment();
				listOfImmobili.add(immobile);

			}

		}

		return listOfImmobili;
	}

}
