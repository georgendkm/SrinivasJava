package classwork.oops;

public class UsingFinal{
	
	public static float radius;
	public static final float PI_VAL = 3.14f;
	public static final String DAY = "Monday";

	public static void main(String[] args) {
		radius = 6.6f;
		double a = PI_VAL * radius * radius;
		System.out.println("area = " + a);
		
	}

}
