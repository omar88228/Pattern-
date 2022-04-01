package app;

import adapter.BicycleAdapter;
import entity.Bicycle;
import entity.Car;
import entity.Vehicle;

public class Main {

	public static void main(String[] args) {
		Vehicle vehicle = new Car();
		useCar(vehicle);
		//--------------------------------------------
		Bicycle bicycle = new Bicycle();
		Vehicle adapter = new BicycleAdapter(bicycle);
		useCar(adapter);

	}
	public static  void useCar(Vehicle car) {
		System.out.println(car.accelerate());
		System.out.println(car.sound());
		System.out.println(car.stop());
	}

}
