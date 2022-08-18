package StringTest;

public class MoreStringFunctions {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("MADAM");
		StringBuilder sbb = new StringBuilder("Ghadling");

		sb = sb.reverse();
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sbb);
		System.out.println(sbb.length());
	}
}