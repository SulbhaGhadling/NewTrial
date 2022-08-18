package InterfaceExample;

public class AdminDept implements EstDept {

	@Override
	public void allotCL() {
		System.out.println("Total Casual Leaves assigned per year are: " + CL);

	}

	@Override
	public void allotML() {
		System.out.println("Total Casual Leaves assigned per year are: " + ML);
	}

	public static void main(String[] args) {
		EstDept est = new AdminDept();
		est.allotCL();
		est.allotML();
	}
}
