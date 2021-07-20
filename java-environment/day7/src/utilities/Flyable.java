package utilities;

/*
 * Implicitly, methods defined in an interface are
 * Abstract. However, the 'default' keyword (not to
 * be confused with 'default' in a switch statement)
 * can be used to define the implementation details 
 * (body of the method) inside the interface.
 */
public interface Flyable {
	public default void fly() {
		System.out.println("General Way to Fly - You should override this method...");
	}
}
