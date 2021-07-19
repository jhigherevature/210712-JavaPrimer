package algorithms;

/*
 * A Linear Search Algorithm is a simple process used
 * to look through a collection, one item at a time
 * from start to finish, until a specified value is
 * found. The index of the value is returned if found
 * or a -1 if the value does not exist within the 
 * collection
 */
public class LinearSearch {
	/* Simulator Method */
	public static void main(String[] args) {
		int[] collection = {15, 7, 99, 22, 8, 4, 2, 1};
		System.out.println(linearSearch(7,collection));
		System.out.println(linearSearch(1,collection));
		System.out.println(linearSearch(5,collection));
	}
	
	public static int linearSearch(int target, int[] collection) {
		/*
		 * We will initialize the index to -1 so
		 * that, if no match is found, a -1 will
		 * be returned from this method, indicating
		 * the target value does not exist in the
		 * collection
		 */
		int index = -1;
		for (int i = 0; i < collection.length; i++)
			if (collection[i] == target)
				index = i;
		
		return index;
	}
}
