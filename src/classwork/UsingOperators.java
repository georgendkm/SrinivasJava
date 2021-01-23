package classwork;

public class UsingOperators {

	public static void main(String[] args) {
		

		
		int a = 78;
		int b = 45;
		int res = 0;
		//Arithmetic operators - *, /, %, + , -
		res = a + b; //Addition '+'
		System.out.println("Addition : " + res);
		res = a - b; //subtraction -
		System.out.println("subtraction : " + res);
		res = a * b;//multiplication - *
		System.out.println("multiplication : " + res);
		float r = (float) a / b;// division /
		System.out.println("division : " + r);
		res = a % b;// remainder %
		System.out.println("remainder : " + res);
		
		//Relational operators - never return a value, always return a boolean
		
		boolean br = false;
		br = a > b;
		System.out.println(" a > b = " + br);
		br = a < b;
		System.out.println(" a < b = " + br);
		br = a >= b;
		System.out.println(" a >= b -> " + br);
		br = a <= b;
		System.out.println(" a <= b -> " + br);
		br = a == b;
		System.out.println(" a == b -> " + br);
		br = a != b;
		System.out.println(" a != b -> " + br);
		
		// Logical operator
		
		br = (a > b) && (a ==b); //false
		System.out.println(" (a > b) && (a ==b) -> " + br);
		
		br = (a > b) || (a ==b); //true
		System.out.println(" (a > b) || (a ==b) -> " + br);
		
		br = (a < b) && (b < a); //false
		System.out.println(" (a < b) && (b < a) -> " + br);
		
		br = (a < b) || (b < a); //true
		System.out.println(" (a < b) || (b < a) -> " + br);
		
		br = (a < b) || (b < a) && (a==b); //false
		System.out.println("(a < b) || (b < a) && (a==b) -> " + br);
		
		// Assignment operators
		
		a += b; // a = a + b;
		System.out.println("a = " + a);
		
		a -= b; // a = a - b;
		System.out.println("a = " + a);
		
		a *=5; // a = a * 5
		System.out.println("a = " + a);
		
		a /=5; // a = a / 5
		System.out.println("a = " + a);
		
		// Unary operators
		
		int i = 100;
		System.out.println(" i = " + i);
		
		System.out.println(" ++i = " + ++i);// i = i + 1
		
		System.out.println(" i = " + i);
		
		System.out.println(" i++ = " + i++);// i = i + 1
		
		System.out.println(" i = " + i);
		
		System.out.println(" --i = " + --i);// i = i - 1
		
		System.out.println(" i = " + i);
		
		System.out.println(" i-- = " + i--);// i = i - 1
		
		System.out.println(" i = " + i);
		
		
	}

}
