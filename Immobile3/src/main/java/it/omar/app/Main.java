package it.omar.app;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import it.omar.builder.BuilderAddress;
import it.omar.builder.BuilderImmobile;
import it.omar.dao.ImmobileDaoImpl;
import it.omar.entity.Address;
import it.omar.entity.Immobile;
public class Main {

	public static void main(String[] args) {
	     
    		Singleton sing = Singleton.getInstance();
    		ArrayList<String> data = sing.getList();
    		ImmobileFacade facade = new ImmobileFacade();
    		ArrayList<Immobile> immobili = facade.createImmobile(data);
    		ImmobileDaoImpl daoImpl = new ImmobileDaoImpl();
    		for (Immobile immobile : immobili) {
    			System.out.println(immobile.estateType());
				System.out.println(daoImpl.addImmobile(immobile));
			}
    		

	}
	  
   }

