package arrays;

/*
 * Arrays are a Fixed-in-length data structure that allows
 * you to store multiple pieces of the same datatype (known
 * as elements) within a single variable.
 * Arrays are objects, and as such, the variable relating to
 * the array is a reference variable (not a primitive).
 */
public class Basics {
	public static void main(String args[]) {
		/*
		 * There are multiple ways to create arrays.
		 * The first shown here is to create a new
		 * 'empty' array, of a fixed size.
		 */
		int[] numbersOne = new int[5];
		
		/*
		 * The second way is shown here to create an
		 * array of a fixed size, while also assigning
		 * the values to the array
		 */
		int[] numbersTwo = new int[] {4,7,0,12,77};
		
		/*
		 * The third method, known as anonymous array
		 * assignment. An anonymous array is one that
		 * does NOT declare the datatype. Here, the 
		 * dataype can be infered due to the declaration
		 * of our reference variable
		 * 
		 * You can ONLY assign an anonymous array to 
		 * a reference variable, when you declare
		 * the reference variable in the same line!
		 */
		int[] numbersThree = {5,66,80,23,6};
		
		int i = 9;
		i = 1000;
		
		numbersOne = new int[] {1,2,3,4};
//		numbersThree = {1,2,3,4}; // error
		
		/*
		 * When you want to access elements/data within
		 * an Array, you can do so by using the index of
		 * the array.
		 * 
		 * Array Indexing starts at 0
		 */
		System.out.println(numbersThree[0]); // 5
		System.out.println(numbersThree[2]); // 80
		numbersThree[0] = 99;
		System.out.println(numbersThree[0]); // 99
		
		/*
		 * Casing with regard to arrays:
		 * 1 - We cannot cant the array as a whole, to 
		 * another array datatype. (We will talk more
		 * about inheritance later in the program, but
		 * effectively, arrays of different types, do not
		 * share an inheritance heirarchy, so we cannot
		 * cast the array as a whole).
		 * 2 - We CAN cast the individual values within
		 * the array, as shown below:
		 */
		double[] doubles = new double[] {1.0,2.5,7.4};
		numbersThree[0] = (int)doubles[2];
		doubles[0] = numbersThree[1];
		
		int[] numbersFour = numbersThree;
		System.out.println(numbersFour[0]);
		System.out.println(numbersThree[0]);
		numbersFour[0] = 5;
		System.out.println(numbersFour[0]);
		System.out.println(numbersThree[0]);
		numbersFour = new int[] {88,99,102};
		System.out.println(numbersFour[0]);
		System.out.println(numbersThree[0]);
		
		/*
		 * Even though both arrays below have the same
		 * data, there are two objects being created:
		 */
		int numbersFive[] = new int[] {8,6,2,5,5};
		int numbersSix[] = new int[] {8,6,2,5,5};
	}
}
