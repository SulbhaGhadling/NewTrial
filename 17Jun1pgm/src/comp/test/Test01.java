package comp.test;

public class Test01 {

	int id=100; // Global variable

	public void m1() {
		int i = 10; // local variable
		System.out.println("In m1 Method ");
		System.out.println(i);
		Test01 t = new Test01();
		System.out.println(t.id);
	}

	public static void main(String[] args) {

		System.out.println("Starting Main Method ");

		Test01 t1 = new Test01();

		System.out.println(t1.id);
		t1.m1();

	}

	static {
		Test01 t1 = new Test01();
		System.out.println("Trying Static concept" + t1.id);
		int j = 100;
		System.out.println("Trying Local Variable inside static block #Value of j is# : "+j);

	}

	static {
		Test01 t2 = new Test01();
		System.out.println("Second Static Block" + t2.id);

	}

}
