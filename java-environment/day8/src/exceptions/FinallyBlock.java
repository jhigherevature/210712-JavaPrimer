package exceptions;

public class FinallyBlock {
	public static void main(String[] args) {
		/*
		 * When you use a try-catch block, note that
		 * you actually do not need a catch statement.
		 * You can use a try-block with a Finally statement
		 * instead. So technically this can be referred to as
		 * a try-catch/finally
		 */
		try {
			recursive(1);
		} catch(StackOverflowError e) {
			e.printStackTrace();
			System.exit(0);
		} finally {
			/*
			 * The Finally block will always run unless we
			 * invoke System.exit(0), OR we have a critical
			 * System failure (i.e. the power goes out)
			 */
			System.out.println("FINALLY BLOCK RAN!!!");
		}
	}
	
	/*
	 * The following creates an infinite loop, that will
	 * result in a StackOverflowError
	 */
	public static void recursive(int a) {
		recursive(a++);
	}
}
