/*
 * Aside from comments, the First line of
 * every java class file should be the package
 * declaration. This informs your JVM what
 * locations/files should be searched and how
 * to search for files in larger java projects
 */
package basics;

public class PrimitiveDatatypes {
	public static void main(String[] args) {
		/*
		 * In java, you state the datatype of a
		 * variable followed by its name when creating
		 * these representations for information
		 */
		byte b = (byte)1000;
		System.out.println(b);
		
		short s = 1000;
		
		int i = (int)10_000_000_000L;
		
		// Use the letter 'L' to represent a long value
		long l = 10_000_000_000L;
		
		// Use the letter 'F' to represent a float value
		float f = 1000.00F;
		
		double d = 1000.00;
		
		char c = 'a';
		
		/*
		 * Booleans are representations for either
		 * true or false
		 */
		boolean tru = true;
		boolean fal = false;
		
		
		/*
		 * When converting between a decimal point
		 * value and an integer/whole value, we 
		 * truncate the numbers after the decimal
		 */
		double decimal = 99.999;
		System.out.println(decimal); // 99.999
		int number = (int)decimal; // downcasting
		System.out.println(number); // 99
	}
}
