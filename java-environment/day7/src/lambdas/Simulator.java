package lambdas;

public class Simulator {
	public static void main(String[] args) {
		/*
		 * If we want to reuse functionality defined for
		 * an interface, we can just use a class. Since
		 * classes are templates to express some idea/object
		 * In this case, if I want to 'functionality defined
		 * in the Hello World Class', I can use the HelloWorldClass
		 * constructor...
		 * 
		 * Lambdas do not create a dedicated class definition, and
		 * as such, can be used as a 'throwaway' part of your
		 * code.
		 */
		HelloWorldInterface hwi = new HelloWorldClass();
		hwi.sayHello();
		
		HelloWorldInterface htwoi = new HelloWorldClass();
		htwoi.sayHello();
		
		TakeInput tiLamOne = (String word, int num) -> {
			System.out.println("Word: " + word + ", Num:" + num);
		};
		tiLamOne.printInput("Revature", 100);
		
		TakeInput tiLamTwo = (word, num) -> {
			System.out.println("Word: " + word + ", Num:" + num);
		};
		TakeInput tiLamThree = (a, b) -> {
			System.out.println("Word: " + a + ", Num:" + b);
		};
	}
	
	public void method() {
		HelloWorldInterface hlam = () -> {
			System.out.println("Hello World - Lambda");
		};
		hlam.sayHello();
		hlam.sayHello();
		hlam.sayHello();
		hlam.sayHello();
		hlam.sayHello();
		hlam.sayHello();
		hlam.sayGoodbye();
		hlam.sayGoodbye();
	}
}
