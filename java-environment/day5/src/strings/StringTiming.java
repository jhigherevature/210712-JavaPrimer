package strings;

public class StringTiming {
	public static int n = 300_000;
	
	public static void main(String[] args) {
		manyString();
		manyStringBuilder();
		manyStringBuffer();
	}
	
	public static void manyString() {
		String s = "";
		long start = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			s += "a";
		}
		long end = System.currentTimeMillis();
		System.out.println("manyStrings took: " + (end-start) + " ms");
	}
	
	public static void manyStringBuilder() {
		StringBuilder sb = new StringBuilder("");
		long start = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println("manyStringBuilder took: " + (end-start) + " ms");
	}
	
	public static void manyStringBuffer() {
		StringBuffer sb = new StringBuffer("");
		long start = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println("manyStringBuffer took: " + (end-start) + " ms");
	}
}
