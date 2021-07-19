package encapsulation2;

// Need import statement to use code from other package...
import encapsulation.EncapSimulator;

public class Simulator {
	public static void main(String[] args) {
		EncapSimulator ec = new EncapSimulator();
		/*
		 * Default/Package-private can only be accessed within
		 * the same package that the class is declared...
		 */
//		System.out.println(ec.def);
		
		/*
		 * Protected can only be accessed within the same package
		 * that the class is declared OR within subclasses, even
		 * if the subclass is in another package.
		 */
//		System.out.println(ec.pro);
		
		/*
		 * Public variables can be used anywhere within the
		 * project as a whole
		 */
		System.out.println(ec.pub);
	}
}
