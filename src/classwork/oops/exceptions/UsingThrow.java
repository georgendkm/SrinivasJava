package classwork.oops.exceptions;

public class UsingThrow {

	public static void main(String[] args) throws Exception{

		try {
			throwDemo();
		}catch(Exception e) {
			System.out.println("hanlded the excetion");
		}

		System.out.println("after exception hndled");
	}
	
	public static void throwDemo() throws Exception {
		int a = 10;
		int b = 0;
		if(b==0) {
			throw new ArithmeticException(" Division by zero not allowed"); 
			//throw new MyException(" Division by zero not allowed");
		}
		int c = a/b;
		System.out.println(c);
	}

}
