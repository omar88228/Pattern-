import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Entity.Estate;
import Entity.Iestate;

public class Main {

	public static void main(String[] args) {
		
		Singleton sing = Singleton.getSingletion();
		ArrayList<String> attributeList = sing.getLista();
		FactoryEstate factory = new FactoryEstate();
		
		for (int i = 0; i < attributeList.size()-1; i++) {
			String[] attributes = attributeList.get(i+1).split(",");
			Iestate estate= factory.getEstate(attributes[attributes.length-1], attributes);
			System.out.println(estate);
		}
		
		
		
		
	}
	
}
