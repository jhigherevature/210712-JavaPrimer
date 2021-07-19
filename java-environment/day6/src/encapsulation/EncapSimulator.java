package encapsulation;

public class EncapSimulator {
	private String pri = "Private String";
	String def = "Default/Package-private String";
	protected String pro = "Protected String";
	public String pub = "Public String";
	
	public static void main(String[] args) {
		EncapSimulator ec = new EncapSimulator();
		System.out.println(ec.pri);
		System.out.println(ec.def);
		System.out.println(ec.pro);
		System.out.println(ec.pub);
	}
}
