package iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteration {
	public static void main(String[] args) {
		System.out.println("::: LISTS :::");
		List<String> alist = new ArrayList<String>();
		alist.add("Assembly");
		alist.add("Binary");
		alist.add("Compile");
		alist.add("Compile");
		alist.add("Compile");
		alist.add("DataStructure");
		alist.add("Functions");
		
		/*
		 * Using lists, we can access the size and indexes
		 * to traverse the collection, similar to Arrays we
		 * have examined in the past
		 */
		for (int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}
		
		System.out.println("List - Enhanced For-Loop");
		for (String name : alist) {
			System.out.println(name);
		}
		
		// Iterator - For Loop
		System.out.println("List - For Loop");
		for (Iterator<String> i = alist.iterator(); i.hasNext(); ) {
			String name = i.next();
			System.out.println(name);
		}

		System.out.println("List - While Loop");
		Iterator<String> aItr = alist.iterator();
		while (aItr.hasNext()) {
			System.out.println(aItr.next());
		}
	}
}
