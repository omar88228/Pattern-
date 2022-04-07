package org.prove.app;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPADemo");
		 EntityManager em = emf.createEntityManager();
		    Person person = new Person("omar");
		    Address address = new Address("strada");
		    address.setPerson(person);
		    person.setAddresses(address);
		    EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			
				em.persist(person);
				em.persist(address);
				transaction.commit();
				Address address2 = em.find(Address.class, 1);
				address2.setStreet("romaaaa");
				Person person2 = em.find(Person.class, 1);
				transaction.begin();
				em.persist(person2);
				transaction.commit();
				
				
			
		 
	}
}
