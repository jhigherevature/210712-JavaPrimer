package iteration;

import java.util.HashMap;
import java.util.Map;

/*
 * Maps are Data Structures which DO NOT inherit from
 * the collection interface directly, but rather utilize
 * other collection objects which do inherit from the 
 * Collection interface in order to structure how the map 
 * stores and manages its own data.
 * 
 * Maps use key-value pairs to organize held data. The
 * Keys are a Set (non-duplicated) of values while the
 * values themselves are another type of collection 
 * depending on the type of Map created.
 */
public class MapIteration {
	public static void main(String[] args) {
		System.out.println("::: Maps :::");
		Map<String, Integer> hMap = new HashMap<String, Integer>();
		hMap.put("Assembly", 1);
		hMap.put("Binary", 2);
		hMap.put("Compile", 3);
		hMap.put("Compile", 4);
		hMap.put("Compile", 5);
		hMap.put("DataStructure", 6);
		hMap.put("Function", 7);

		/*
		 * Iterations using keys - Set
		 */
		System.out.println("Map - KeySet Loop");
		for (String key : hMap.keySet()) {
			System.out.println("Key is: " + key);
		}

		/*
		 * Iteration using values - other Collection
		 */
		System.out.println("Map - Values Loop");
		for (Integer num : hMap.values()) {
			System.out.println("Values: " + num);
		}

		/*
		 * Iteration using Entries (k-v pairs)
		 */
		System.out.println("Map - EntrySet Loop");
		for (Map.Entry<String, Integer> entry : hMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
}
