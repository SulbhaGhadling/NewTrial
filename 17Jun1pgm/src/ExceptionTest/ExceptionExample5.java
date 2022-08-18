package ExceptionTest;

public class ExceptionExample5 {
	public static void main(String[] args) {
		try {
			Integer i = new Integer(2621984);
			System.out.println("Value of i is: " + i);
		} catch (NumberFormatException e) {
			System.out.println(e);
		} finally {
			System.out.println("This is Finally Block.");
		}

		try {
			Integer i = new Integer("Sulbha");
			System.out.println("Value of i is: " + i);
		} catch (NumberFormatException e) {
			System.out.println(e);
		} finally {
			System.out.println("This is Finally Block.");
		}
	}
}
