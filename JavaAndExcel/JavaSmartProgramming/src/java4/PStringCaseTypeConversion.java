package java4;

public class PStringCaseTypeConversion {

	public static void main(String[] args) {
		String s1 = "Apple";

		//case conversion
		System.out.println(s1.toUpperCase());//APPLE
		System.out.println(s1.toLowerCase());//apple
	//==================================================================================
		//type conversion: valueOf() and toCharArray()
		/*
		 * valueOf() method converts different types of values into string
		 * by the help of String.valueOf() method we can convert int or long or float
		 * or double or object or any other type into string
		 *
		 * NOTE:valueOf() method is static method thats why we can call valueOf() method
		 * directly by string class
		 */

		int a =10,b=20;
		System.out.println(a+b);
		String s2 = String.valueOf(a);
		String s3 = String.valueOf(b);
		System.out.println(s1+s2);//1020
		/*
		 * toCharArray() method converts the given string into a sequence of characters
		 * the returned array length is equal to length of string
		 */

		char[] c = s1.toCharArray();
		for(char ch:c) {
			System.out.print(ch+" ");
		}
	}

}
