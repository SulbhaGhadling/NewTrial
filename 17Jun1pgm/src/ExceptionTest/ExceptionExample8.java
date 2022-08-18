package ExceptionTest;

public class ExceptionExample8 {
	public static void main(String[] args) {
		try {
			Integer i = new Integer(11);
			System.out.println("Value of i is: " + i);

			int ii;
			ii = 10 / 4;
			System.out.println("Value of i is: " + ii);

			String s = args[4];
			System.out.println("Value of i is: " + s);

		} catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e4) {
			System.out.println(e4);
		}
	}
}
