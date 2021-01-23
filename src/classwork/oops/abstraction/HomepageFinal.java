package classwork.oops.abstraction;

public final class HomepageFinal { // can not be used as a baseclass
	
	public void login() {
		System.out.println("I am in login");
	}

	public static void main(String[] args) {
		HomepageFinal obj = new HomepageFinal();
		obj.login();

	}

}
