package classwork.oops.exceptions;

public class SampleException {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		System.out.println( a/b);
		

		int[] marks = { 34, 67, 64, 24, 67 };
		
		System.out.println(marks[4]);
		System.out.println(marks[5]); // unchecked
		System.out.println("After index 5");
		
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // Checked
	}

}
