package scanners;

import java.util.Scanner;

public class ScanSimulator {
	public static Scanner scan = new Scanner(System.in);
	
	public Scanner getScanner() {
		return scan;
	}
	
	public static void main(String[] args) {
		// 'o','n','e','\n'
		String word = scan.next();
		System.out.println("Your word was: " + word);
		String other = scan.next();
		System.out.println("Your other word was: " + other);
		String sentence = scan.nextLine();
		System.out.println("The rest of the sentence: " + sentence);
		int number = scan.nextInt();
		if (number > 10) {
			System.out.println("Your Number is high: " + number);
		} else {
			System.out.println("Your Number is low:" + number);
		}
		
	}
}
