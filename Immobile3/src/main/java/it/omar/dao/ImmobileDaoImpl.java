package it.omar.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import it.omar.entity.Immobile;
import it.omar.entity.ImmobileOwner;

/**
 * @author o.oueslati Data access object which take responsibility to process
 *         persistence and database processing.
 */
public class ImmobileDaoImpl implements IImmobileDao {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPADemo");
	private EntityManager em = emf.createEntityManager();

	/**
	 * add immobile object to the data base 
	 * @param immobile object
	 */
	@Override
	public Immobile add(Immobile immobile) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		try {
			em.persist(immobile);
			transaction.commit();
			return immobile;
		} catch (Exception e) {
			transaction.rollback();
			System.out.println(e);
			return null;
		}
	}

	/**
	 * show all immobile object in data base
	 * @return list of immobili
	 */
	@Override
	public List<Immobile> showAll() {
		Query query = em.createQuery("select i from Immobile i");
		return query.getResultList();
	}

	/**
	 * find immobile by id
	 * @return immobile object
	 */
	@Override
	public Immobile findById(int immobileId) {
		return em.find(Immobile.class, immobileId);
	}

	/**
	 * find immobile by surface
	 * @param immobile surface
	 * @return list of immobili
	 */
	@Override
	public List<Immobile> findBySurface(int immobileSurface) {
		Query query = em.createQuery("select i from Immobile i where i.surface= :x");
		query.setParameter("x", immobileSurface);
		return query.getResultList();
	}

	@Override
	public ImmobileOwner addOwner(ImmobileOwner immobileOwner) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		try {
			em.persist(immobileOwner);
			transaction.commit();
			return immobileOwner;
		} catch (Exception e) {
			transaction.rollback();
			System.out.println(e);
			return null;
		}
	}
	public ImmobileOwner findOwnerById(int idOwner){
		
	return	em.find(ImmobileOwner.class, idOwner);
	}

}
