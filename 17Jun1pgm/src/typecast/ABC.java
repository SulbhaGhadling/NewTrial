package typecast;

public class ABC {

	public A m4() {
		// A a = new A();
		// B b = new B();
		C c = new C();
		// return a;
		// return b;
		return c;
	}

	public static void main(String[] args) {
		ABC abc = new ABC();

		A aa = abc.m4();

		System.out.println(aa.i);
		aa.m1();

		B bb = (B) abc.m4();
		System.out.println(bb.i);
		System.out.println(bb.j);
		bb.m1();
		bb.m2();

		C cc = (C) abc.m4();
		System.out.println(cc.i);
		System.out.println(cc.j);
		System.out.println(cc.k);
		cc.m1();
		cc.m2();
		cc.m3();
	}
}
