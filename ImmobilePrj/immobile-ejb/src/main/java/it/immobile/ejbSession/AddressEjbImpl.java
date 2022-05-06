package it.immobile.ejbSession;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import it.immobile.entity.Address;

@Stateless
public class AddressEjbImpl implements IAddressLocal {
	@PersistenceContext(unitName = "immobile-ejb")
	private EntityManager em ;
	
	@Override
	public Address add(Address address) {
		em.persist(address);
		return address;
	}

	@Override
	public List<Address> showAll() {
		Query query = em.createQuery("select c from Address c");
		return query.getResultList();
	}

	@Override
	public Address delete(int id) {
		Address address = em.find(Address.class, id);
		em.remove(address);
		return address;
	}

}
