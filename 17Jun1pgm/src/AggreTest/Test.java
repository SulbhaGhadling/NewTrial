package AggreTest;

public class Test {
	public static void main(String[] args) {

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

		System.out.println(e2.getLca().getLid());
		System.out.println(e2.getLca().getLname());

		System.out.println(employee.getEmpid());
		System.out.println(employee.getEmpname());
		System.out.println(employee.getAddress().getCity());
		System.out.println(employee.getAddress().getState());
		System.out.println(employee.getAddress().getPinocode());

	}
}
