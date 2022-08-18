package InterfaceExample;

public class I123 implements i3 {

	@Override
	public void StaffNmShow() {
		System.out.println("\nPrincipal Name is: " + StaffNm);

	}

	@Override
	public void HODNmShow() {
		System.out.println("\nHOD Name is: " + HODNm);

	}

	@Override
	public void PrinciNmShow() {
		System.out.println("\nStaff Name is: " + PrinciNm);

	}

	public static void main(String[] args) {

		Object obj;

		i1 i11 = new I123(); // object of child class returning interface who is parent
		i11.PrinciNmShow();

		i2 i22 = new I123();
		i22.HODNmShow();
		i22.PrinciNmShow();

		i3 i33 = new I123();
		i33.StaffNmShow();
		i33.HODNmShow();
		i33.PrinciNmShow();

		I123 i123 = new I123();
		i123.PrinciNmShow();
		i123.HODNmShow();
		i123.StaffNmShow();
	}

}
