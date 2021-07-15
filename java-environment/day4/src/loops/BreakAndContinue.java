package loops;

public class BreakAndContinue {
	public static void main(String[] args) {
		
		/*
		 * The Break statement allows you to halt the
		 * execution of code within an enclosing loop
		 * entirely
		 */
		System.out.println("BREAK:");
		for (char letter = 'a'; letter < 'd'; letter++) {
			for (int i = 0; i < 4; i++) {
				if (i == 2) {
					break;
				}
				System.out.println(letter + ":" + i);
			}
		}
		
		/*
		 * The Continue statement allows you to halt
		 * the execution of code within the current
		 * cycle of a loop, and start the next cycle
		 * first running the modification statement 
		 * and then re-evaluating the condition...
		 */
		System.out.println("CONTINUE:");
		for (char letter = 'a'; letter < 'd'; letter++) {
			for (int i = 0; i < 4; i++) {
				if (i == 2) {
					continue;
				}
				System.out.println(letter + ":" + i);
			}
		}
		
		
		/*
		 * A label is an identifier/moniker, we can apply
		 * to a loop, that allows us to dictate where we
		 * apply the logic for a break or continue statement
		 * Note that the name of labels are arbitrary, we
		 * as the developers can put any value there
		 * 
		 * Label syntax:
		 * 
		 * <label-name> : for..
		 * <label-name> : while..
		 * <label-name> : do...
		 */
		System.out.println("LABELS:");
		alpha: for (char letter = 'a'; letter < 'd'; letter++) {
			numeric: for (int i = 0; i < 4; i++) {
				if (letter == 'b' && i == 2) {
					continue alpha;
				}
				System.out.println(letter + ":" + i);
			}
		}
	}
}
