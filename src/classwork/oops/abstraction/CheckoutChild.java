package classwork.oops.abstraction;

public class CheckoutChild extends AbstractBase{


	@Override
	public void login() {
		System.out.println("checout login successful");
		
	}

	@Override
	public void checkout() {
		System.out.println("checkout successful");

	}

	public void childMethod() {
		System.out.println("in child method");
	}

	public static void main(String[] args) {
		
		CheckoutChild obj2 = new CheckoutChild();
		obj2.login();
		obj2.checkout();
		obj2.logout();
		obj2.childMethod();
		AbstractBase.statMethod();
		
		AbstractBase obj3 = new CheckoutChild();
		obj3.login();
		obj3.checkout();
		obj3.logout();
	}
}
