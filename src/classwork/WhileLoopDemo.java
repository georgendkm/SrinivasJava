package classwork;

public class WhileLoopDemo {

	public static void main(String[] args) {
		

		int i = 1;
		while ( i <= 100) {
			System.out.println(i);
			i++; // i = i + 1
		}
		System.out.println("after while");
		
		int j = 100;
		while (j > 0) {
			System.out.println(j);
			j--;
		}
		System.out.println("after while");
	}

}
