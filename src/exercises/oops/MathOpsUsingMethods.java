package exercises.oops;

public class MathOpsUsingMethods {
	
	int a = 9; // Instance variables
	int b = 3;

	public void addition() {
		int r = a + b;
		System.out.println("Addition : " + r);
	}
	
	public int subtraction() {
		int r = a - b;
		return r;
	}

	public void division(int x, int y) {
		float r =  (float) x/y;
		System.out.println("Division : " + r);
	}
	
	public int remainder(int u, int v) {
		int r =  u%v;
		//return r;
		if(r == 0) {
			return 0;
		} else {
			return r;
		}
	}
	
	public static void main(String[] args) {
		
		MathOpsUsingMethods obj1 = new MathOpsUsingMethods();
		obj1.addition();
		int sub = obj1.subtraction();
		System.out.println(" Subtraction " + sub);
		obj1.division(obj1.a, obj1.b);
		System.out.println("Remainder : " +  obj1.remainder(12, 5));
	}
}
