package it.immobile.ejbSession;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import it.immobile.entity.Address;
import it.immobile.entity.Immobile;

@Stateless
public class ImmobileEjbImpl implements IImmobileLocal {
	@PersistenceContext(unitName = "immobile-ejb")
	private EntityManager em;

	@Override
	public Immobile add(Immobile immobile) {
		em.persist(immobile);
		return immobile;
	}

	@Override
	public Immobile showById(int id) {

		return em.find(Immobile.class, id);
	}

	@Override
	public List<Immobile> showAll() {
		Query query = em.createQuery("select c from Immobile c");
		return query.getResultList();
	}

	@Override
	public Immobile addAddress(int idImmobile, int idAddress) {
		Address address = em.find(Address.class, idAddress);
		Immobile immobile = em.find(Immobile.class, idImmobile);
		immobile.setAddress(address);
		em.merge(immobile);
		return immobile;
	}

	@Override
	public Immobile delete(int id) {
		Immobile immobile = em.find(Immobile.class, id);
		em.remove(immobile);
		return immobile;
	}

}
