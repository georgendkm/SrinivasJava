package classwork;

public class TypeCastingDemo {
	
	public static void main(String[] args) {
		
		
		int i = 34355;
		byte b = 9; //-128 to 127
		
		i = b; // type conversion ( smaller -> bigger)
		System.out.println("i = " + i);
		
		i = 232433;
		b = (byte) i; // type casting ( bigger -> smaller)
		System.out.println("b = " + b);
		
		float a = (float) Math.PI * 2 * 2;
		System.out.println("a = " + a);
		
			
	}

}
