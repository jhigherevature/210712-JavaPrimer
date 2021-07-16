package strings;

public class Simulator {
	public static void main(String[] args) {
		String one = "Revature";
		String two = new String("Revature");
		String three = "Revature";
		String four = "Joseph";
		
		System.out.println(one);
		System.out.println(two);
		/*
		 * the '==' operator compares memory addresses
		 * When creating Strings, string literals are
		 * placed in the String pool, while other String
		 * objects are placed in the 'normal' heap area
		 */
		System.out.println(" == : " + (one == two)); // false
		System.out.println("equals : " + one.equals(two)); // true
		
		System.out.println(one == three); // true
		System.out.println(one == four); // false
		
		System.out.println(one.hashCode());
		System.out.println(two.hashCode());
		System.out.println(three.hashCode());
	}
}
