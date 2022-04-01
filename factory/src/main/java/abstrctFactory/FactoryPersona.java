package abstrctFactory;

import entity.Animale;
import entity.*;

public class FactoryPersona extends AbstractFactory {

	@Override
	public Persona getPersona(String typoPersona,String nome ,int eta,String instituto) {
		if (typoPersona.equalsIgnoreCase("studente")) {
			return new Studente(eta, nome, instituto);
		}
		if(typoPersona.equalsIgnoreCase("impiegato")) {
			return new Impiegato(eta, nome, instituto);
		}
		return null;
	}

	@Override
	public Animale getAnimale(String nome ,int numero,String typoAnimale) {
		return null;
	}

	
	
}
