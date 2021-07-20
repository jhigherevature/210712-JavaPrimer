package machines;

public class Car extends Vehicle {
	public String make;
	public int year;
	
	public Car(int passengerCount, String engineSize, String model, String make, int year) {
		/*
		 * All constructors must first invoke another constructor. In 
		 * this way, we will eventually call and resolve the constructor
		 * for the Object class, prior to completing any other functionality.
		 * 
		 * This call to other constructors is called 'constructor chaining'
		 */
		super(passengerCount, engineSize, model, "Car");
		this.make = make;
		this.year = year;
	}
	
	public void honkHorn() {
		System.out.println("Honk Honk");
	}
	
	@Override
	public void drive() {
		System.out.println("Cars Drive a bit differently");
	}
}
