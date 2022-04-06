package it.omar.app;

import java.util.ArrayList;
import java.util.List;

import it.omar.builder.BuilderAddress;
import it.omar.builder.BuilderImmobile;
import it.omar.dao.ImmobileDaoImpl;
import it.omar.entity.Address;
import it.omar.entity.Immobile;

/**
 * manage the extraction of the data of the immobile object and his creation
 * estate objects insertion of the object inside the data base
 * @author o.oueslati
 */
public class ImmobileFacade {

	private BuilderImmobile builder;
	private BuilderAddress builderAddress;
	private ImmobileDaoImpl daoImpl;

	public ImmobileFacade() {
		this.builder = new BuilderImmobile();
		this.builderAddress = new BuilderAddress();
		this.daoImpl = new ImmobileDaoImpl();
	}

	/**
	 * extraction of the attribute values of the Immobile object from a list and its
	 * creation
	 * @param data list that contains the names of the attributes and their value
	 * @return list of Immobile object
	 */
	public ArrayList<Immobile> extractObjectFromList(ArrayList<String> data) {
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
						.numberOfSwimmingPools(numberOfSwimmingpools).surface(surface).type(type).buildVilla();
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

	/**
	 * extract immobile object from list and save it in data base
	 * @param listImmobile list of immobile object
	 * @return true if immobile Successfully saved
	 */
	public boolean createImmobile(Immobile immobile) {
		return daoImpl.add(immobile);
	}

	/**
	 * show all immobile object in data base
	 * @return list of immobili
	 */
	public List<Immobile> showAllImmobili() {
		return daoImpl.showAll();
	}

	/**
	 * find immobile by surface
	 * @param immobile surface
	 * @return list of immobili
	 */
	public List<Immobile> findImmobileBySurface(int surface) {
		return daoImpl.findBySurface(surface);
	}

	/**
	 * find immobile by id
	 * @return immobile object
	 */
	public Immobile findImmobileById(int id) {
		return daoImpl.findById(id);
	}
}
