package AbstractExample;

public class ExamDept extends College {

	String DeptNm = "Exam Section";

	@Override
	public void DeptNm() {
		System.out.println("Department Name is: " + DeptNm);

	}

	public static void main(String[] args) {

		College clgExam = new ExamDept(); // parent child mix object

		clgExam.showdata();
		clgExam.DeptNm();
	}
}
