package javalangfeatures;

public class ExceptionHandling {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };
		int index = 12;
		System.out.println(arr[index]);

		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 12
		 * out of bounds for length 3 at
		 * javalangfeatures.ExceptionHandling.main(ExceptionHandling.java:9)
		 */
		
		
		int a = 0;
		int c = 10 / a;// a run time error occurs
		System.out.println(c);// not exceuted
		/*
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
		 * javalangfeatures.ExceptionHandling.main(ExceptionHandling.java:7)
		 */
		
		//these above examples leads to abruptly ends the program execution
		//to overcome this we have exception handling
	}

}
