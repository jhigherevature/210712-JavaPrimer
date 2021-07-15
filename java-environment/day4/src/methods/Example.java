package methods;

public class Example {
	public static String name;
	public static int number;
	
	public static void main(String[] args) {
		System.out.println("THIS IS THE EXAMPLE CLASS - START");
		PerformWork pw = new PerformWork();
		pw.main(args);
		System.out.println("THIS IS THE EXAMPLE CLASS - END");
	}
}
