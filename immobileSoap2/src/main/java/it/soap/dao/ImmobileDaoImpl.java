package it.soap.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import it.soap.entity.Address;
import it.soap.entity.Immobile;

public class ImmobileDaoImpl {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPADemo");
	private EntityManager em = emf.createEntityManager();

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

	public List<Immobile> showAll() {
		Query query = em.createQuery("select i from Immobile i");
		return query.getResultList();
	}

	public Immobile findById(int immobileId) {
		return em.find(Immobile.class, immobileId);
	}

	public List<Immobile> findBySurface(int immobileSurface) {
		Query query = em.createQuery("select i from Immobile i where i.surface= :x");
		query.setParameter("x", immobileSurface);
		return query.getResultList();
	}

	public int getSurfaceImmobile(int id) {
		Immobile immobile = em.find(Immobile.class, id);
		return immobile.getSurface();
	}
	
	public Immobile addAddressToImmobile(int idImmobile,int idAddress) {
		EntityTransaction transaction = em.getTransaction();
		Immobile immobile = em.find(Immobile.class, idImmobile);
		
		try {
			transaction.begin();
			Address address = em.find(Address.class, idAddress);
			immobile.setAddress(address);
			em.merge(immobile);
			transaction.commit();
			return immobile;
		} catch (Exception e) {
			transaction.rollback();
			System.out.println(e);
			return null;
		}
		
	}
	public Address addAddress(Address address) {
		EntityTransaction transaction = em.getTransaction();
		
		try {
			transaction.begin();
			em.persist(address);
			transaction.commit();
			return address;
		} catch (Exception e) {
			transaction.rollback();
			System.out.println(e);
			return null;
		}
		
	}

}
