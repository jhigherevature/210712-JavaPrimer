package loops;

public class ArraysAndLoops {
	public static void main(String[] args) {
		char[] letters = {'a','b','c','d','e','f'};
		/*
		 * int i is used so commonly with for-loops and
		 * arrays, specifically because 'i' is a short-hand
		 * for 'incrementing variable'
		 */
		for (int i = 0; i < letters.length; i++) {
			System.out.println(letters[i]);
		}
		
		for (char L : letters) {
			System.out.println(L + ":" + (int)L);
		}
	}
}
