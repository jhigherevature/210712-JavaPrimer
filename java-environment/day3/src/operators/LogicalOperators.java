package operators;

/*
 * Logical Operators are a set of boolean operators that
 * compare two boolean values/operands. Based on the value
 * of those boolean operands, the logical operator will return
 * either true or false.
 * 
 * The logical operators are & (and) and | (or)
 */
public class LogicalOperators {
	public static void main(String[] args) {
		/*
		 * AND operators will return false unless both
		 * operands are true
		 */
		System.out.println(true & true); // true
		System.out.println(true & false); // false
		System.out.println(false & true); // false
		System.out.println(false & false); // false
		
		/*
		 * OR operators will return true unless both
		 * operands are false
		 */
		System.out.println(true | true); // true
		System.out.println(true | false); // true
		System.out.println(false | true); // true
		System.out.println(false | false); // false
		
		System.out.println("SHORTCIRCUIT [AND]:");
		System.out.println(printAndReturnTrue() & printAndReturnFalse());
		System.out.println(printAndReturnTrue() && printAndReturnFalse());
		System.out.println(printAndReturnFalse() & printAndReturnTrue());
		System.out.println(printAndReturnFalse() && printAndReturnTrue());
		
		System.out.println("SHORTCIRCUIT [OR]:");
		System.out.println(printAndReturnTrue() | printAndReturnFalse());
		System.out.println(printAndReturnTrue() || printAndReturnFalse());
	}
	
	public static boolean printAndReturnTrue() {
		System.out.println("This method will return True!");
		return true;
	}
	
	public static boolean printAndReturnFalse() {
		System.out.println("This method will return False!");
		return false;
	}
}
