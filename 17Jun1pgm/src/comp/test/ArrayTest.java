package comp.test;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int mo_no[] = { 1, 2, 3, 4, 5 };
		int[] mobile = new int[4];	//Array Declaration

		for (int i = 0; i < 5; i++) {
			System.out.println(mo_no[i]);
		}
		System.out.println("Enter 4 integer numbers: ");
		for (int j = 0; j < 4; j++) {
			mobile[j] = sc.nextInt();
		}
		for (int k = 0; k < 4; k++) {
			System.out.println(mobile[k]);
		}
	}
}
