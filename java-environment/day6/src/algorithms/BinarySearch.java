package algorithms;

/*
 * A Binary Search Algorithm is a simple searching algorithm
 * used to find a value within a sorted collection. This 
 * algorithm will look at the value, halfway between two indexes
 * and remove half of the remaining values depending on whether
 * the half-way index is greater-than or less-than the value
 * in which we are searching. If the value matches the midpoint
 * index, then we return that index. If the searching value does
 * not exist within the collection, we return -1. 
 */
public class BinarySearch {
	/* Simulator Method */
	public static void main(String[] args) {
		// test collection
		int[] collection = {1, 2, 4, 7, 8, 15, 22, 99};
		
		System.out.println(binarySearch(7,collection));
		System.out.println(binarySearch(22,collection));
		System.out.println(binarySearch(5,collection));
	}
	
	/*
	 * Binary Search algorithms assume that the collection
	 * in question is in sorted order
	 */
	public static int binarySearch(int target, int[] collection) {
		int left = 0;
		/*
		 * Note this array would not work for our binary
		 * search, because it is not sorted.
		 * 
		 * 				length = 5;
		 * 		indexes: 0  1  2  3  4
		 * tempArray = {99,44,11,66,101}
		 * 
		 * collection.length : how many elements in our collection
		 * 		if we subtract 1, we will have the last index
		 * 		of our collection
		 */
		int right = collection.length-1;
		
		while (left <= right) {
			int mid = (right + left)/2;
			if (target < collection[mid])
				right = mid - 1;
			else if (target > collection[mid])
				left = mid + 1;
			else
				return mid;
		}
		
		/*
		 * This return statement is reached only
		 * if the collection is searched fully
		 * and no match is found
		 */
		return -1;
	}
}
