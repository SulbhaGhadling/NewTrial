package ComparableComparatorTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import List.Student;

public class TestExample {
	public static void main(String[] args) {
		StudentCompare s1 = new StudentCompare(111, "Rucha", "Nigdi");
		StudentCompare s2 = new StudentCompare(222, "Sulbha", "Chinchwad");
		StudentCompare s3 = new StudentCompare(333, "Avadhoot", "Pune");
		StudentCompare s4 = new StudentCompare(111, "Rucha", "Nigdi");
		StudentCompare s5 = new StudentCompare(444, "Ghadling", "India");

		List<StudentCompare> studList = new ArrayList<StudentCompare>();
		studList.add(s1);
		studList.add(s5);
		studList.add(s3);
		studList.add(s4);
		studList.add(s2);

		System.out.println("***********Before Sorting**************");
		for (StudentCompare st : studList) {
			System.out.println(st.ID + "\t" + st.Name + "\t" + st.Address);
		}
		Collections.sort(studList);
		System.out.println("***********After Sorting**************");
		for (StudentCompare st : studList) {
			System.out.println(st.ID + "\t" + st.Name + "\t" + st.Address);
		}
	}
}
