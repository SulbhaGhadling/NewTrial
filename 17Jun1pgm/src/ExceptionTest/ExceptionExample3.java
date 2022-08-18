package ExceptionTest;

public class ExceptionExample3 {

	public static void main(String[] args) {

		try {
			String s = args[1];
			System.out.println("Value of i is: " + s);
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Exception Occurred. " + e);
		}
	}
}
