package ExceptionTest;

public class ExceptionExample7 {

	public static void main(String[] args) {
		try {
			Integer i = new Integer("Sulbha");
			System.out.println("Value of i is: " + i);

			int ii;
			ii = 10 / 5;
			System.out.println("Value of i is: " + ii);

			String s = args[2];
			System.out.println("Value of i is: " + s);

		} catch (ArrayIndexOutOfBoundsException e1) { //args
			System.out.println(e1);
		} catch (NumberFormatException e2) { //Int String 
			System.out.println(e2);
		} catch (ArithmeticException e4) { //divide by zero
			System.out.println(e4);
		}
	}
}
