package methods;

public class Account {
	public double total;
	
	public double deposit(double amount) {
		System.out.println("You deposited: $" + amount);
		total += amount;
		System.out.println("Your new total is: $" + total);
		return total;
	}
	
	/*
	 * The following is an overloaded version of our
	 * 'deposit' method. It can be distinguished based on
	 * the arguments that are supplied to the method 
	 * when you invoke it
	 */
	public double deposit() {
		System.out.println("You did not supply me with an amount");
		return total;
	}
	
	public double deposit(String note, double amount) {
		System.out.println("You made a deposit with the following message:" + note);
		total += amount;
		System.out.println("Your total: " + total);
		return total;
	}
	
	public double viewTotal() {
		return total;
	}
}
