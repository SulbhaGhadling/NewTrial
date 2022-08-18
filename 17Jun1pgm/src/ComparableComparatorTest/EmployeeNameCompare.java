package ComparableComparatorTest;

import java.util.Comparator;

public class EmployeeNameCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.EmpName.compareTo(o2.EmpName);

	}
}
