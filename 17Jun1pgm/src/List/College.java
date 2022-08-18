package List;

import java.util.ArrayList;
import java.util.List;

public class College {

	public List<Student> addStudent() {
		Student s = new Student();
		s.setRoll(111);
		s.setName("Sulbha");
		s.setAddress("Pune");

		Student s1 = new Student();
		s1.setRoll(222);
		s1.setName("Rucha");
		s1.setAddress("Nigdi");

		Student s2 = new Student();
		s2.setRoll(333);
		s2.setName("Avadhoot");
		s2.setAddress("Chinchwad");

		List<Student> st = new ArrayList<Student>();
		st.add(s);
		st.add(s1);
		st.add(s2);

		return st;
	}
}
