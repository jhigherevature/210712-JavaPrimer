package methods;

public class Simulator {
	public static void main(String[] args) {
		Account acc = new Account(); // create new Account object		
		
		/* Below we invoke the 'deposit' method on our account Object
		 * When you delcare a method, the list of placeholder
		 * variables you can use are known as 'parameters'
		 * When invoking a method, the data that you supply
		 * to them method (which must match the datatype of the
		 * parameters) are known as arguments
		 */
		acc.deposit(100.00);
		acc.deposit(50.00);
		
		Account accTwo = new Account();
		accTwo.deposit(1000.00);
		
		System.out.println(acc.total);
		System.out.println(accTwo.total);
		
		acc.deposit();
		
		acc.deposit("Birthday Gift", 75.00);
	}
}
