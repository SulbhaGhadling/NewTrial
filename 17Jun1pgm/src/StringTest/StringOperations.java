package StringTest;

public class StringOperations {
	public static void main(String[] args) {

		String s = "Sulbha";
		String s1 = "sulbha";

		String s2 = new String("Sulbha");
		String s3 = new String("sulbha");

		String St1 = "Strings are having same data value.";
		String St2 = "Strings are not not having same data value";
		String St3 = "Strings are having same data value ignoring the uppercase and lowercase.";
		String St4 = "Strings are not having same data value even after ignoring the uppercase and lowercase.";

		System.out.println("\n\t(A) Trying equals function on String\n");

		if (s.equals(s1)) {
			System.out.println("s is: " + s);
			System.out.println("s1 is: " + s1);
			System.out.println(St1);
		} else {
			System.out.println("s is: " + s);
			System.out.println("s1 is: " + s1);
			System.out.println(St2);
		}
		if (s.equals(s2)) {
			System.out.println("s is: " + s);
			System.out.println("s2 is: " + s2);
			System.out.println(St1);
		} else {
			System.out.println("s is: " + s);
			System.out.println("s2 is: " + s2);
			System.out.println(St2);
		}
		if (s.equals(s3)) {
			System.out.println("s is: " + s);
			System.out.println("s3 is: " + s3);
			System.out.println(St1);
		} else {
			System.out.println("s is: " + s);
			System.out.println("s3 is: " + s3);
			System.out.println(St2);
		}

		System.out.println("\n\t(B)Trying equalsIgnoreCase function on String\n");

		if (s.equalsIgnoreCase(s1)) {
			System.out.println("s is: " + s);
			System.out.println("s1 is: " + s1);
			System.out.println(St3);
		} else {
			System.out.println("s is: " + s);
			System.out.println("s1 is: " + s1);
			System.out.println(St4);
		}
	}
}
