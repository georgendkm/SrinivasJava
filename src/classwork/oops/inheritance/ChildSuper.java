package classwork.oops.inheritance;

public class ChildSuper extends SuperBase{
	
	int i = 20;
	
	public void checkout() {
		System.out.println("Child check out");
	}
	
	public void login() {
		System.out.println("child login");
	}

	public void printBi() {
		System.out.println(i);
		System.out.println(super.i);
		super.login();
	}

	public static void main(String[] args) {
		ChildSuper obj = new ChildSuper();
		//System.out.println(obj.i);
		obj.printBi();
		
		
		SuperBase obj2 = new SuperBase();
		//System.out.println(obj2.i);

	}

}
