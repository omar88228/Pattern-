package abstrctFactory;

public class FactoryCreator {
	
	public static AbstractFactory getFactory(String type) {
		if (type.equalsIgnoreCase("persona")) {
			return new FactoryPersona();
		}
		if (type.equalsIgnoreCase("animale")) {
			return new FactoryPesce();
		}
		return null;
		
	}
}
