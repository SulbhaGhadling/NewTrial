package ComparableComparatorTest;

public class StudentCompare implements Comparable<StudentCompare> {
	int ID;
	String Name, Address;

	public StudentCompare(int iD, String name, String address) {
		ID = iD;
		Name = name;
		Address = address;
	}

	@Override
	public int compareTo(StudentCompare o) {
		if (ID > o.ID) {
			return 1;
		} else if (ID == o.ID) {
			return 0;
		} else {
			return -1;
		}
	}

}
