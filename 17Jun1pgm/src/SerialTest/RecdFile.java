package SerialTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RecdFile {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("RamtirthFile1.txt");
		ObjectInputStream in = new ObjectInputStream(fis);

		FlatInfo FI11 = (FlatInfo) in.readObject();
		FlatInfo FI22 = (FlatInfo) in.readObject();
		System.out.println("FlatNo.: " + FI11.flatNo + "\nWing: " + FI11.wing + "\nOwner Name: " + FI11.ownerNm);
		System.out.println("\nFlatNo.: " + FI22.flatNo + "\nWing: " + FI22.wing + "\nOwner Name: " + FI22.ownerNm);
		in.close();
		System.out.println("\nDecryption Done.");
	}
}