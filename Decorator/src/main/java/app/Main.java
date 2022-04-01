package app;

import decorator.Formagio;
import decorator.PaninoDecorator;
import entity.Panino;
import entity.PaninoBase;

public class Main {
	public static void main(String[] args) {
		Panino panino = new PaninoBase();
		Formagio paninoFormagio = new Formagio(panino);
		System.out.println(paninoFormagio.getIngredienti());
	}
}
