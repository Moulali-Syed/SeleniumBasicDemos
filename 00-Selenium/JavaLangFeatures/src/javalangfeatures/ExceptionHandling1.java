package javalangfeatures;

public class ExceptionHandling1  {

	public static void main(String[] args) {
		// when run time error occurs in a program
		// programmer can define the way to handle exception
		// if not JVM will handle exception and throw some exception , which is not
		// easily understood
		
		// it is good practice to handle exception
		// to handle exceptions we have try catch finally throw throws

		// try block : stmts which are excepted to throw error is placed in catch block
		// catch block: follows try block and appropriate exception catch will executes
		// , if no exception then catch will not execute
//no two catch blocks can handle same exception , Exception should be present last
		int a = 10;
		int b = 0;
		try {
			int c = a / b;
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("either divided by zero or array index out of bounds");
		} 
		catch(Exception e) {
			System.out.println("SOme unknown error happened");
		}

		System.out.println(a);
		System.out.println(b);

	}

}
