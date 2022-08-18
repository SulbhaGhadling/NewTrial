package inheri;

public class Dept extends College {

	String dept = "Comp";

	@Override
	public void DipClgShow() {
		ClgNm = "Diploma College 3 yrs";
		System.out.println("College Name is: " + ClgNm);
		System.out.println("Department Name: " + dept);
	}

	@Override
	public void DegClgShow() {
		ClgNm = "Degree College 4 yrs";
		System.out.println("College Name is: " + ClgNm);
		System.out.println("Department Name: " + dept);
	}

	public static void main(String[] args) {

		College c = new College(); // Pure object of Parent
		System.out.println("\n\nCollege Name from pure object of parent class: " + c.ClgNm);
		c.DipClgShow();
		c.DegClgShow();

		Dept d = new Dept(); // Pure object of child
		System.out.println("\n\nCollege Name from pure object of child class: " + d.ClgNm);
		d.DipClgShow();
		d.DegClgShow();

		College cd = new Dept(); // Object of child covering parent
		System.out.println("\n\nCollege Name from child class returning parent class: " + cd.ClgNm);
		cd.DipClgShow();
		cd.DegClgShow();
	}
}
