package java4;

public class TReverseString {

	public static void main(String[] args) {
		String s = "madam";
		System.out.println(s.length());// 5
		System.out.println(s.charAt(0));// A
		System.out.println("=============");
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		System.out.println(rev);
		
		System.out.println("Check palindrome");
		//check palindrome
		if(s.equals(rev)) {
			System.out.println("palindrome String");
		}else {
			System.out.println("Not palindrome String");
		}
	}
}
