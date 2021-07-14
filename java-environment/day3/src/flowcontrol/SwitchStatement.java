package flowcontrol;

/*
 * Switch statements are other conditional statement, like
 * if-else statement, which can dictate the flow of our
 * program's execution.
 * 
 * Switch statements will check the value of a variable
 * against case statements.
 * Switch statement exhibit 'fall-through' logic. This means
 * that once a match is found for a case, we will continue
 * to execute logic, until we reach a break statement or the
 * end of the switch statement.
 */
public class SwitchStatement {
	public static void main(String[] args) {
		char letter = 'J';

		switch (letter) {
		case 'A':
			System.out.println("A is for Assembly");
			break;
		case 'B':
			System.out.println("B is for Binary");
			break;
		case 'C':
			System.out.println("C is for Compiled");
			break;
		default:
			System.out.println("No matching letter found");
		}
		
		
		int num = 10;
		switch (letter) {
		case 'A':
			if (num > 5) {
				// logic...
			} else {
				// logic...
			}
			break;
		case 'B':
			// more logic here...
			break;
		}
	}
}
