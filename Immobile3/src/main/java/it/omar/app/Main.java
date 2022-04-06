package it.omar.app;

import java.util.ArrayList;
import it.omar.entity.Immobile;

public class Main {

	public static void main(String[] args) {

		Singleton sing = Singleton.getInstance();
		ArrayList<String> data = sing.getList();
		ImmobileFacade facade = new ImmobileFacade();
		ArrayList<Immobile> immobili = facade.extractObjectFromList(data);

		for (Immobile immobile : immobili) {
			System.out.println(facade.createImmobile(immobile));
		}
		for (Immobile immobile : facade.showAllImmobili()) {
			System.out.println(immobile.estateType());
		}
		for (Immobile immobile : facade.findImmobileBySurface(100)) {
			System.out.println(immobile.estateType());
		}
		System.out.println(facade.findImmobileById(1).estateType());

	}

}
