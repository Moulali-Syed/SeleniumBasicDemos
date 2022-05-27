package javabasics;

public class StringsDemo {

	public static void main(String[] args) {

		// in java terminology String is an object that represents sequence of
		// characters
//		we can declare string in 2 ways using string literal and new keyword

		// creating with string literal
		String s = "happy happy";
		String s1 = "happy happy";
		// Now java will create only one memory location and both s and s1 will point to
		// the same because the text is same in both

		// with new keyword java creates 2 different objects though same data
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");

		// split based on white space
		String[] splittedArray = s.split(" ");// this returns a array
		System.out.println(splittedArray[0]);

		// remove white space from left and right
		System.out.println(splittedArray[0].trim());

		// print character by character
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		System.out.println("$$$____________________________$$$");
		// print string in reverse order
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}
		System.out.println("$$$____________________________$$$");
	}

}
