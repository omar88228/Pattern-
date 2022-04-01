package FactoryMethod;

import Util.View;

public class Main {

	public static void main(String[] args) {
		BankFactory bankFactory = new BankFactory();
		String cod =View.getString("inserire il codice della banca ");
		String bancod = cod.substring(0, 6);
		Ibank bank = bankFactory.getBank(bancod);
		System.out.println(bank.prelievo());
	}

}
