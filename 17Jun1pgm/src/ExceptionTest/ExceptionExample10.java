package ExceptionTest;

public class ExceptionExample10 {

	public static void m1(int age) {
		if (age < 18) {
			throw new ArithmeticException("Person is not eligible for voting.");
		} else {
			System.out.println("Person is eligible for voting.");

		}
		throw new NullPointerException("s is NULL.");
	}

	public static void m2(String s) throws ArithmeticException {
		int total;
		total = 200 / 0;
		throw new ArithmeticException("\tSulbha's Msg: Divide by Zero Error.");
			
//		try {
//			s.length();
//		} catch (NullPointerException e) {
//			throw new NullPointerException("s is NULL." + e.getLocalizedMessage());
//		}
	}

	public static void main(String[] args) {
		ExceptionExample10 ex10 = new ExceptionExample10();
		// ex10.m1(19);
		try {
			ex10.m2(args[2]);
		} catch (ArithmeticException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}