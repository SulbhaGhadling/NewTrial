package List;

import java.util.ArrayList;
import java.util.List;

public class CountryList {
	public List<List<List<String>>> add() {

		List<String> Pune = new ArrayList<String>();
		Pune.add("Bhor");
		Pune.add("Khed");
		Pune.add("Maval");

		List<String> Mumbai = new ArrayList<String>();
		Pune.add("Kurla");
		Pune.add("Dadar");
		Pune.add("Nerul");

		List<String> Satara = new ArrayList<String>();
		Pune.add("Karad");
		Pune.add("Khatav");
		Pune.add("Man");

		List<List<String>> MH = new ArrayList<List<String>>();
		MH.add(Mumbai);
		MH.add(Pune);
		MH.add(Satara);

		List<String> Belgaum = new ArrayList<String>();
		Pune.add("Gokak");
		Pune.add("Athani");
		Pune.add("Chikodi");

		List<String> Dharwad = new ArrayList<String>();
		Pune.add("Hubali");
		Pune.add("Gadag");
		Pune.add("Kallur");

		List<String> Udupi = new ArrayList<String>();
		Pune.add("Yellur");
		Pune.add("Kudi");
		Pune.add("Shirva");

		List<List<String>> KA = new ArrayList<List<String>>();
		KA.add(Belgaum);
		KA.add(Dharwad);
		KA.add(Udupi);

		List<List<List<String>>> india = new ArrayList<List<List<String>>>();
		india.add(MH);
		india.add(KA);

		return india;
	}

	public static void main(String[] args) {
		CountryList world = new CountryList();
		List<List<List<String>>> ww = world.add();

		for (List<List<String>> states : ww) {
			for (List<String> Dist : states) {
				for (String city : Dist) {
					System.out.println(city);
				}
			}
		}
	}
}