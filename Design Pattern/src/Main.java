
public class Main {

	public static void main(String[] args) {
		Singleton primaIstanza= Singleton.getSingleton();
		Singleton secondaIstanza= Singleton.getSingleton();
		primaIstanza.add();
		secondaIstanza.add();
		
		System.out.println("il cunt della prima estanza è : "+primaIstanza.getCunt());
		System.out.println("il cunt della seconda estanza è : "+secondaIstanza.getCunt());
	}

}
