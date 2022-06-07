package ytjava;

public class CVariables01 {
	public static void main(String[] args) {
//variables are to store data 
		
		
		/*
		 * for numbers we have 
		 * int  , byte ,short , long
		 * 
		 * decimal values
		 * float , double[by default point values are double]
		 * 
		 * 
		 * character
		 * char
		 * 
		 * boolean
		 * 
		 * java is type safe, to use a variable it must be declared before its usage
		 */
		int num=10;	//4 bytes
		int num1 = 50_00_00_000;//available from java version 1.7
		
		
		double percent =9.9;//double is default for decimal values
		float percent1 = 5.5f;//must use f at end
		
		byte b =7;
		short s =20; //2 bytes
		
		long l =5l;//end with l to specify it as Long
		
		char c = 'A';
		c=66;
		System.out.println(c);//we can store integer in character we will get output - B
		
		double d1=5l;//implicit type conversion
		int n1 = (int)5.6;//5 [explicit type conversion - type casting]
		

		/*
		 * byte --> short -->int --> long-->float-->double
		 * 					  |
		 * 					char
		 * 
		 * 
		 * className - Noun
		 * method - Verb
		 * interface - Adjective
		 * constants - in capital letters
		 * 
		 * java follows camel case - second word first letter must be capital
		 */
	}
}
