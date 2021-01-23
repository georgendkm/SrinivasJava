package classwork;

public class TernaryOperator {

	public static void main(String[] args) {

		boolean bool = false;
		int a = 11;
		bool = (a%2==0) ? true : false;
		System.out.println(" Is number even : " + bool);
		
		int val = (a > 0) ? a+5 : 0;
		System.out.println(" val : " + val);
	}

}
