package SulbhaPgms;

public class StaticVariablePgm {

	int FlatNo;
	String OwnerName;

	static String ApptName = "Shivtirth";

	public void Namechange() {
		ApptName = "Ramtirth";
	}

	public static void Address() {
		System.out.println("Chinchwad");
	}

	public static void main(String[] args) {

		StaticVariablePgm SVP = new StaticVariablePgm();

		System.out.println("First Flat Owner");

		SVP.FlatNo = 702;
		SVP.OwnerName = "Ghadling";

		System.out.println("Flat No.: " + SVP.FlatNo);
		System.out.println("Owner Name: " + SVP.OwnerName);
		System.out.println("Previous Appartment Name: " + ApptName);
		SVP.Namechange();
		System.out.println("\t#After changing Static variable#");
		System.out.println("New Appartment Name: " + ApptName);
		StaticVariablePgm.Address();

		StaticVariablePgm SVP1 = new StaticVariablePgm();

		System.out.println("\nSecond Flat Owner");

		SVP1.FlatNo = 701;
		SVP1.OwnerName = "Kavi";
		SVP1.Namechange();

		System.out.println("Flat No.: " + SVP1.FlatNo);
		System.out.println("Previous Appartment Name: " + ApptName);
		SVP.Namechange();
		System.out.println("\t*After changing Static variable*");
		System.out.println("New Appartment Name: " + ApptName);
		StaticVariablePgm.Address();
	}

}
