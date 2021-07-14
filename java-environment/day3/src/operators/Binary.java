package operators;

/*
 * Binary operators, similar to unary, apply to a number
 * of operands, specifically, binary operators apply to 
 * 2 operands. All operators are context specific, so
 * some of these operators only apply to specific datatypes
 * while others will return specific datatypes as well
 */
public class Binary {
	public static void main(String[] args) {
		/*
		 * The Modulus (%) operator, will perform
		 * a division between two numbers. The first
		 * operand, divided by the second. And then
		 * will return the REMAINDER after the division
		 */
		int mod = 10 % 3; // 1
		System.out.println(mod);
		/*
		 * Any number % 2 will provide either 0 (number is even)
		 * or 1 (number is odd)
		 */
		int oddOrEven = 12 % 2;
		System.out.println(oddOrEven); // 0
		
		/*
		 * The addition (+) operator, when used with numerical
		 * values, performs addition. However, if used when
		 * a String value is present in the operation then
		 * we will instead perform String Concatenation
		 */
		System.out.println(5 + 2 + ": Hello There");
		
		System.out.println(10 > 10); // false
		System.out.println(10 >= 10); // true
		
		System.out.println(10 == 10); // true
		System.out.println(10 != 10); // false
		
		/*
		 * Division with integers can be a bit confusing at
		 * first. Keep in mind that ANY whole number literal
		 * when used in any expression or assignment is treated
		 * as an int datatype. int datatypes DO NOT use any
		 * decimal point values
		 */
		double r_whole = 9/2; // when dividing with int, we return an int
		System.out.println(r_whole); // 4.0
		
		double r_decimal = 9.0/2.0; // force the use of doubles
		System.out.println(r_decimal); // 4.5
		
		float f_decimal = 9.0f/2.0f; // force the use of floats
		System.out.println(r_decimal); // 4.5
	}
}
