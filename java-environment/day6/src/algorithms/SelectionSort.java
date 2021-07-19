package algorithms;

/*
 * Selection sort is an iterative sorting algorithm using
 * nested loops. Selection sort organizes elements within
 * an indexed collection by searching for the lowest value
 * element of a collection and moving the value to the 
 * lowest indexed position, then searching for the second
 * lowest and moving it to the second lowest indexed position
 * and so on...  
 */
public class SelectionSort {
	/* Simulator Method */
	public static void main(String args[]) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		
		System.out.println("Given Array");
		printArray(arr);
		
		SelectionSort ss = new SelectionSort();
		ss.selectionSort(arr);
		
		System.out.println("Sorted array");
		printArray(arr);
	}
	
	/* A utility function to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	/* Selection Sort Algorithm */
	void selectionSort(int[] arr) {
		/*
		 * The outer loop ensures that we look
		 * through every item of our collection 
		 */
		for (int i = 0; i < arr.length-1; i++) {
			int minIndex = i;
			/*
			 * The inner loop searched for the lowest
			 * value of our collection, and swaps
			 * its position with whatever index we
			 * are currently iterating through, based
			 * on our outer loop
			 */
			for (int j = minIndex+1; j <= arr.length - 1; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			swap(arr, i, minIndex);
		}
	}
	
	void swap (int[] arr, int l_index, int r_index) {
		int temp = arr[l_index];
		arr[l_index] = arr[r_index];
		arr[r_index] = temp;
	}
}
