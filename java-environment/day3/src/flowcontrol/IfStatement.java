package flowcontrol;

/*
 * Flow control statements allow you to dictate the
 * execution order of functionality within your program
 * typically using keyword/reserved words for a language
 * 
 * Conditional Statements are a sub-category of flow-control
 * statements, which allow you to choose certain functionality
 * based on a boolean condition
 */
public class IfStatement {
	public static void main(String[] args) {
		System.out.println("Start of application");
		
		int x = 5;
		
		/*
		 * Be wary of where you place your semi-colons
		 * when creating flow-control statements
		 * 
		 * The below if-statement only applies to the
		 * semi-colon, and as such, no logic will actually
		 * be performed!
		 */
		if (x < 0); {
			System.out.println("The condition was true!");
			System.out.println("We execute all of the code associated "
					+ "with an if-statement");
		}
			
		
		int y = 80;
		if (y > 100) {
			System.out.println("Y is more than 100");
		} else if(y >= 10) {
			System.out.println("Y is more than 10, but less than 100");
		} else {
			System.out.println("Y is 9 or less");
		}
		
		
		int age = 16;
		boolean withParent = false;
		if (age >= 18) {
			System.out.println("You can watch rated R movies");
		} else if (age > 13) {
			if (withParent) {
				System.out.println("You can watch rated R movies");
			} else {
				System.out.println("You can watch rated T movies");
			}
		} else {
			if (withParent) {
				System.out.println("You can watch rated T movies");
			} else {
				System.out.println("You can watch rated G movies");
			}
		}
		
		if (age >= 18 || (age >= 13 & withParent)) {
			System.out.println("You can watch rated R movies");
		}
		
		
		System.out.println("End of application");
		
		
	}
}
