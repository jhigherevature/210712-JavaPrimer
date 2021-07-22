package comparisons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * The 'Arrays' class is a utility class that provides
 * functionality and utility methods that can be used
 * with Array Objects. Some of this functionality includes
 * sorting elements, and printing all elements of the Array
 * to the console.
 * 
 * The 'Collections' class (with an 's') is a utility class
 * that provides functionality and utility methods that can
 * be used with objects that inherit from the Collection
 * Interface. Some of this functionality includes sorting, 
 * shuffling, and clearing.
 */
public class Simulator {
	public static void main(String[] args) {
		Data d1 = new Data(1, 4.5);
		Data d2 = new Data(17, 99.2);
		Data d3 = new Data(7, 14.6);
		Data d4 = new Data(81, 9.9);
		Data d5 = new Data(37, 103.4);
		Data[] datas = {d1, d2, d3, d4, d5};
		System.out.println(datas);
		System.out.println("COMPARABLE INTERFACE:");
		System.out.println("BEFORE SORT:");
		for (Data d : datas) {
			System.out.println(d);
		}
		System.out.println(Arrays.toString(datas));
		Arrays.sort(datas);
		System.out.println("AFTER SORT:");
		System.out.println(Arrays.toString(datas));
		
		ArrayList<Data> dlist = new ArrayList<Data>();
		dlist.add(d1);
		dlist.add(d2);
		dlist.add(d3);
		dlist.add(d4);
		dlist.add(d5);
		System.out.println("COMPARATOR INTERFACE");
		System.out.println("NUM COMPARATOR [BEFORE]");
		System.out.println(dlist);
		System.out.println("NUM COMPARATOR [AFTER]");
		Collections.sort(dlist, new NumComparator());
		System.out.println(dlist);
		
		System.out.println("WEIGHT COMPARATOR [BEFORE]");
		System.out.println(dlist);
		System.out.println("WEIGHT COMPARATOR [AFTER]");
		Collections.sort(dlist, new WeightComparator());
		System.out.println(dlist);
	}
}
