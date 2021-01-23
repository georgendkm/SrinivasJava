package classwork;

public class UsingVariables {
	
//	int radius ;
	
	public static void main(String[] args) {
		
//		UsingVariables obj = new UsingVariables(); //Non-primitive
//		
//		System.out.println(obj.radius);
		
		// Primitive data types
		boolean boolFlag = true;
		char myChar = 'Z';
		byte mybyte = 78;
		short myshort = 30657;
		int myint = 6789679;
		long mylong = 203784290323L;
		float myfloat = 789078.18897F;
		double mydoble = 2323232.2343423423423d;
		
		
		System.out.println("boolean : " + boolFlag);
		System.out.println("char : " + myChar);
		System.out.println("byte : " + mybyte);
		System.out.println("short : " + myshort);
		System.out.println("int : " + myint);
		System.out.println("long : " + mylong);
		System.out.println("float :%f" + myfloat);
		System.out.println();
		System.out.println("double : " + mydoble);
		
		
		String name = "John";  //String name = new String("John");
		System.out.println("String : " + name);
		
		int a = 456;
		int b = 92333;
		
		int c = 0;
		
		c = a + b;
		System.out.println("c =  : " + c);
		
	}

}
