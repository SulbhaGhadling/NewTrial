package SulbhaPgms;

public class StatPgm {

	static {

		System.out.println("First Static Block");
	}

	public void t1() {

		System.out.println("In t1 Method");

	}

	static {

		System.out.println("Second Static Block");
	}

	public static void main(String[] args) {

		StatPgm sg = new StatPgm();

		System.out.println("In Main Method");
		sg.t1();

	}
}