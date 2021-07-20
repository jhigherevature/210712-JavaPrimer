package machines;

/*
 * All classes will implicitly inherit from the Object class
 * if no other inheritance is declared. In  this way, all 
 * classes will inherit from the Object class, either directly
 * or through the parent heirarchy.
 */
public abstract class Vehicle extends Object {
	public int passengerCount;
	public String engineSize;
	public String model;
	public String type;
	
	public Vehicle(int passengerCount, String engineSize, String model, String type) {
		super();
		this.passengerCount = passengerCount;
		this.engineSize = engineSize;
		this.model = model;
		this.type = type;
	}

	/*
	 * Abstract methods can only exist within abstract
	 * classes. Additionally, abstract methods should NOT
	 * have a method body.
	 */
	public abstract void drive ();
	
	public void start() {
		System.out.println("Starting the Engine");
	}
	
	public void brake() {
		System.out.println("Slowing Down...");
	}
}
