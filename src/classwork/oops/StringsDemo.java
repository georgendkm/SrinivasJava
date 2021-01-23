package classwork.oops;

public class StringsDemo {

	public static void main(String[] args) {
		
		stringOps();
		
		String str = "Hello world";
		
		str = "Hello java"; // Strings are immutable
		
		str = "Java is oop language";
		
		String str1 = new String("Hello world");
		
		System.out.println(str);
		System.out.println(str1);
		
		int a = 10;
		a = 15;
		
		char[] ca = { 'h', '2', 'k', 'i', 'n', 'f'};
		String name = new String(ca);
		System.out.println(name);
		
		
		
		
		
	}
	
	public static void stringOps() {
		
		String str1 = " Java Selenium by h2k infosys Java by h2k ";
		
		int l = str1.length();
		System.out.println(" length : " + l);
		
		System.out.println("Is empty : " + str1.isEmpty());
		
		System.out.println("charAt(6) : " + str1.charAt(6) );
		
		System.out.println("trim():" + str1.trim() );
		
		System.out.println("str1(original) : " + str1 );
		
		boolean cflag = str1.contains("Selenium");
		System.out.println("contains(Selenium): " + cflag);
		cflag = str1.contains("selenium");
		System.out.println("contains(selenium) : " + cflag);
		
		System.out.println("toLowercase : " + str1.toLowerCase());
		System.out.println("toUppercase : " + str1.toUpperCase());
		
		System.out.println(" replace first :" + str1.replaceFirst("Java", "Python"));
		System.out.println(" replace :" + str1.replace("Java", "Python"));
		System.out.println(" replaceAll :" + str1.replaceAll("(J*a)", "Python"));
		
		System.out.println("Substring from index 6 : " + str1.substring(6));
		System.out.println("Substring from index 6 to  14: " + str1.substring(6, 14));
		System.out.println(" Split using space");
		String[] subArr = str1.split(" ");
		System.out.println("length : " + subArr.length);
		for(String element : subArr) {
			System.out.print(element + "\t");
		}
		System.out.println();
		System.out.println(" Split using by");
		String[] subArr2 = str1.split("by");
		System.out.println("length : " + subArr2.length);
		for(String element : subArr2) {
			System.out.print(element + "\t");
		}
		System.out.println();
		
		System.out.println(str1);
		
		String name1 = "John";
		String name2 = "john";
	
		System.out.println("equals : " + name1.equals(name2));
		System.out.println("equals ignore case : " + name1.equalsIgnoreCase(name2));
		System.out.println("Concat : " + name1.concat(name2));
		System.out.println("+ : " + name1+name2);
		
		str1 = str1.trim();
		str1 = str1.toLowerCase();
		System.out.println("str1: " + str1);
		
		
		
	}

}
