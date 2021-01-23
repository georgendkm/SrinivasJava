package exercises;

public class CompondInterest {

	public static void main(String[] args) {
		//A = P ( 1+r ) ^ t 
		int p = 500000;
		float r = 9.75f; //percentage
		int t = 10; //no.of years
		
		double amount=0.0f;
		
		float rate = 1 + (r/100);
		amount = (p * Math.pow(rate, t));
		
		System.out.printf("Amount = %.2f, Prinipal = %d , rate = %.2f" ,  amount, p, r);
		System.out.println();
		System.out.println("Amount = " + amount + " Principal : " + p);
	}

}
