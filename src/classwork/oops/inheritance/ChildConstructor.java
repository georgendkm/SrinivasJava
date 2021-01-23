package classwork.oops.inheritance;

public class ChildConstructor extends SuperConstructor {
	
	String state;
	String zip;
	

	public ChildConstructor(String n, String m, String s, String z) {
		super(n, m);
		state=s;
		zip=z;

	}
	
	public ChildConstructor(String n, String m) {
		super(n, m);
	}
	
	public void printChild() {
		System.out.println("State = " + state);
		System.out.println("zip = " + zip);
	}

	public static void main(String[] args) {
		ChildConstructor obj = new ChildConstructor("Trump", "3453453453453", "CA", "25467");
		obj.printData();
		obj.printChild();
		ChildConstructor obj2 = new ChildConstructor("", "");
		obj2.printData();
		obj2.printChild();
	}

}
