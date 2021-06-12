package datastructures;

import java.util.HashMap;

public class hash_map {

	public static void main(String []args) {
		int a = 10;
		int b = 3;
		int c = 88;
		
		//HashMap<Key, Value>
		//K - the type of keys maintained by this map
		//V - the type of mapped values
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("a", a);
		hmap.put("b", b);
		hmap.put("c", 88);
		
		System.out.println(hmap);
		System.out.println("Value at c: " + hmap.get("c"));
	}
}
