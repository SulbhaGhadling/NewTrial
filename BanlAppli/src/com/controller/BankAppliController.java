package com.controller;

import java.lang.invoke.SwitchPoint;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.service.RBI;
import com.serviceImpl.SBI;

public class BankAppliController {
	public static void main(String[] args) {

		RBI rbi = new SBI();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int ch = 0;

		while (flag) {
			System.out.println("\n\t\t#### **** M E N U **** ####");
			System.out.println("1. Registration of new Account");
			System.out.println("2. Display of Account Details");
			System.out.println("3. Money Deposit Service");
			System.out.println("4. Money Withdraw Service");
			System.out.println("5. Account Details Updation");
			System.out.println("6. Account Balance Display");
			System.out.println("7. Exit from Bank Application");
			System.out.println("Enter your choice from above Menu: ");
			sc = new Scanner(System.in);
			try {
				ch = new Integer(sc.nextInt());
			} catch (InputMismatchException e) {
				System.out.println("Please Enter intergers only.");
				continue;
			}

			switch (ch) {
			case 1:
				rbi.registerAcc();
				break;

			case 2:
				rbi.showAccDetails();
				break;

			case 3:
				rbi.depositAmt();
				break;

			case 4:
				rbi.withdrawAmt();
				break;

			case 5:
				rbi.updateAccDetils();
				break;

			case 6:
				rbi.showbalance();
				break;

			case 7:
				flag = false;
				break;

			default:
				System.out.println("User has entered wrong choice...");
				break;

			}
		}
		System.out.println("Bank Application Exited Successfully !!!");
	}
}
