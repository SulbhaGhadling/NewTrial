package ExceptionTest;

import java.io.IOException;

public class A {
	public A() throws IOException {
		System.out.println("This is Parent Class Default Constructor.");
	}

	public void m1() throws IOException{
		System.out.println("This is Parent Class m1 Method.");
	}
}
