package ExceptionTest;

public class ExceptionExample2 {
	
	public static void main(String[] args) {

		try {
			int i;
			i = 10 / 0;
			System.out.println("Value of i is: " + i);
		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println(e);
		}
	}
}