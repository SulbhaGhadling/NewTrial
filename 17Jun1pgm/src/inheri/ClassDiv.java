package inheri;

public class ClassDiv extends Dept {

	String ClsDiv = "FE A";

	@Override
	public void DipClgShow() {
		ClgNm = "Degree COE";
		dept = "OOP Lang";
		System.out.println("College Name is: " + ClgNm);
		System.out.println("Department Name is: " + dept);
		System.out.println("Class and Division is: " + ClsDiv);
	}

	@Override
	public void DegClgShow() {
		ClgNm = "Diploma COE";
		dept = "JAVA Lang";
		System.out.println("College Name is: " + ClgNm);
		System.out.println("Department Name is: " + dept);
		System.out.println("Class and Division is: " + ClsDiv);
	}

	public static void main(String[] args) {

		College cc = new College(); // Pure object of Parent
		System.out.println("\n\nCollege Name from pure object of parent class: " + cc.ClgNm);
		cc.DipClgShow();
		cc.DegClgShow();

		Dept dd = new Dept(); // Pure object of child
		System.out.println("\n\nCollege Name from pure object of child class: " + dd.ClgNm);
		dd.DipClgShow();
		dd.DegClgShow();

		College ccdd = new Dept(); // Object of child covering main parent
		System.out.println("\n\nCollege Name from child class returning parent class: " + ccdd.ClgNm);
		ccdd.DipClgShow();
		ccdd.DegClgShow();

		ClassDiv cd = new ClassDiv(); // Pure object of child
		System.out.println("\n\nCollege Name from pure object of mediater class: " + cd.ClgNm);
		System.out.println("Department Name from pure object of mediater class: " + cd.dept);
		cd.DipClgShow();
		cd.DegClgShow();

		Dept cdd = new ClassDiv(); // Object of child covering middle parent
		System.out.println("\n\nCollege Name from pure object of mediater class: " + cdd.ClgNm);
		System.out.println("Department Name from pure object of mediater class: " + cdd.dept);
		cdd.DipClgShow();
		cdd.DegClgShow();
	}

}
