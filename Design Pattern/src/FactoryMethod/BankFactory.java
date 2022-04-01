package FactoryMethod;

public class BankFactory implements IfactoryBank {
	private static final String CODICEBANKA = "111111";
	private static final String CODICEBANKB = "123456";
	@Override
	public Ibank getBank(String codBank) {
		if (codBank.equals(CODICEBANKA)) {
			return new BankA();
		}
		if (codBank.equals(CODICEBANKB)) {
			return new BankB();
		}
		return null;
	}

}
