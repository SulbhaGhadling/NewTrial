package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(12, "Pune");
		map1.put(14, "PCMC");
		// map1.put(null, null);
		map1.put(1, "Mumbai");
		map1.put(11, "Satara");
		map1.put(10, "Sangli");
		// map1.put(null, null); // only 1 null key value is allowed so this entry is
		// not considered.

		System.out.println(map1);
		System.out.println(map1.get(11));
		System.out.println("Size of Map is: " + map1.size());
		System.out.println("Is 13 key available: " + map1.containsKey(13));
		System.out.println("Is Bombay value available: " + map1.containsValue("Bombay"));
		System.out.println("Is Map empty? " + map1.isEmpty());

		Set<Integer> sets = map1.keySet();

		System.out.println("**********Using For Each Loop with keySet Method***************");
		for (Integer i : sets) {
			System.out.println(i + "\t" + map1.get(i));
		}

		System.out.println("**********Using iterator with keySet Method***************");
		System.out.println(sets);
		Iterator<Integer> itr = sets.iterator();
		while (itr.hasNext()) {
			int key = itr.next();
			System.out.println(key + "\t" + map1.get(key));
		}

		System.out.println("**********Using For Each Loop with entrySet Method***************");
		for (Map.Entry<Integer, String> e : map1.entrySet()) {
			System.out.println(e.getKey() + "\t" + e.getValue());
		}

		System.out.println("**********Using iterator with entrySet Method***************");
		Set<Map.Entry<Integer, String>> ee = map1.entrySet();
		Iterator<Map.Entry<Integer, String>> itre = ee.iterator();
		while (itre.hasNext()) {
			Map.Entry<Integer, String> ii = itre.next();
			System.out.println(ii.getKey() + "\t" + ii.getValue());
		}
	}
}
