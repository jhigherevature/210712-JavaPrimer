package machines;

/*
 * Classes can only extend one other class. A parent class
 * CAN be a parent to multiple classes, but each of those
 * child classes will only have the one parent
 */
public class Civic extends Sedan {

	public Civic(int passengerCount, String engineSize, String model, String make, int year) {
		super(passengerCount, engineSize, model, make, year);
		// TODO Auto-generated constructor stub
	}


}
