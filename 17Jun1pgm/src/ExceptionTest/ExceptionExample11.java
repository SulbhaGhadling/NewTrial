package ExceptionTest;

public class ExceptionExample11 {
	public static void m1(String s) throws ArithmeticException, ArrayIndexOutOfBoundsException, NumberFormatException{
		Integer i = new Integer(111);
		System.out.println("Value of i is: " + i);

		int ii;
		ii = 10 / 4;
		System.out.println("Value of i is: " + ii);

		System.out.println("Value of i is: " + s);
	}
	public static void main(String[] args) {
		try {
			m1(args[4]);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
