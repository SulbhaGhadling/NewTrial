package SerialTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ApptOffice {

	public static void main(String[] args) throws IOException {

		FlatInfo FI1 = new FlatInfo(702, 'A', "Ghadling");
		FlatInfo FI2 = new FlatInfo(1, 'B', "Solay");

		FileOutputStream fio = new FileOutputStream("RamtirthFile1.txt");
		ObjectOutputStream out = new ObjectOutputStream(fio);

		out.writeObject(FI1);
		out.writeObject(FI2);
		out.flush();
		out.close();

		System.out.println("Encryption Done.");
	}

}
