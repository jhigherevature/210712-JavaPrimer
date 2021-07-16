package importing;

/*
 * By default, the JVM will search for code within the
 * same package a class is defined, within the java.lang
 * package (which is automatically imported) and any class
 * that you specifically state an import statement for.
 * Note that the import statement takes precedence over
 * the automatically imported information!
 */
import java.sql.Date;

public class Simulator {
	public static void main(String[] args) {
		Date d = new Date(0);
		
		/*
		 * The Fully Qualified Class Name (FQCN) is
		 * the entire package declaration and the name
		 * of the class when defining a datatype...
		 */
		importing.Date importDate = new importing.Date();
		java.util.Date utilDate = new java.util.Date(0);
	}
}
