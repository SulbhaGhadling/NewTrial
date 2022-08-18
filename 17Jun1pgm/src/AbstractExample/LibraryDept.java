package AbstractExample;

public class LibraryDept extends College {

	String DeptNm = "Central Library";

	@Override
	public void DeptNm() {
		System.out.println("Department Name is: " + DeptNm);

	}

	public static void main(String[] args) {

		College clgLib = new LibraryDept(); // parent child mix object

		clgLib.showdata();
		clgLib.DeptNm();
	}
}
