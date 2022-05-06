package it.immobile.ejbSession;

import java.util.List;
import it.immobile.entity.Address;

public interface IAddressLocal {

	public Address add(Address address);

	public List<Address> showAll();
	
	public Address delete(int id); 
}
