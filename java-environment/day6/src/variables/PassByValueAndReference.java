package variables;

/*
 * Pass-By-Value and Pass-By-Reference are terms that
 * are used to describe how information is given to 
 * methods/functions of different programming languages.
 * 
 * Java is a Pass-By-Value Language!!!
 * 
 * Pass-By-Value : When arguments are used with method/function
 * invocation. We only provide the data within the variables
 * that are used, not the specific variable reference.
 * 
 * Pass-By-Reference : When arguments are used with a method/function
 * the actual variable is altered, because the method has direct
 * access to the variable that is used as an argument.
 */
public class PassByValueAndReference {
	public static void main(String[] args) {
		int x = 10;
		modify (x);
		System.out.println(x); // 10
		
		Data d = new Data(10);
		System.out.println(d.id); // 10
		modifyData(d);
		System.out.println(d.id); // 10
	}
	
	public static int modify (int a) {
		a = 5;
		return a;
	}
	
	/*
	 * In the example below, we are manipulating the value
	 * of the Reference variable below, NOT because we are
	 * directly referencing the variable, but rather, because
	 * the value of a reference variable in Java is a memory
	 * address. This is very similar to a pass-by-reference
	 * language, however, we are only pointing to the same
	 * object, we are NOT changing anything related to the
	 * reference variable used as an argument.
	 */
	public static void modifyData(Data data) {
		data.id = 100;
	}
}
