package machines;

import utilities.Flyable;

public class Plane extends Vehicle implements Flyable {
	public Plane(int passengerCount, String engineSize, String model) {
		super(passengerCount, engineSize, model, "Plane");
		// TODO Auto-generated constructor stub
	}

	public void fly() {
		System.out.println("Soaring through the air");
	}
	
	public void drive() {
		System.out.println("Speeding up so we can fly later...");
	}
}
