package SulbhaPgms;

public class superandthis extends ParaConstr {

	public superandthis() {
		// TODO Auto-generated constructor stub
		this("Sulbha");
		System.out.println("In Child Constructor");
	}

	public superandthis(boolean b) {
		// TODO Auto-generated constructor stub
		super(84, 26.4);
		System.out.println("In Child Class: boolean Value is: " + b);
	}

	public superandthis(double d) {
		// TODO Auto-generated constructor stub
		this(true);
		System.out.println("In Child Class: double Value is: " + d);
	}

	public superandthis(String s) {
		// TODO Auto-generated constructor stub
		this(38.4);
		System.out.println("In Child Class: String Value is: " + s);
	}

	public static void main(String[] args) {

		superandthis st = new superandthis();

	}
}
