package java4;

public class OStringSearchingCharacters {

	public static void main(String[] args) {
		String s = "Apple";
/*
 * indexOf() method returns the position of first occurence of specified
 * characters in  a string or return -1 , if character doesnot occur
 */
		System.out.println(s.indexOf('e'));//4
		System.out.println(s.indexOf("le"));//3
		System.out.println(s.indexOf("p"));//1
/*
 * lastIndexOf() method returns the position of last occurence of specified
 * characters in a string or return -1 ,if character doesnot occur
 */
		System.out.println(s.lastIndexOf('p'));//2

/*
 * charAt() method returns character at specified index. the index value should lie between
 * 0 and length()-1
 */
		System.out.println(s.charAt(4));//e
/*
 * contains() method searches the sequence of characters in given string
 * it returns true if sequence of char values are found in this string otherwise returns false
 */
		System.out.println(s.contains("pl"));//true
/*
 * startsWith() method tests if a string start with specified prefix begining from 1st index
 * if yes then it will return true else it will return false
 */
		System.out.println(s.startsWith("A"));//true
/*
 * endsWith() method checks whether string ends with a specified index
 * if yes then method will return true otherwise it will return false
 */
		System.out.println(s.endsWith("e"));//true
	}
}
