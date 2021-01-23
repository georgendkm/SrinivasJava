package classwork.oops.exceptions;

public class UsingThrows {

	public static void main(String[] args) throws Exception{ //caller
		//throws - throw exception to console (main)
		//try - handling the exception locally
		try{
			arrayHandle();
		}catch(Exception e) {
			System.out.println("caught exception");
		}
		Thread.sleep(1000);
		System.out.println("after sleep");
		

	}
	
	
	public static void arrayHandle() throws Exception { //called
		
		int[] arr  = { 23, 56, 76, 34, 89 };
		
		System.out.println(arr[1]);
		System.out.println(arr[6]);
		System.out.println("after exception handling");
		
	}

}
