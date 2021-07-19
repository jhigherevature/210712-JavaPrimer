package encapsulation;

public class SimulatorTwo {
	public static void main(String[] args) {
		EncapSimulator ec = new EncapSimulator();
		/*
		 * Private variables can ONLY be accessed directly within
		 * the class they are declared
		 */
//		System.out.println(ec.pri); // Error
		System.out.println(ec.def);
		System.out.println(ec.pro);
		System.out.println(ec.pub);
	}
}
