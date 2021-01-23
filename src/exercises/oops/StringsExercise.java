package exercises.oops;

public class StringsExercise {
	
	public static void main(String[] args) {
		 
		String myString = "Selenium automates browsers.| That's it!";
			
		System.out.println(" Length : " + myString.length());
		
		System.out.println(" Char At index 12: " + myString.charAt(12));
		
		System.out.println(" Replace text: " + myString.replace("Selenium", "Webdriver")); //Replaces all occurrences of String 
		
		System.out.println(" Replace !: " + myString.replaceFirst("!", "?")); //Replace first occurrence of String
			
		String[] myArr = myString.split("\\|");
		for(String element : myArr) {
			System.out.println("Split element : " + element);
		}
		System.out.println("--------------------");

	}
}
