package classwork.oops;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		
		int i = 5;
		String myi = Integer.toString(i);
		myi = String.valueOf(i);
		System.out.println("i in string : " + i);
		
		
		
		float fval = 896.45455f;
		String f = Float.toString(fval);
		System.out.println("f in string : " + f);
		
		
		String f1 = "7809.7880";
		float f2 = Float.valueOf(f1);
		System.out.println("f2 : " + f2);
		
		String i1 = "897990";
		int i2 = Integer.valueOf(i1);
		System.out.println("i2 : " + i2);
		
		
		Float d = f2; // auto boxing
		
		Integer z = 10;
		
		int y = z;// unboxing
		
		boolean bool = true;
		
		System.out.println(String.valueOf(bool));
	}

}
