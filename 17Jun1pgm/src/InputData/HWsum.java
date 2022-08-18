//calculate sum from 101 to 199 using for, while loops

package InputData;

public class HWsum {

	public static void main(String[] args) {

		int sum = 0, i;

		for (i = 101; i <= 199; i++) {

			sum = sum + i;
		}

		System.out.println("Using For Loop");
		System.out.println("\tSum of numbers from 101 to 199 is: " + sum);

		i = 101;
		sum = 0;
		while (i <= 199) {
			sum = sum + i;
			i++;
		}
		System.out.println("Using While Loop");
		System.out.println("\tSum of numbers from 101 to 199 is: " + sum);
	}
}