package loops;

public class WhileLoops {
	public static void main(String[] args) {
		System.out.println("START OF APPLICATION");
		char letter = 'a';
		/*
		 * While loops will check a boolean condition
		 * and if it is true, it will execute the logic
		 * associated with the while-loop
		 */
		while (letter <= 'z') {			
			System.out.print(letter);
			
			/*
			 * This if-statement is adding some
			 * more complexity to our code...
			 */
			if (letter == 'j')
				break;
			
			letter++;
		}
		
		/*
		 * Do-While loops execute the logic of the loop
		 * prior to checking the condition
		 */
//		do {
//			System.out.println(letter);
//			letter++;
//		} while(letter <= 'j');
		System.out.println("\nEND OF APPLICATION");
	}
}
