package abstrctFactory;

import entity.Animale;
import entity.Impiegato;
import entity.Mammifero;
import entity.Persona;
import entity.Pesce;
import entity.Studente;

public class FactoryPersona extends AbstractFactory {

	@Override
	public Persona getPersona(String TypoPersona,String nome ,int eta,String instituto) {
		if (TypoPersona.equalsIgnoreCase("studente")) {
			return new Studente(eta, nome, instituto);
		}
		if(TypoPersona.equalsIgnoreCase("impiegato")) {
			return new Impiegato(eta, nome, instituto);
		}
		return null;
	}

	@Override
	public Animale getAnimale(String nome ,int numero,String typoAnimale) {
		return null;
	}

	
	
}
