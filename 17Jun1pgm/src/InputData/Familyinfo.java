package InputData;

import java.util.Scanner;

public class Familyinfo {

	String FirstName, LastName, DOB;
	int Age, n;

	public static void main(String[] args) {

		Familyinfo f = new Familyinfo();
		int i = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of family members greater than 0: ");
		f.n = sc.nextInt();

		do {

			System.out.println("\nEnter your First Name: ");
			f.FirstName = sc.next();

			System.out.println("Enter your Last Name: ");
			f.LastName = sc.next();

			System.out.println("Enter your Date of Birthdate: ");
			f.DOB = sc.next();

			System.out.println("Enter your age: ");
			f.Age = sc.nextInt();

			System.out.println("\n\n\t# Entered Information of this family member is as below #");
			System.out.println("\tFirst Name is: " + f.FirstName);
			System.out.println("\tLast Name is: " + f.LastName);
			System.out.println("\tDate of Birth is: " + f.DOB);
			System.out.println("\tAge is: " + f.Age);

			if (f.Age >= 18) {
				System.out.println("This person can vote in the Election.");
			} else {
				System.out.println("This person can't vote in the Election");
			}
			i++;

		} while (i < f.n);
	}
}
