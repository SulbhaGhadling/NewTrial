package ComparableComparatorTest;

import java.util.Comparator;

public class EmployeeIDCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.EmpID > o2.EmpID) {
			return 1;
		} else if (o1.EmpID == o2.EmpID) {
			return 0;
		} else {
			return -1;
		}
	}
	
}
