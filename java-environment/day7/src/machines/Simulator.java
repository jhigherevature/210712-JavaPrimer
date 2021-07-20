package machines;

import maintenance.CarWash;

public class Simulator {
	public static void main(String[] args) {
		/*
		 * When a class is defined as abstract, we cannot 
		 * instantiate an object using that abstract class's
		 * constructor. We must instead use the constructor for
		 * a subclass within the heirarchy. The Abstract keyword
		 * provides this limitation, so that we can more closely
		 * resemble our real-world understanding of 'abstract'
		 * concepts/categories
		 */
//		Vehicle v = new Vehicle(0, "n/a","n/a", "n/a");
		CarWash cw = new CarWash();
		
		Sedan s = new Sedan(4, "v4","Civic", "Honda", 2000);
		cw.washCar(s);
		Coup c = new Coup(2, "v6", "Joseph","CoolCar", 2020);
		cw.washCar(c);
		/*
		 * The Example below showcases a composite relationship
		 * between the CarOwner object and a Car object that is
		 * accessible via the 'car' field on the CarOwner object
		 */
		CarOwner co = new CarOwner("Joseph", new Car(4, "v6","Accord", "Honda", 2000));
		cw.washCar(co.car);
		
		Plane p = new Plane(0, "n/a","n/a");
		
		Vehicle one = new Car(4, "v6","Accord", "Honda", 2000);
		one.drive();
		
		Vehicle two = new Plane (100, "Big", "Boeing Something");
		two.drive();
		
		useFunction(one);
		useFunction(two);
	}
	
	/*
	 * The following showcases the benefit of Covariance!
	 * We can perform different functionality across mode
	 * types of object, instead of creating specific methods
	 * for every instance/scenario
	 */
	public static void useFunction(Vehicle v) {
		if (v instanceof Boat) {
			((Boat)v).coast();
		} else if (v instanceof Car) {
			((Car)v).honkHorn();
		} else if (v instanceof Plane) {
			((Plane)v).fly();
		} else {
			v.drive();
		}
	}
}
