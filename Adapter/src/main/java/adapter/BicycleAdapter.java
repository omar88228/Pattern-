package adapter;

import entity.Bicycle;
import entity.Vehicle;

public class BicycleAdapter implements Vehicle {
	private Bicycle bicycle;
	
	public BicycleAdapter(Bicycle bicycle) {
		super();
		this.bicycle = bicycle;
	}

	@Override
	public String accelerate() {
		return bicycle.pedal();
	}

	@Override
	public String stop() {
		return bicycle.stop();
	}

	@Override
	public String sound() {
		return bicycle.ringBell();
	}

}
