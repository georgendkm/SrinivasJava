package classwork.oops.inheritance;

public class SuperConstructor {
	
	public String name;
	public String mobile;
	
	public SuperConstructor(String n, String m) {
		name = n;
		mobile = m;
	}
	
	public void printData() {
		System.out.println("name = " + name);
		System.out.println("mobile = " + mobile);
	}
	
	public static void main(String[] args) {
		SuperConstructor obj = new SuperConstructor("John", "342342342342");
		obj.printData();
	}

}
