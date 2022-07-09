package java4;

public class LStringComparison {

	public static void main(String[] args) {
		String s1 = "apple";
		String s2 = "Shimla";
		
		System.out.println(s1.equals(s2));//false
		/*
		 * equals() method compares the content of given two strings if any character
		 * is not matched it returns false, if all characters are matched it returns true
		 * equals() and == is different 
		 * equals() method returns value in boolean 
		 */
		
		String s3 = "banana";
		String s4 = "Banana";
		System.out.println(s3.equalsIgnoreCase(s4));//true
		
		//we can also check  if our string is empty
		System.out.println(s1.equals(""));//false
		/*
		 * equalsIgnoreCase() method is used to compare a specified string to another
		 * string , ignoring case considerations i.e lower case or upper case
		 * two strings are considered equal ignoring case if they are of same length
		 * and corresponding characters in two strings are equal ignoring case
		 */
		
		/*
		 * compareTo() and compareToIgnoreCase() method is used for comparing two strings
		 * lexicographically, each character of both the strings is converted into a unicode
		 * value for comparison ,if both strings are equal then this method returns 0
		 * else it returns positive or negative value
		 * 
		 * each character changes to decimal and then it compares
		 */
		
		String s5 = "a";
		String s6 = "A";
		System.out.println(s5.compareTo(s6));//returns value in integere format[32]
		
		//s5 into decimal - 97 | s6 converts to decimal - 65 
		//when we compare then it will 97-65 = 32
		//if we get output as 0 -  then both strings are equal
		//if + value , string1>string2
		//if - value , string1<string2
		
		String s7 = "abc";
		String s8 = "Abc";
		System.out.println(s7.compareTo(s8));//still it will print 32 
		//it compares only first character of String
		
		String s9 = "aBc";
		String s10 = "aC";
		System.out.println(s9.compareTo(s10));//-1[string1<string2]
		System.out.println(s5.compareToIgnoreCase(s6));//0
		System.out.println(s7.compareToIgnoreCase(s8));//0
		System.out.println(s9.compareToIgnoreCase(s10));//-1
	}
}
