package AggreTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Encry {
	public static void main(String[] args) throws IOException {

		Address address = new Address();
		address.setCity("Pune District");
		address.setState("Maharashtra State");
		address.setPinocode("PIN : 411033");

		Location location = new Location();
		location.setLid(702);
		location.setLname("Chinchwad");

		Employee employee = new Employee();
		employee.setEmpid(123);
		employee.setEmpname("Sulbha");
		employee.setAddress(address);
		employee.setLca(location);

		Employee e2 = new Employee();
		e2.setEmpid(102);
		e2.setEmpname("test");
		e2.setLca(location);

		FileOutputStream fio = new FileOutputStream("RamtirthFile2.txt");
		ObjectOutputStream out = new ObjectOutputStream(fio);

		out.writeObject(employee);
		out.writeObject(e2);
		out.flush();
		out.close();

		System.out.println("Encryption Done.");

	}

}
