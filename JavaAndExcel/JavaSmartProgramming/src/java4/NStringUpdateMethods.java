package java4;

public class NStringUpdateMethods {

	public static void main(String[] args) {
		String s1 = "This is demo";
		/*
		 * replace(char oldChar, char newChar) method returns a string
		 * replacing all old characters or charSequence to new characters or charsequence
		 * this method was introduced in jdk 1.5 version
		 */
		
		System.out.println(s1.replace("is", "was"));//Thwas was demo
		/*
		 * replaceFirst(String regex,String replacement) method replaces the first
		 * substring that fits the specified regular expression with replacement string
		 * if specified regular expression(regex) is not valid, then it will provide "java.util
		 *.regex.PatternSyntaxException" exception
		 */
		
		System.out.println(s1.replaceFirst("is", "was"));//Thwas is demo
		
		/*
		 * replaceAll(String regex,String replacement) method replaces all substrings that fits
		 * the specified regular expression with replacement string
		 * 
		 * if specified regular expression(regex) is not valid, then it will provide
		 * "java.util.regex.PatternSyntaxException" exception
		 */
		
		System.out.println(s1.replaceAll("is", "was"));//Thwas was demo
//		we can specify regular expression inside replaceAll
		System.out.println(s1.replaceAll("is(.)", "was"));//Thwaswasdemo
		
		//if we specify .* - after is it replaces everything with was
		System.out.println(s1.replaceAll("is(.*)", "was"));//Thwas
	}
}
