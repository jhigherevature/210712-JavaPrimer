package one;

public class Parent {
	public String pub = "Public";
	protected String pro = "Protected";
	String def = "Package";
	private String pri = "Private";
	
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.pub);
		System.out.println(p.pro);
		System.out.println(p.def);
		System.out.println(p.pri);
	}
}
