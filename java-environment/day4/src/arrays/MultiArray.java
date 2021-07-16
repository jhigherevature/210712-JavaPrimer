package arrays;

/*
 * We can create multi-dimensional arrays by including additional
 * square brackets during the declaration of the array itself
 */
public class MultiArray {
	public static void main(String[] args) {
		int[][] numbers = new int[3][5];
		//						   0		 1			2
		//						0,1,2,3   0,1,2,3   0  1  2  3
		numbers = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println(numbers[1][2]);
		//														0														
		//											  0		    1		   2
		//											0,1,2   0  1   2	0  1  2
		int[][][] coordinates = new int[][][] {   {{1,2,3},{11,12,13},{21,22,23}} ,   {{4,5,6},{14,15,16},{24,25,26}},{{7,8,9},{17,18,19},{27,28,29}}
												};
	}
}
