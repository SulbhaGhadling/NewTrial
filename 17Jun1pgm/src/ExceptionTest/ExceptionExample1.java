package ExceptionTest;

public class ExceptionExample1 {

	public static void main(String[] args) {

		try {
			Integer i = new Integer("Sulbha");
			System.out.println("Value of i is: " + i);
		} catch (NumberFormatException e) {
			// e.printStackTrace();
			System.out.println(e);
		}
	}
}
