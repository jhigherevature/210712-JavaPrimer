package objects;

public class Example {
	public String name;
	public int age;
	public Example (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		/*
		 * The toString method is called by the println method
		 * from the System.out printStream. As such, any implementation
		 * you provide for the toString method in a class
		 * can be used to display significant information about
		 * a class/object
		 */
//		return "This is the toString method on the Example class";
		return "Example [name="+name+", age="+age+"]";
	}
	
	public boolean equals(Example example) {
		boolean equivalent = true;
		if (!this.name.equals(example.name)) {
			equivalent = false;
		}
		if (!(this.age == example.age)) {
			equivalent = false;
		}
		
		return equivalent;
	}
}
