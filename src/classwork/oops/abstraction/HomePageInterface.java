package classwork.oops.abstraction;

public interface HomePageInterface extends Interface1, Interface2{
	
	public float PI = 3.14f;
	
	public void login();
	public void logout();
	
	// from Java 8
	public default void defMethod() {
		System.out.println("in def method");
	}
	public static void statMethod() {
		System.out.println("in satic method");
	}

}
