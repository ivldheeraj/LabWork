/*
 * Create a method which accepts a hash map and return the values of the map in sorted order as a List.
 * 
 */
package lab6;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Exercise1 {

	public static List<Entry<String, Integer>> getValues(HashMap<String, Integer> hashMap) {

		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hashMap.entrySet());

		Collections.sort(list, (s1, s2) -> s1.getValue().compareTo(s2.getValue()));
		
		return list;

	}
	
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("nine", 9);
		hashMap.put("Two", 2);
		hashMap.put("Four", 4);
		hashMap.put("Seven", 7);
		hashMap.put("Five", 5);
		hashMap.put("Three", 3);
		hashMap.put("Six", 6);
		
		
		List<Entry<String, Integer>> hm1 = getValues(hashMap);

		System.out.println("---------After sorting-------");
		for (Map.Entry<String, Integer> entry : hm1) {
			System.out.println("Key =   " + entry.getKey() + "    Value =   " + entry.getValue());
		}

	}
}
