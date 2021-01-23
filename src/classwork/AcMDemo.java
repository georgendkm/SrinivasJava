package classwork;

import classwork.oops.AccessModifiers;

public class AcMDemo {

	public static void main(String[] args) {
		AccessModifiers am = new AccessModifiers();
		//am.b = 12; // This is private, not allowed outside of class
		//am.printB(); // This is private, not allowed outside of class
		//am.c = 50; // not allowed, they are package private
		//am.printC(); // not allowed, they are package private
		am.a = 120;
		am.printA();
		
		int bval = am.indirectPrivate();
		System.out.println("bVal = " + bval);
		System.out.println(AccessModifiers.s);
	}

}
