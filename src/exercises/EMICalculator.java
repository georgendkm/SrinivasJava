package exercises;


import java.util.Scanner;

public class EMICalculator {
	

	public static void main(String[] args) {
		int p = 0;
		float r = 0.0f; //% -> r/100 -> r/100/12
		byte n = 0;
		
		double emi;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Principal amount : " );
		p = scan.nextInt();
		
		System.out.println("Enter Rate of Interest(%) : " );
		r = scan.nextFloat();
		
		System.out.println("Enter No.of Years : " );
		n = scan.nextByte();
		
		scan.close();
		
		double rp = Math.pow((1+r/12/100), n*12);
				
		emi = p * (r/12/100) * (rp/(rp-1));
		System.out.println("EMI : " + emi);
		System.out.printf("EMI : %f" , emi);
		System.out.println();
		System.out.println("EMI rounded : "+ Math.round(emi));
		
		System.out.println("EMI rounded : "+ Math.round(67.8923));
		System.out.println("EMI rounded : "+ Math.round(67.4677));
	}

}
