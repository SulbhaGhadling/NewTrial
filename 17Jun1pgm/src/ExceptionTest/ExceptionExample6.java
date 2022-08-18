package ExceptionTest;

public class ExceptionExample6 {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("Outer Try Block Started.");
			Integer i = new Integer(2621984);
			System.out.println("Value of i is: " + i);
			
			try {
				System.out.println("Inner Try Block Started.");
				Integer ii = new Integer("Sulbha");
				System.out.println("Value of ii is: " + ii);
			} catch (NumberFormatException e) {
				System.out.println("Inner Catch Block Started.");
				System.out.println(e);
			} finally {
				//System.exit(0);
				System.out.println("This is inner Finally Block.");
			}
		} catch (NumberFormatException e) {
			System.out.println("Outer catch Block Started.");
			System.out.println(e);
		} finally {
			System.exit(0);
			System.out.println("This is outer Finally Block.");
		}
	}
}
