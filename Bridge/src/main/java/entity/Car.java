package entity;

public abstract class Car {
	private CarColor carColor;
	
	public CarColor getCarColor() {
		return carColor;
	}

	public void setCarColor(CarColor carColor) {
		this.carColor = carColor;
	}

	public Car(CarColor carColor) {
		super();
		this.carColor = carColor;
	}

	abstract String getCar();
}
