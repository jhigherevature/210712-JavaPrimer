package two;

import one.Parent;

public class Simulator extends Child {
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.pub);
//		System.out.println(p.pro); // error
		
		Child c = new Child();
		System.out.println(c.pub);
//		System.out.println(c.pro); // error
		/*
		 * The following is accessible, NOT because of inheritance,
		 * but because the Child class and Simulator exist within
		 * the same package
		 */
		System.out.println(c.childPro);
		
		Simulator s = new Simulator();
		/*
		 * We have access to the field 'pro' ultimately coming
		 * from the Parent class, through inheritance from the
		 * child class
		 */
		System.out.println(s.pro);
	}
}
