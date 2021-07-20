package one;

public class ChildTwo extends Parent {
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.pub);
		System.out.println(p.pro);
		System.out.println(p.def);
//		System.out.println(p.pri);
	}
}
