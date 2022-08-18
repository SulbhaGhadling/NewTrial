package com.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedListintoSet {
	public static void main(String[] args) {
		Set<Integer> set2 = new LinkedHashSet<>();

		set2.add(1102);
		set2.add(397);
		set2.add(45);
		set2.add(null);
		set2.add(129);
		set2.add(3043);
		set2.add(6792);
		set2.add(null);
		set2.add(45);

		System.out.println(set2);

		System.out.println("**********Display Using For Each**************");

		for (Integer i : set2) {
			System.out.println(i);
		}

		System.out.println("**********Display Using Iterator**************");

		Iterator<Integer> itr = set2.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
