package com.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.service.ClassMngService;
import com.serviceImpl.ClassMngServiceImpl;

public class AdminController {

	public static void main(String[] args) {
		
		ClassMngService clsMngSer = new ClassMngServiceImpl();
		boolean flag = true;
		Scanner sc;
		while (flag) {
			sc = new Scanner(System.in);
			System.out.println("\n\t\t#### **** M E N U **** ####");
			System.out.println("1. Adding Courses");
			System.out.println("2. Displaying Courses");
			System.out.println("3. Adding Faculties");
			System.out.println("4. Displaying Faculties");
			System.out.println("5. Adding Batches");
			System.out.println("6. Displaying Batches");
			System.out.println("7. Adding Students");
			System.out.println("8. Displaying Students");
			System.out.println("9. Exit from Class Management System");
			System.out.println("Enter your choice from above Menu: ");
			int ch = 0;
			try {
				ch = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Please Enter valid choice from MENU.");
				continue;
			}
			switch (ch) {
			case 1:
				clsMngSer.addCourse();
				break;
			case 2:
				clsMngSer.displayCourse();
				break;
			case 3:
				clsMngSer.addFaculty();
				break;
			case 4:
				clsMngSer.displayFaculty();
				break;
			case 5:
				clsMngSer.addBatch();
				break;
			case 6:
				clsMngSer.displayBatch();
				break;
			case 7:
				clsMngSer.addStudent();
				break;
			case 8:
				clsMngSer.displayStudent();
				break;
			case 9:
				flag = false;
				break;
			default:
				System.out.println("User has entered wrong choice...");
				break;
			}
		}
		System.out.println("Class Management System Exited Successfully !!!");
	}
}