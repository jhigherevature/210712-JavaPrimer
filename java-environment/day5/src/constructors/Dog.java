package constructors;

public class Dog {
	public String name;
	public double weight;
	public int age;
	public String breed;
	
	// This is what a default Dog constructor looks like:
//	public Dog() {}
	
	/*
	 * Below is an example of a custom constructor...
	 * typically, constructors are created as a way to
	 * initialize (set the starting value for) all field(variables)
	 * on a class
	 * 
	 * When you define a custom constructor, Java will NOT
	 * provide you with the default constructor any longer
	 */
	public Dog(String name, double weight, int age, String breed) {
		/*
		 * if you do not use the 'this' keyword, variables
		 * that are created within a method (including parameters)
		 * will 'shadow' the variables listed at an object/instance
		 * scope that share the same name. This is known as
		 * 'variable shadowing'
		 */
		this.name = name;
		this.weight = weight;
		this.age = age;
		this.breed = breed;
		RepositoryCommunication rc = new RepositoryCommunication();
		// invoke method from some other class
		// invoke other method
		rc.passToRepo(this);
	}
	
	public Dog(int age) {
		this("No Name", 0.0, age, "No Breed");
	}

	public void speak() {
		System.out.println("My name is: " + name);		
	}
	
	/*
	 * Overloaded constructor that only provide a Single
	 * String argument for the name
	 */
	public Dog(String name) {
		this.name = name;
	}
	/*
	 *  Remember that overloaded methods (and constructors)
	 *  are differentiated by the amount and datatype of
	 *  the parameters
	 */
//	public Dog (String b) {
//		breed = b;
//	}
	
	public void bark() {
		System.out.println("Woof Woof");
	}
}
