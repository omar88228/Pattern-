package entity;

public class Car implements Vehicle {

	@Override
	public String accelerate() {	
		return "car accelerate ";
	}

	@Override
	public String stop() {
		return "car stop";
	}

	@Override
	public String sound() {
		
		return " bipp bipp";
	}

	

}
