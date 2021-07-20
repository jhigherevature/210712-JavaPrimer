package finalkeyword;

public class Child extends Parent {
	/*
	 * Final Variables can be assigned an initial value 
	 * (i.e. initialized), either the line that the
	 * variable is declared, or within a constructor.
	 */
	public final String name = "Name";
	public final int number;
	
	public Child (int number) {
		this.number = number;
	}
	
	/*
	 * Variables marked as final cannot change their
	 * value later in a class/program
	 */
//	public void setNumber(int number) {
//		this.number = number; // error
//	}
	
	
	@Override
	public void overridableMethod() {
		
	}
	
//	public void nonOverriding() { } // error
}
