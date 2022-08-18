package com.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
	public static void main(String[] args) {
		Set<String> set2 = new LinkedHashSet<String>();
		set2.add("JAVA");
		set2.add("CPP");
		set2.add("C");
		set2.add("Python");
		set2.add(null);
		set2.add("Perl");
		set2.add(".net");
		set2.add(null);
		set2.add("CPP");
		set2.add("C");
		set2.add(null);

		System.out.println(set2);

		System.out.println("**********Display Using For Each**************");

		for (String i : set2) {
			System.out.println(i);
		}

		System.out.println("**********Display Using Iterator**************");

		Iterator<String> itr = set2.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
