package List;

import java.util.Iterator;
import java.util.List;

public class University {

	public static void main(String[] args) {
		College clg = new College();
		List<Student> COE = clg.addStudent();

		System.out.println("\t\tUsing For Each Loop");
		for (Student ss : COE) {
			System.out.println(ss.getRoll() + "\t" + ss.getName() + "\t" + ss.getAddress());
		}

		System.out.println("\t\tUsing iterator");
		Iterator<Student> itr = COE.iterator();
		while (itr.hasNext()) {
			Student stud = itr.next();
			System.out.println(stud.getRoll() + "\t" + stud.getName() + "\t" + stud.getAddress());
		}
	}
}
