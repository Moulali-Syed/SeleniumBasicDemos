package java4;

public class MStringConcat {

	public static void main(String[] args) {
		String s1 = "Apple";
		String s2 = "java";
		System.out.println(s1+s2);//Apple
		System.out.println(s1+10);//Apple10
		System.out.println(s1+10+20);//Apple1020
		System.out.println(10+20+s1);//30Apple
		System.out.println(10+s1+20);//10Apple20
		
		//follows BODMAS rule
//		System.out.println(s1+10-5);//compile time error - The operator - is undefined for the argument type(s) String, int
	/*
	 * concat(String str) method concatenates one string to end of another string
	 * this method returns a string with value of string passed into method , appended
	 * to end of string
	 */
		
	System.out.println(s1.concat(s2));//Applejava
	
	/*
	 * join(CharSequence delimiter,CharSequence... elements) is the static method which
	 * concatenates the given elements with the delimiter and returns the concatenated
	 * string.it was included in JDK 1.8 version
	 * note that if an element is null, then null is added and if delimiter is null then it will
	 * throw "java.lang.NullPointerException"
	 */
	System.out.println(String.join(",", s1,s2));//Apple,java
	System.out.println(String.join(":", s1,s2));//Apple.java
//	System.out.println(String.join(null, s1,s2,s1));//Exception in thread "main" java.lang.NullPointerException:
	System.out.println(String.join(":", s1,null,s2,s1,null,s2));//Apple:null:java:Apple:null:java
	
	/*
	 * the subSequence(int beginIndex,int endIndex) method returns a charSequence
	 * the subsequence starts with char value at specified index and ends with
	 * the char value at (end-1)
	 * it throws java.lang.StringIndexOutOfBoundsException exception if any index 
	 * position value is negative
	 */
	
	String s = "This is demo";
	System.out.println(s.subSequence(3, 9));//3 begin index position , 9-1 [upto index 8]-s is d
	
	/*
	 * there are two substring methods of String class i.e substring(int beginIndex) and
	 * substring(int beginIndex,int endIndex) it returns a new string that is a substring
	 * of this string .the substring begins at the specified beginIndex and extends to
	 * character at index and index-1
	 */
	System.out.println(s.substring(3));//beginIndex - s is demo
	System.out.println(s.substring(3, 11));//3 to 10 index position - s is dem
	
	
	}
}
