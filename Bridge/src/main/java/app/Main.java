package app;

import entity.Car;
import entity.Fiat;
import entity.RedCar;

public class Main {

	public static void main(String[] args) {
		RedCar redCar = new RedCar();
		Fiat car = new Fiat(redCar);
		System.out.println(car.getCar());

	}

}
