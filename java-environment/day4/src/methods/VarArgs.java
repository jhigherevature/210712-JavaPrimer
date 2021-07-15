package methods;

public class VarArgs {
	public static void main(String[] args) {
		VarArgs va = new VarArgs();
		String[] sentences = new String[] {"Hello", "Goodbye"};
		takeArray(sentences);
		
		takeVarArgs(sentences);
		takeVarArgs("Hello", "Goodbye", "Programming", "Java");
		takeVarArgs();
	}
	
	/*
	 * To use this method, I'll need to create a VarArgs object
	 * then pass a String array argument
	 */
	public static void takeArray(String[] words) {
		for (String w : words) {
			System.out.println(w);
		}
	}
	
	/*
	 * To use the following method, we can pass any arbitrary
	 * number of arguments (so long as they are the same
	 * datatype as declared), and our method will work.
	 * 
	 * var args allow you to pass 0 to n number of arguments
	 */
	public static void takeVarArgs(String... words) {
		for (String w : words) {
			System.out.println(w);
		}
	}
}
