package it.omar.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import it.omar.entity.Garage;
import it.omar.entity.Immobile;

public class ImmobileDaoImpl implements IImmobileDao {
	
	private  EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPADemo");            
    private  EntityManager em = emf.createEntityManager();
    
	@Override
	public boolean addImmobile(Immobile immobile) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		try {
			em.persist(immobile);
			transaction.commit();
			return true ;
		} catch (Exception e) {
			transaction.rollback();
			System.out.println(e);
			return false;
		}
	}
	
	@Override
	public List<Immobile> showAllImmobili() {
		Query query = em.createQuery("select i from Immobile i");	
		return query.getResultList();
	}
	
	@Override
	public Immobile findImmobileById(int immobileId) {
		return em.find(Immobile.class, immobileId);
	}
	
	
	@Override
	public List<Immobile> findImmobiliBySurface(int immobileSurface) {
		Query query = em.createQuery("select i from Immobile i where i.surface= :x");
		query.setParameter("x", immobileSurface);
		return query.getResultList();
	}
	
	
	
	
	
}
