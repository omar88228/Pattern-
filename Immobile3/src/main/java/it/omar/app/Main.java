package it.omar.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import it.omar.entity.Immobile;
import it.omar.entity.ImmobileOwner;

public class Main {

	public static void main(String[] args) {

		Singleton sing = Singleton.getInstance();
		ArrayList<String> data = sing.getList();
		ImmobileFacade facade = new ImmobileFacade();

		ArrayList<Immobile> immobili = facade.extractObjectFromList(data);

		int i = 0;
		for (Immobile immobile : immobili) {
			ImmobileOwner owner = new ImmobileOwner();
			List<Immobile> list = new ArrayList<Immobile>();
			list.add(immobile);
			owner.setLastName("oueslati " + i);
			i++;
			owner.setName(null);
			owner.setImmobiles(list);
			immobile.setImmobileOwner(owner);
			facade.addOwner(owner);
		}

		System.out.println(facade.findOwnerById(2).getImmobiles().get(0).estateType());

	}

}
