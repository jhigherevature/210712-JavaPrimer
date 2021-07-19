package wrappers;

/*
 * Wrapper classes are representations for a datatype
 * as if it were another datatype. Specifically, java 
 * provides wrapper classes for the primitive datatypes
 * in Java. These Wrapper classes are useful when you
 * want more flexibility from a variable that a primitive
 * does not allow, or if you have specific reason to use
 * an inheritance structure (i.e. Object-class functionality
 * for a primitive datatype).
 */
public class Simulator {
	public static void main(String[] args) {
		/*
		 * The Wrapper classes in Java:
		 * Byte, Short, Integer, Character, Long, Double, Float, Boolean
		 * are associated with the primitives:
		 * byte, short, int, char, long, double, float, boolean
		 * 
		 * The wrapper classes act as 'Object-like' representations
		 * for primitive datatypes.
		 */
		int num = 9;
		/*
		 * Autoboxing : the implicit process of converting a primitive
		 * into a Wrapper in Java.
		 */
		Integer number = num; // Autoboxing
		/*
		 * (Auto)Unboxing : the implict process of converting a Wrapper
		 * into a primitive in Java 
		 */
		int unbox = number; // Unboxing
		
		number = null;
		num = 0;
		
//		num.toString();
		number.toString();
		
		double d = 10.0;
		int i = (int)d;
	}
}
