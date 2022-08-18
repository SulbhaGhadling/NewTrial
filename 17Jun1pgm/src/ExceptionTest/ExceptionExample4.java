package ExceptionTest;

public class ExceptionExample4 {

	static {
		System.out.println("\nThis is Static Block.");
		try {
			Integer i = new Integer("Sulbha");
			System.out.println("Value of i is: " + i);
		} catch (Exception e) {
			System.out.println("Exception Caught in static block.\n" + e);
		}
	}

	ExceptionExample4() {
		System.out.println("\nThis is Constructor of this class.");
		try {
			Integer i = new Integer("Sulbha");
			System.out.println("Value of i is: " + i);
		} catch (Exception e) {
			System.out.println("Exception Caught in constructor of class.\n" + e.getMessage());
		}
	}

	{
		System.out.println("\nThis is non static Block.");
		try {
			Integer i = new Integer("Sulbha");
			System.out.println("Value of i is: " + i);
		} catch (Exception e) {
			System.out.println("Exception Caught in non-static block.\n");
			e.printStackTrace();
		}
	}

	public void m1() {
		System.out.println("\nThis is m1 method.");
		try {
			Integer i = new Integer("Sulbha");
			System.out.println("Value of i is: " + i);
		} catch (Exception e) {
			System.out.println("Exception Caught in m1 method.\n" + e);
		}
	}

	public static void main(String[] args) {
		System.out.println("\nThis is main method.");
		try {
			Integer i = new Integer("Sulbha");
			System.out.println("Value of i is: " + i);
		} catch (Exception e) {
			System.out.println("Exception Caught in main method.\n" + e.getMessage());
		}
		ExceptionExample4 examp4 = new ExceptionExample4();
		examp4.m1();
	}
}
