package ExceptionTest;

public class ExceptionExample9 {
	public static int m1() {
		try {
			int i = 3/1;
			System.out.println(i);
			return 11;
		} catch (ArithmeticException e) {
			System.out.println(e);
			return 22;
		} finally {
			return 33;
		}
	}

	public static void main(String[] args) {
		ExceptionExample9 Ex9 = new ExceptionExample9();
		System.out.println(Ex9.m1());
	}
}
