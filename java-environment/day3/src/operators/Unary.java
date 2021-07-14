package operators;

/*
 * Unary operators are operators that apply
 * some functionality to a single operand.
 * Note that some operators are context specific,
 * meaning that they can either change functionality
 * based on the values used, OR must only be used
 * with a specific type of operand.
 */
public class Unary {
	public static void main(String[] args) {
		int post = 10;
		System.out.println(post); // 10
		System.out.println(post++); // 10 then increase 10 > 11
		System.out.println(post);
		System.out.println("Before:" + post++ + ", After:" + post);
		
		int pre = 10;
		System.out.println(pre); // 10
		System.out.println(--pre); // 9
		
		System.out.println(true); // true
		System.out.println(!true); // false
		
		System.out.println(false); // false
		System.out.println(!false); // true
	}
}
