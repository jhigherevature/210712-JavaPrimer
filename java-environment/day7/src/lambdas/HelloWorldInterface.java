package lambdas;

/*
 * Functional Interfaces are simply interfaces with a
 * single abstract method. If you define a second method
 * within an interface, it ceases to be a Functional Interface
 * 
 * The @FunctionalInterface annotation can be used to help
 * reinforce an interface as a Functional one
 */

public interface HelloWorldInterface {
	public void sayHello();
	
	public default void sayGoodbye() {
		System.out.println("Goodbye - default");
	}
}
