package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List li = new ArrayList();
		li.add("Mrs.");
		li.add("Sulbha");
		li.add("Ghadling");
		li.add(null);
		li.add(38);
		li.add("ss@gmail.com");
		li.add("26.2.1984");
		li.add(null);
		li.add(38);

		System.out.println("Size of List is: " + li.size());
		System.out.println(li);
		System.out.println("My Name is: " + li.get(0) + " " + li.get(1) + " " + li.get(2));
		System.out.println("My Email ID is: " + li.get(5));

		Iterator itr = li.iterator();
		while (itr.hasNext()) {
			Object ob = itr.next();
			System.out.println("\t" + ob);
		}
	}
}
