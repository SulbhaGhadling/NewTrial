package comp.test;

public class Test02 {

	static {
		System.out.println("This is Static Block.");
	}

	Test02() {
		System.out.println("This is Constructor of this class.");
	}

	{
		System.out.println("This is non static Block.");
	}

	public void m1() {
		System.out.println("This is m1 method.");
	}

	public static void main(String[] args) {
		System.out.println("This is main method.");

		// Object Creation
		Test02 t02 = new Test02();
		t02.m1();
	}
}
