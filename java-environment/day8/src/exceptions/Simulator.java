package exceptions;

public class Simulator {
	public static void main(String[] args) {
//		divide(10,0);
		
		try {
			System.out.println(sumOddNumbers(5,4));
			/*
			 * Similar to if-else statement, the more specific
			 * information should come first in a series of
			 * catch blocks. Here, EvenNumberExceptions, are
			 * lower in the heirarchy for exceptions, and as 
			 * such, we should include EvenNumberException first
			 */
		} catch (EvenNumberException e) {
			/*
			 * When executing methods, in the event that
			 * we catch any particular exception, we can perform
			 * any next logical steps. Printing a Stack Trace is
			 * typically viewed as a good default step to take
			 * since it allows you information to diagnose your
			 * problem, however, there is nothing stopping us from
			 * invoking some other code, as shown below
			 */
//			e.printStackTrace();
			System.out.println("Your number was off");
			try {
				System.out.println(attemptAddition(5,5));
			} catch (EvenNumberException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int attemptAddition(int a, int b) 
			throws EvenNumberException {
		return sumOddNumbers(a, b);
	}
	
	/*
	 * Using a 'throws' declaration is known as 'ducking' the
	 * exception. This means that we will NOT resolve the issue
	 * directly within this method, but rather will communicate
	 * to the location that invokes this method, that the issue
	 * must be resolved. This is used to consolidate try-catch
	 * blocks in your code, to a single location.
	 */
	public static int sumOddNumbers(int a, int b) 
			throws EvenNumberException {
		if (a % 2 == 0) {
			throw new EvenNumberException("First Input was Even");
		} else if (b % 2 == 0) {
			throw new EvenNumberException("Second Input was Even");
		}
		
		return a + b;
	}
	
	public static int divide(int a, int b) {		
		return a / b;
	}
}
