package classwork.oops;

public class AccessModifiers {

	public int a = 45; // entire world (Project)
	private int b = 10; // only with in class
	int c = 5; // package private - only with in this package
	
	public static int s = 20;
	
	public void printA() {
		System.out.println(" a = " + a);
	}
	private void printB() {
		System.out.println(" b = " + b);
	}
	
	void printC() {
		System.out.println(" c = " + c);
	}
	
	public int indirectPrivate() {
		System.out.println(" b = " + b);
		return b;
	}

	public static void hello() {
		System.out.println(" Hello all!");
	}
	public static void main(String[] args) {
		AccessModifiers am = new AccessModifiers();
		am.a = 20;
		am.b = 50;
		am.c = 60;
		System.out.println(am.a);
		am.printA();
		am.printB();
		am.printC();
		
		System.out.println(s);
		s = 20;
		AccessModifiers.hello();
	}

}
