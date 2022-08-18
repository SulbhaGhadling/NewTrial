package AggreTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import SerialTest.FlatInfo;

public class Decry {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("RamtirthFile2.txt");
		ObjectInputStream in = new ObjectInputStream(fis);

		Employee e = (Employee) in.readObject();
		System.out.println("Employee ID is: " + e.getEmpid());
		System.out.println("Employee Name is: " + e.getEmpname());
		System.out.println("Employee City is: " + e.getAddress().getCity());
		System.out.println("Employee City PINCode is: " + e.getAddress().getPinocode());
		System.out.println("Employee State is: " + e.getAddress().getState());
		System.out.println("Employee Location ID is: " + e.getLca().getLid());
		System.out.println("Employee Location Name is: " + e.getLca().getLname());

		in.close();
		System.out.println("\nDecryption Done.");
	}
}