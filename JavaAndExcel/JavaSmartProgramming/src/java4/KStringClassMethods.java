package java4;

public class KStringClassMethods {

	public static void main(String[] args) {
		String name = "abc";
		String email = "abc@gmail.com";
		String password = "abc123";
		
		//length()
		/*
		 * the string length() method counts the number of characters in string and returns
		 * it in integer. this method returns the length of any string which is equal to
		 * number of 16-bit unicode characters in string
		 */
		System.out.println(name.length());//3 - provides output in integer
		System.out.println(email.length());
		
		int i = name.length();
		if(i==0) {
			System.out.println("name is empty");
		}
		
		// if null is stored in a  string , then length() method on it throws exception
		String a = null;
		//System.out.println(a.length());//Exception in thread "main" java.lang.NullPointerException:
		
		String b;
		//System.out.println(b);//compile time error , initialize b
		
		
		/*
		 * isEmpty()
		 * method of String class is included in java string since JDK 1.6
		 * this method returns true if given string is empty ,else returns false
		 * or can say that this method returns true if length of string is 0
		 */
		System.out.println(name.isEmpty());//false - returns boolean value
		String c = "";
		System.out.println(c.isEmpty());//true
		if(name.isEmpty()) {
			System.out.println("name cant be empty");
		}
		
		
		/*
		 * trim() method of String class eliminates only leading and trailing spaces
		 * The unicode value of space character is '\u0020' the trim() method is java checks
		 * this unicode value before and after string ,if it exists then removes the spaces
		 * and returns omitted string
		 */
		String d = name.trim();
		System.out.println(d);
		
		String e = " abc   ";
		System.out.println(e);
		System.out.println(e.trim());
		
		if(name.trim().length()==0) {
			System.out.println("name cant be empty");
		}
	}
}
