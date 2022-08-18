package typecast;

public class widecasting {

	public static void main(String[] args) {
		int age = 38;

		double specific_age = 38.4;

		System.out.println("Age in integer is: " + age);
		System.out.println("Specific Age in double is: " + specific_age);

		specific_age = age;
		System.out.println("Specific Age in double from inetger: " + specific_age);

	}

}
