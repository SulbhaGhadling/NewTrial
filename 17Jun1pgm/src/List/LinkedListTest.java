package List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	public static void main(String[] args) {
		List<Integer> roll = new LinkedList<Integer>();

		roll.add(101);
		roll.add(102);
		roll.add(103);
		roll.add(104);
		roll.add(105);

		System.out.println("Roll No.s are: " + roll);
		System.out.println("Total Roll No. are: " + roll.size());
		System.out.println("Is Roll No. list Empty? " + roll.isEmpty());

		System.out.println("*********Roll No.s Display using iterator************");

		Iterator<Integer> itr = roll.iterator();
		System.out.println("Roll No.s are: ");
		while (itr.hasNext()) {
			Integer i = itr.next();
			System.out.println("\t" + i);
		}

		System.out.println("*********Roll No.s Display using for each loop************");
		System.out.println("Roll No.s are: ");
		for (Integer ii : roll) {
			System.out.println("\t" + ii);
		}

		List<String> names = new LinkedList<String>();
		names.add("Sulbha");
		names.add("Rucha");
		names.add("Avadhoot");
		names.add("Ghadling");

		System.out.println("Names are: " + names);
		System.out.println("Total names are: " + names.size());
		System.out.println("Is Names list Empty? " + names.isEmpty());

		System.out.println("*********Names Display using iterator************");
		Iterator<String> itr1 = names.iterator();
		System.out.println("Names are: ");
		while (itr1.hasNext()) {
			String s = itr1.next();
			System.out.println("\t" + s);
		}

		System.out.println("*********Names Display using for each************");
		System.out.println("Names are: ");
		for (String ss : names) {
			System.out.println("\t" + ss);
		}
	}
}
