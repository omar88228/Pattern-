package it.omar.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * a singleton class which allows the creation of a singleton who reads a local
 * file that contains the immobile list
 * @author o.oueslati
 */
public class Singleton {

	private static Singleton singleton;
	private ArrayList<String> list = new ArrayList<String>();

	private Singleton() {
		readFile();
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

	/**
	 * reads a local file that contains the immobile list and adds it to attributes 
	 * list
	 * @exception java.io.FileNotFoundException if file does not exist.
	 * @exception IOException           if stream to file cannot be written to or closed.                                 
	 */
	public void readFile() {

		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("./WebContent/info.csv"));
			String line = reader.readLine();
			while (line != null) {
				this.getList().add(line);
				line = reader.readLine();
			}
		} catch (IOException e) {

			System.out.println(e);

		}
	}

	/** 
	 * @return the list that contains the immobile
	 */
	public ArrayList<String> getList() {
		return list;
	}

}
