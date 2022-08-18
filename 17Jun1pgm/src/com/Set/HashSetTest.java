package com.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
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

		System.out.println("**********Display Using For Each**************");

		for (Integer i : set1) {
			System.out.println(i);
		}

		System.out.println("**********Display Using Iterator**************");

		Iterator<Integer> itr = set1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
