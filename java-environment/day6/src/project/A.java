package project;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		
		while (menu != 4) {
			System.out.println("Give me new Input:");
			menu = scan.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("QUIT");
				break;
			}
		}
	}
}
