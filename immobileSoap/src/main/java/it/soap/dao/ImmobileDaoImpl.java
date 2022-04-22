package it.soap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import it.soap.entity.Immobile;


public class ImmobileDaoImpl implements IImmobileDao {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPADemo");
	private EntityManager em = emf.createEntityManager();

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

	@Override
	public List<Immobile> showAll() {
		Query query = em.createQuery("select i from Immobile i");
		return query.getResultList();
	}

	@Override
	public Immobile findById(int immobileId) {
		return em.find(Immobile.class, immobileId);
	}

	@Override
	public List<Immobile> findBySurface(int immobileSurface) {
		Query query = em.createQuery("select i from Immobile i where i.surface= :x");
		query.setParameter("x", immobileSurface);
		return query.getResultList();
	}

}
