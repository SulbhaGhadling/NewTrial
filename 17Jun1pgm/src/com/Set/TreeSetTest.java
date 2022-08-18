package com.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		Set<String> set3 = new TreeSet<String>();
		set3.add("JAVA");
		set3.add("CPP");
		set3.add("C");
		set3.add("Python");
		// set3.add(null); //as null values are not allowed here, we can't include this
		// line
		set3.add("Perl");
		set3.add(".net");
		// set3.add(null);//as null values are not allowed here, we can't include this
		// line
		set3.add("CPP");
		set3.add("C");
		// set3.add(null);//as null values are not allowed here, we can't include this
		// line

		System.out.println(set3);

		System.out.println("**********Display Using For Each**************");

		for (String i : set3) {
			System.out.println(i);
		}

		System.out.println("**********Display Using Iterator**************");

		Iterator<String> itr = set3.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
