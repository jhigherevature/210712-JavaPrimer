package scopes;

/*
 * When do we have access to information?
 * 
 * Static Scope - Accessible throughout the lifetime 
 * 		of our application
 * Instance Scope - Accessible so long as the object 
 * 		exists in memory
 * Method Scope - Accessible so long as we are actively 
 * 		executing the method
 * Block Scope - Accessible so long as we are actively 
 * 		executing the flow control statement
 */
public class Data {
	/*
	 * Instance and class variables share the same
	 * pool of variable names
	 */
	// Static Scope
	public static int count;
	// Instance Scope
	public String name;
	
	public void method() {
		/*
		 * Variables within a method or block scope can
		 * share the same name with variables in a class
		 * or instance scope. BUT cannot share the same name
		 * with other variables within the same method
		 */
		int count;
		if (true) {
			// created in block scope
			String name;
		} // String name - block scope - removed
		
		/*
		 * The following is NOT a duplicate variable name
		 * because we have left the lower, block scope of
		 * the above if-statement. Variables created within
		 * a scope are removed when we exit that scope...
		 */
		String name;
	}
	
	public static void main(String[] args) {
		/*
		 * Scopes dictate where and for how long, we have access
		 * to variables that are created.
		 * 
		 * When you create a variable within a scope, you can
		 * access that variable in 'lower' scopes. But you lose
		 * access to the variable once you leave the scope in which
		 * the variable is created!
		 */
		// Method scope...
		int i = 0;
		for (i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		// X is within block scope
		for (int x = 10; x > 5; x--) {
			System.out.println(x);
		}
//		System.out.println(x); // error
	}
	
	public static void variable() {
		int i = 100;
	}
}
