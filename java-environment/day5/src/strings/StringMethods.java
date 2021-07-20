package strings;

public class StringMethods {
	public static void main(String[] args) {
		String sentence = "Programming can be interesting "
				+ "sometimes! Mostly when I dont have bugs";
		
		char[] letters = {'P','r','o','g'};
		
		System.out.println(sentence.charAt(0));
		System.out.println(sentence.indexOf('i'));
		System.out.println(sentence.length());
		System.out.println(sentence.toLowerCase());
		System.out.println(sentence.toUpperCase());
		System.out.println(sentence);
		
		sentence.substring(sentence.indexOf('i'), sentence.length()).indexOf('i');
		
		// Scanner scan = new Scanner(System.in);
		// String phrase = scan.nextLine();
		// phrase.split(" ");
		
		String[] words = sentence.split(" ");
		for (String w : words) {
			System.out.println(w);
		}
		
		String one = "Revature";
		String two = new String("Revature");
		System.out.println(one == two); // false
		System.out.println(one == two.intern()); // true
		
	}
}
