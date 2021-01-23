package exercises;

import java.util.Scanner;

public class TempConv {

	public static void main(String[] args) {

		float f = 0.0f;
		float c = 0.0f;
		
		System.out.println("Enter f value : ");	
		Scanner scan = new Scanner(System.in);
		f = scan.nextFloat();
		scan.close();
		
		c = ((f-32) * 5)/9;
		System.out.println(" c = " + c);
		

		
	}

}
