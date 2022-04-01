
public class Singleton {

	private int cunt = 0;
	private static Singleton singleton;

	private Singleton() {

	}

	public static Singleton getSingleton() {
		if (singleton == null) {
			singleton = new Singleton();
		}

		return singleton;

	}

	public void add() {
		cunt++;
	}

	public int getCunt() {
		return cunt;
	}

	public void setCunt(int cunt) {
		this.cunt = cunt;
	}
	
}
