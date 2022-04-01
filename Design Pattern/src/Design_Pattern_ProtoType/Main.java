package Design_Pattern_ProtoType;

public class Main {

	public static void main(String[] args) {
		Indirizio indi = new Indirizio("strada", "latina", "sezze");
		ImpiegatoEsterno impiegato = new ImpiegatoEsterno("omar", "oueslati", indi, "sielte");
		
		impiegato imp1 = impiegato.deepClone();
		imp1.getIndirizzo().setCitta("roma");
		System.out.println(imp1);
		System.out.println(impiegato);
	}

}
