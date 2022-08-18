package com.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArrayListintoSet {
	public static void main(String[] args) {
		Set set1 = new HashSet<>();
		set1.add("Mrs.");
		set1.add("Sulbha");
		set1.add("Ghadling");
		set1.add(null);
		set1.add(38);
		set1.add("ss@gmail.com");
		set1.add("26.2.1984");
		set1.add(null);
		set1.add(38);

		System.out.println(set1);

		System.out.println("**********Display Using For Each**************");

		for (Object o : set1) {
			System.out.println(o);
		}

		System.out.println("**********Display Using Iterator**************");

		Iterator itr = set1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
