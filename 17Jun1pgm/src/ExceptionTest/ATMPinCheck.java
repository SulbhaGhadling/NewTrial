package ExceptionTest;

public class ATMPinCheck extends Exception {
	private String err_msg;

	public ATMPinCheck(String err_msg) {
		super(err_msg);
	}
}
