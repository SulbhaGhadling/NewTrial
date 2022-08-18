package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapTest {
	public static void main(String[] args) {
		Map<Integer, String> map2 = new LinkedHashMap<>();
		map2.put(12, "Pune");
		map2.put(14, "PCMC");
		map2.put(null, null);
		map2.put(1, "Mumbai");
		map2.put(11, "Satara");
		map2.put(10, "Sangli");
		map2.put(null, null); // only 1 null key value is allowed so this entry is not considered.

		System.out.println(map2);
		System.out.println(map2.get(11));
		System.out.println("Size of Map is: " + map2.size());
		System.out.println("Is 13 key available: " + map2.containsKey(13));
		System.out.println("Is Bombay value available: " + map2.containsValue("Bombay"));
		System.out.println("Is Map empty? " + map2.isEmpty());

		Set<Integer> keyset = map2.keySet();

		System.out.println("**********Using For Each Loop with keySet Method***************");
		for (Integer i : keyset) {
			System.out.println(i + "\t" + map2.get(i));
		}

		System.out.println("**********Using For Each Loop with keySet Method***************");
		Iterator<Integer> itr = keyset.iterator();
		while (itr.hasNext()) {
			Integer ii = itr.next();
			System.out.println(ii + "\t" + map2.get(ii));
		}

		System.out.println("**********Using For Each Loop with entrySet Method***************");
		for (Map.Entry<Integer, String> e2 : map2.entrySet()) {
			System.out.println(e2.getKey() + "\t" + e2.getValue());
		}

		System.out.println("**********Using iterator with entrySet Method***************");
		Set<Map.Entry<Integer, String>> eset = map2.entrySet();
		Iterator<Map.Entry<Integer, String>> est_itr = eset.iterator();
		while (est_itr.hasNext()) {
			Map.Entry<Integer, String> ii = est_itr.next();
			System.out.println(ii.getKey() + "\t" + ii.getValue());
		}
	}
}
