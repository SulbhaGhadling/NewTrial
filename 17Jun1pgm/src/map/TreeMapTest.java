package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		Map<Integer, String> map3 = new TreeMap<>();
		map3.put(12, "Pune");
		map3.put(14, "PCMC");
		map3.put(1, "Mumbai");
		map3.put(11, "Satara");
		map3.put(10, "Sangli");
		// map3.put(null, null); // only null key value is not allowed so this entry is
		// not considered.

		System.out.println(map3);
		System.out.println(map3.get(11));
		System.out.println("Size of Map is: " + map3.size());
		System.out.println("Is 13 key available: " + map3.containsKey(13));
		System.out.println("Is Bombay value available: " + map3.containsValue("Bombay"));
		System.out.println("Is Map empty? " + map3.isEmpty());

		Set<Integer> keyset3 = map3.keySet();

		System.out.println("**********Using For Each Loop with keySet Method***************");
		for (Integer i3 : keyset3) {
			System.out.println(i3 + "\t" + map3.get(i3));
		}

		System.out.println("**********Using iterator with keySet Method***************");
		Iterator<Integer> itr3 = keyset3.iterator();
		while (itr3.hasNext()) {
			Integer ii3 = itr3.next();
			System.out.println(ii3 + "\t" + map3.get(ii3));
		}

		System.out.println("**********Using For Each Loop with entrySet Method***************");

		for (Map.Entry<Integer, String> i3 : map3.entrySet()) {
			System.out.println(i3.getKey() + "\t" + i3.getValue());
		}

		System.out.println("**********Using iterator with entrySet Method***************");
		Set<Map.Entry<Integer, String>> est3 = map3.entrySet();
		Iterator<Map.Entry<Integer, String>> est3_itr = est3.iterator();
		while (est3_itr.hasNext()) {
			Map.Entry<Integer, String> iii = est3_itr.next();
			System.out.println(iii.getKey() + "\t" + iii.getValue());
		}
	}
}
