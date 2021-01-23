package classwork.oops.exceptions;

public class UsingFinally {

	public static void main(String[] args) {


		int a = 10;
		int b = 0;
		
		try {
			System.out.println(a/b);
		} catch(ArithmeticException e) {
			System.out.println("Caught exception");
		} finally {
			System.out.println("i am in finally");
		} 
		
		try {
			System.out.println(a/b);
		} finally {
			System.out.println("i am in finally");
		}
		System.out.println("i am after finally");

	}

}
