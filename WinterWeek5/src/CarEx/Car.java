package CarEx;

public class Car {
	private String model;
	private String make;
	int numberOfCars=0;
	
	public Car(String model, String make) {
		this.model = model;
		this.make = make;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", make=" + make + ", numberOfCars=" + numberOfCars + "]";
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getNumberOfCars() {
		return numberOfCars;
	}
	public void setNumberOfCars(int numberOfCars) {
		this.numberOfCars = numberOfCars;
	}
	
}
