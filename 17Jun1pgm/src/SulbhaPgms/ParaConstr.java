package SulbhaPgms;

public class ParaConstr extends Object {

	public ParaConstr() {
		// TODO Auto-generated constructor stub
		System.out.println("In Parent Constructor");
	}

	public ParaConstr(int i, double d) {
		// TODO Auto-generated method stub
		this(19, 'G');
		System.out.println("In Parent Class: int Value is: " + i + " and double Value is: " + d);
	}

	public ParaConstr(int i, char c) {
		// TODO Auto-generated method stub
		this(19.84, 'R');
		System.out.println("In Parent Class: int Value is: " + i + " and char Value is: " + c);
	}

	public ParaConstr(double d, char c) {
		// TODO Auto-generated method stub
		this();
		System.out.println("In Parent Class: double Value is: " + d + " and char Value is: " + c);
	}

}
