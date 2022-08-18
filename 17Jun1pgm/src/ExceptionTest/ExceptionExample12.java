package ExceptionTest;

import java.util.Scanner;

public class ExceptionExample12 {

	public void pinCheck() throws ATMPinCheck {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the correct ATM Pin: ");
		String s = sc.next();
		if (s.equals("1234")) {
			System.out.println("Entered PIN is correct.");
		} else {
			throw new ATMPinCheck("Entered PIN is incorrect.");
		}
	}

	public static void main(String[] args) {
		ExceptionExample12 ex12 = new ExceptionExample12();
		try {
			ex12.pinCheck();
		} catch (ATMPinCheck e) {
			System.out.println(e);
		}
	}
}
