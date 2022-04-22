package it.omar.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import it.omar.entity.Address;
import it.omar.entity.Immobile;
import it.omar.entity.ImmobileOwner;
import it.omar.entity.Resident;

public class Main {

	public static void main(String[] args) {

		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPADemo");
		 EntityManager em = emf.createEntityManager();
		 EntityTransaction transaction = em.getTransaction();
		 
		 Address address = new Address();
		 address.setCap(04100);
		 address.setStreet("latina hey ");
		 
		 ImmobileOwner immobileOwner = new ImmobileOwner();
		 immobileOwner.setLastName("omar");
		 immobileOwner.setLastName("oueslati");
		 ArrayList<ImmobileOwner> immobileOwners = new ArrayList<ImmobileOwner>();
		 immobileOwners.add(immobileOwner);
		 
		 Resident resident = new Resident();
		 resident.setLastName("alaya");
		 resident.setName("na3ja");
		 Resident resident1 = new Resident();
		 resident1.setLastName("aiser");
		 resident1.setName("sikousikou");
		 List<Resident>residents= new ArrayList<Resident>();
		 residents.add(resident);
		 residents.add(resident1);
	//--------------------------------------------
		 Immobile immobile = new Immobile();
		 immobile.setAddress(address);
		 immobile.setImmobileOwners(immobileOwners);
		 immobile.setResidents(residents);
		 immobile.setLocalNumber(123);
		
		 Immobile immobile2 = em.find(Immobile.class, 1);
		 
		System.out.println(em.contains(immobile2));
		immobile2.getAddress().setCap(120);
		immobile2.setSurface(9990);
		
		System.out.println(immobile2.getAddress().getCap());
		 transaction.begin();
		
		 Immobile immobile3 = em.merge(immobile2);
		 immobile2.setSurface(600);
		System.out.println(immobile3.toString());
		 transaction.commit();
		 //-----------------------------------------
		 
		
	}

}
