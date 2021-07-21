package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class UsingCollections {
	public static void main(String[] args) {
//		useList();
//		useSet();
		useQueue();
	}
	
	public static void useList() {
		System.out.println("::: LISTS :::");
		List<String> alist = new ArrayList<String>();
		alist.add("Assembly");
		alist.add("Binary");
		alist.add("Compile");
		alist.add("Compile");
		alist.add("Compile");
		alist.add("DataStructure");
		alist.add("Functions");
		System.out.println(alist);
		alist.remove(0); // remove an index
		System.out.println(alist);
		alist.remove("Compile"); // remove an element
		System.out.println(alist);
	}
	
	public static void useSet() {
		System.out.println("::: SETS :::");
		Set<String> hSet = new HashSet<String> ();
		hSet.add("Assembly");
		hSet.add("Binary");
		hSet.add("Compile");
		hSet.add("Compile");
		hSet.add("Compile");
		hSet.add("DataStructure");
		hSet.add("Function");
		System.out.println(hSet);
		hSet.remove("Compile");
		System.out.println(hSet);
	}

	public static void useQueue() {
		System.out.println("::: QUEUES :::");
		Queue<String> pQue = new PriorityQueue<String>();
		pQue.add("Assembly");
		pQue.add("Binary");
		pQue.add("Compile");
		pQue.add("Compile");
		pQue.add("Compile");
		pQue.add("DataStructure");
		pQue.add("Function");
		System.out.println(pQue);
		pQue.poll();	// remove 'head' element
		System.out.println(pQue);
	}
}
