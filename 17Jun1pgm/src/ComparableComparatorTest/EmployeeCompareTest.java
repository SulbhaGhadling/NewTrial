package ComparableComparatorTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeCompareTest {
	public static void main(String[] args) {
		Employee e1 = new Employee(110, "Sulbha", "Manager");
		Employee e2 = new Employee(220, "Avadhoot", "Asst.Manager");
		Employee e3 = new Employee(330, "Rucha", "Developer");
		Employee e4 = new Employee(110, "Sulbha", "Manager");
		Employee e5 = new Employee(440, "Ghadling", "Trainer");

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);

		System.out.println("***********Before Sorting**************");
		System.out.println("Employee ID\tEmployee Name\t\tEmployee Designation");
		for (Employee e : empList) {
			System.out.println(e.EmpID + "\t\t" + e.EmpName + "\t\t\t" + e.EmpDesignation);
		}

		Collections.sort(empList, new EmployeeNameCompare());

		System.out.println("***********After Sorting by Employee Name**************");
		for (Employee e : empList) {
			System.out.println(e.EmpID + "\t\t" + e.EmpName + "\t\t\t" + e.EmpDesignation);
		}

		Collections.sort(empList, new EmployeeDesignationCompare());

		System.out.println("***********After Sorting by Employee Designation**************");
		for (Employee e : empList) {
			System.out.println(e.EmpID + "\t\t" + e.EmpName + "\t\t\t" + e.EmpDesignation);
		}

		Collections.sort(empList, new EmployeeIDCompare());

		System.out.println("***********After Sorting by Employee ID**************");
		for (Employee e : empList) {
			System.out.println(e.EmpID + "\t\t" + e.EmpName + "\t\t\t" + e.EmpDesignation);
		}
	}
}
