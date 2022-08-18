package CollectionsTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsMethods {

	public static void main(String[] args) {
		List<Integer> roll = new ArrayList<Integer>();
		roll.add(105);
		roll.add(101);
		roll.add(103);
		roll.add(104);
		roll.add(102);

		System.out.println("********Before Sorting***********" + "\n" + roll);
		Collections.sort(roll);
		System.out.println("********After Sorting***********" + "\n" + roll);

		List<String> StudName = new ArrayList<String>();
		Collections.addAll(StudName, "Sulbha", "Rucha", "Avadhoot", "Ghadling");

		System.out.println("********Before Sorting***********" + "\n" + StudName);
		Collections.sort(StudName);
		System.out.println("********After Sorting***********" + "\n" + StudName);

		List<String> FinalList = Collections.unmodifiableList(StudName);
		//FinalList.add("Family");
		
		Collections.synchronizedList(StudName);
		
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(800);
		set1.add(103);
		set1.add(null);
		set1.add(301);
		set1.add(null);
		set1.add(500);
		set1.add(101);
		set1.add(201);
		set1.add(103);
		set1.add(301);

		System.out.println(set1);
		Set<Integer> Final_set1 = Collections.unmodifiableSet(set1);
		
		System.out.println("**********Display Using For Each**************");

		for (Integer i : set1) {
			System.out.println(i);
		}

		Map<Integer, String> map1 = new HashMap<>();
		map1.put(12, "Pune");
		map1.put(14, "PCMC");
		map1.put(1, "Mumbai");
		map1.put(11, "Satara");
		map1.put(10, "Sangli");

		System.out.println(map1);
		Map<Integer, String> final_map = Collections.unmodifiableMap(map1);
		
		System.out.println("**********Display Using For Each**************");

		
		Set<Integer> mapset = map1.keySet();
		for (Integer ii : mapset) {
			System.out.println(ii+"\t"+map1.get(ii));
		}
	}

}
