package ComparableComparatorTest;

import java.util.Comparator;

public class EmployeeDesignationCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.EmpDesignation.compareTo(o2.EmpDesignation);
	}

}
