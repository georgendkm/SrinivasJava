package classwork.oops;

public class AMDemo {

	public static void main(String[] args) {
		AccessModifiers am = new AccessModifiers();
		//am.b = 20; // This is private, not allowed outside of class
		//am.printB(); //This is private, not allowed outside of class
		
		am.c = 50; // Allowed, they are package private
		am.printC(); // Allowed, they are package private
		
		am.a = 100;
		am.printA();
		System.out.println(AccessModifiers.s);
		AccessModifiers.hello();
	}

}
