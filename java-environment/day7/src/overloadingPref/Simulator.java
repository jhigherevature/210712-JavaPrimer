package overloadingPref;

/*
 * Something you probably wont see too often, is a scenario
 * like below. When there are multiple, overloaded methods
 * that could potentially use the same arguments, Java has
 * an 'overloading preference' to which version to use. The
 * main takeaway is that exact matches are used first, followed
 * by implicit casting/autoboxing. Finally Var Args are used
 * last.
 */
public class Simulator {
	public static void main(String[] args) {
		method(5);	// int version - exact match
		method(5L); // long version - exact match
		method(new int[] {5}); // force var arg with single value
	}
	public static void method(int... var) {
		System.out.println("Var Args");
	}
	public static void method(int i) {
		System.out.println("Int");
	}
	public static void method(long l) {
		System.out.println("Long");
	}
}
