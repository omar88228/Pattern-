package abstrctFactory;

import entity.Animale;
import entity.Mammifero;
import entity.Persona;
import entity.Pesce;

public class FactoryPesce extends AbstractFactory{

	@Override
	public Persona getPersona(String TypoPersona, String nome, int eta, String instituto) {	
		return null;
	}

	@Override
	public Animale getAnimale(String nome, int numero, String typoAnimale) {
		if (typoAnimale.equalsIgnoreCase("mammifero")) {
			return new Mammifero(nome, numero);
		}
		if (typoAnimale.equalsIgnoreCase("pesce")) {
			return new Pesce(nome, numero);
		}
		return null;
	}

}
