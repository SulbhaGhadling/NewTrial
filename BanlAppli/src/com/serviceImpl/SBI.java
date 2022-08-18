package com.serviceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.model.Account;
import com.service.RBI;

public class SBI implements RBI {
	Scanner sc = new Scanner(System.in);
	Account acc = new Account();

	@Override
	public void registerAcc() {
		System.out.println("Enter your name: ");
		acc.setName(sc.next());
		System.out.println("Enter your Address as City: ");
		acc.setAddress(sc.next());
		System.out.println("Enter your Aadhaar Card No. continously: ");
		acc.setAdhaarNo(sc.next());
		System.out.println("Enter your PAN Card No.: ");
		acc.setPANNo(sc.next());
		System.out.println("Enter your Account No.: ");
		acc.setAccNo(getAccNo());
		System.out.println("Enter your Initial Amount to be deposited: ");
		acc.setBalance(getInitialBal());
	}

	private int getAccNo() {
		int accno = 0;
		sc = new Scanner(System.in);
		try {
			accno = new Integer(sc.nextInt());
		} catch (InputMismatchException e) {
			System.out.println("Please Enter integers only.");
			return getAccNo();
		}
		if (isValidAccNo(accno)) {
			return accno;
		} else {
			return getAccNo();
		}
	}

	private boolean isValidAccNo(long acc_no) {
		boolean flag = false;
		if (acc_no > 0) {
			flag = true;
		}
		return flag;
	}

	private long getInitialBal() {
		long initialBal = 0;
		sc = new Scanner(System.in);
		try {
			initialBal = sc.nextLong();
		} catch (InputMismatchException e) {
			System.out.println("Please Enter long integers only.");
			return getInitialBal();
		}
		if (isValidInitialBal(initialBal)) {
			return initialBal;
		} else {
			return getInitialBal();
		}
	}

	private boolean isValidInitialBal(long initial_Bal) {
		boolean flag = false;
		if (initial_Bal > 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public void showAccDetails() {
		System.out.println("Enter Account No. of which details to be shown: ");
		long accNoDetails = sc.nextLong();
		if (accNoDetails == acc.getAccNo()) {
			System.out.println("Account holder Name is: " + acc.getName());
			System.out.println("Account holder Address is: " + acc.getAddress());
			System.out.println("Account holder Adhaar Card No. is: " + acc.getAdhaarNo());
			System.out.println("Account holer PAN Card No. is: " + acc.getPANNo());
			System.out.println("Account No. is: " + acc.getAccNo());
			System.out.println("Account holder Balance is: Rs." + acc.getBalance() + "/-");
		} else {
			System.out.println("Account doesn't exists with given account No. " + accNoDetails + " Sorry !!!");
		}
	}

	@Override
	public void depositAmt() {
		System.out.println("Enter Account No. in which money to be deposited: ");
		long accNoDepo = sc.nextLong();
		if (accNoDepo == acc.getAccNo()) {
			System.out.println("Enter money to be deposited in to account " + accNoDepo + " : ");
			long depo = sc.nextLong();
			long currBal = acc.getBalance();
			long total = currBal + depo;
			acc.setBalance(total);
			System.out.println("Money Rs." + depo + "/- deposited to account No." + accNoDepo + " successfully !!!");
			System.out.println("Your updated balance is: Rs." + acc.getBalance() + "/-");
		} else {
			System.out.println("Account doesn't exists with given account No. " + accNoDepo + " Sorry !!!");
		}
	}

	@Override
	public void withdrawAmt() {
		System.out.println("Enter Account No. from which money to be withdrawn: ");
		long accNowithdraw = sc.nextLong();
		if (accNowithdraw == acc.getAccNo()) {
			System.out.println("Enter money to be withdrawn from account " + accNowithdraw + " : ");
			long withdraw = sc.nextLong();
			long currBal = acc.getBalance();
			long total = currBal - withdraw;
			acc.setBalance(total);
			System.out.println(
					"Money Rs." + withdraw + "/- withdrawn from account No." + accNowithdraw + " successfully !!!");
			System.out.println("Your updated balance is: Rs." + acc.getBalance() + "/-");
		} else {
			System.out.println("Account doesn't exists with given account No. " + accNowithdraw + " Sorry !!!");
		}
	}

	@Override
	public void updateAccDetils() {
		System.out.println("Enter Account No. of which details are to be updated: ");
		long accNoUpdate = sc.nextLong();
		if (accNoUpdate == acc.getAccNo()) {
			System.out.println("\n\t## ** Menu for Account Details Update ** ##");
			System.out.println("1. Update Name");
			System.out.println("2. Update Address");
			System.out.println("3. Cancel Updation");
			System.out.println("Enter Your Choice: ");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter updated name: ");
				acc.setName(sc.next());
				System.out.println("Your Account Name has been successfully updated.");
				break;

			case 2:
				System.out.println("Enter new Address with PINCODE: ");
				acc.setAddress(sc.next());
				System.out.println("Your Account Address has been successfully updated.");
				break;

			case 3:
				System.out.println("Updation of Account has been cancelled from user side");
				break;

			default:
				System.out.println("User has entered wrong choice...");
				break;
			}

		} else {
			System.out.println("Account doesn't exists with given account No. " + accNoUpdate + " Sorry !!!");
		}
	}

	@Override
	public void showbalance() {
		System.out.println("Enter Account No. of which balance to be displayed: ");
		long accBalDisp = sc.nextLong();
		if (accBalDisp == acc.getAccNo()) {
			System.out.println("Balance of Account No. " + accBalDisp + " is : Rs." + acc.getBalance() + "/-");
		} else {
			System.out.println("Account doesn't exists with given account No. " + accBalDisp + " Sorry !!!");
		}
	}
}
