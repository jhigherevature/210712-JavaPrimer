package loops;

public class ForLoops {
	public static void main(String args[]) {
		System.out.println("START OF APPLICATION");
		/*
		 * For-loops, like while and do-while loops
		 * are used to repeat some portion of our code.
		 * For loops provide us with more nuanced control
		 * over the logic of the loop. The syntax of a
		 * for-loop is as follows:
		 * 
		 * for (initialization; condition; modification) {
		 * 		// body of for-loop
		 * }
		 * 
		 * initialization : a statement that will execute
		 * 		one time BEFORE our loop's condition is
		 * 		evaluated.
		 * 
		 * condition : the statement used to determine 
		 * 		when our for-loop will execute. Specifically
		 * 		this is a boolean statement. Typically this
		 * 		condition uses a variable created during
		 * 		the initialization
		 * 
		 * modification : a statement that will execute 
		 * 		at the end of each cycle of our for-loop 
		 */
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		for (int x = 10; x >= 0; x--) {
			System.out.println(x);
		}
		
		for (int j = 2; j == 2; j = 15) {
			System.out.println("This only happens once");
		}
		
		System.out.println("END OF APPLICATION");
	}
}
