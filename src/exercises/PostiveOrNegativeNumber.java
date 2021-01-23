package exercises;

import java.util.Scanner;

public class PostiveOrNegativeNumber {

	public static void main(String[] args) {
		int num = 0 ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Integer Number:");
		num = scan.nextInt();
		scan.close();
		if(num>=0) {
			System.out.println("Postitive number");
			
		} else {
			System.out.println("Negetive number");
		}
	}

}
