package ExceptionTest;

import java.io.IOException;

public class B extends A {

	public B() throws IOException {
		super();
		System.out.println("This is Default Constructor of Child Class.");
	}

	@Override
	public void m1() throws IOException {
		System.out.println("This is overriden method from child class.");
		super.m1();
	}

	public static void main(String[] args) {
		try {
			B b = new B();
			b.m1();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}