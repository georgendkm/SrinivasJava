package classwork.oops.abstraction;

public abstract class AbstractBase {
	
	
	abstract public void login();
	
	public void logout() {
		System.out.println("logout successful");
	}
	
	public static void statMethod() {
		System.out.println("in static method");
	}
	
	abstract public void checkout();
	

}
