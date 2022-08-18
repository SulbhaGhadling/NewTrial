package List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class NestedList {
	public static void main(String[] args) {
		List<String> IT_Div = new LinkedList<String>();
		IT_Div.add("IT_A");
		IT_Div.add("IT_B");

		List<String> Comp_Div = new LinkedList<String>();
		Comp_Div.add("Comp_C");
		Comp_Div.add("Comp_D");

		List<String> Mech_Div = new LinkedList<String>();
		Mech_Div.add("Mech_E");
		Mech_Div.add("Mech_F");

		List<String> Civil_Div = new LinkedList<String>();
		Civil_Div.add("Civil_G");
		Civil_Div.add("Civil_H");

		System.out.println("IT Divisions are: ");
		for (String s : IT_Div) {
			System.out.println(s);
		}

		List<List<String>> newDept = new LinkedList<List<String>>();
		newDept.add(IT_Div);
		newDept.add(Comp_Div);

		List<List<String>> oldDept = new LinkedList<List<String>>();
		oldDept.add(Mech_Div);
		oldDept.add(Civil_Div);

		System.out.println("New Dept's classes : ");
		for (List<String> ss : newDept) {
			System.out.println(ss);
		}

		List<List<List<String>>> college = new LinkedList<List<List<String>>>();
		college.add(newDept);
		college.add(oldDept);

		System.out.println("College includes following Dept's classes : ");
		for (List<List<String>> sss : college) {
			System.out.println(sss);
		}

		System.out.println("College includes following Dept's classes : ");
		Iterator<List<List<String>>> itr = college.iterator();
		while (itr.hasNext()) {
			List<List<String>> st = itr.next();
			System.out.println(st);
		}
		System.out.println("\nNested for Loop & for each");
		for (List<List<String>> cc : college) {
			System.out.println(cc);
			for (List<String> nn : newDept) {
				System.out.println(nn);
				for (String sts : Comp_Div) {
					System.out.println(sts);
				} 
			}
		}
	}
}
