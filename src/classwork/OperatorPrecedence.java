package classwork;

public class OperatorPrecedence {

	public static void main(String[] args) {


		int a = 5;
		int b = 9;
		int c = 8;
		
		int d = (a + b * 6) * ( (c + 5) + 4) * c++;// 14 * 13, 14 * 17
		
		System.out.println(" d : " + d);
		
		float radius = 9.75f;

		double result = Math.PI * Math.pow(radius, 2);
		System.out.println("Area of circle : " + result);
		

	}

}
