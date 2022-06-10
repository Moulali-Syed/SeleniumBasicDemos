package ytjava2;

public class OExceptionHandlingTryCatchFinally {

	public static void main(String[] args) {

		/*
		 * int i=9/0; //unchecked exception - compiler doesnot verify this exception
		 * [arithmetic exception]
		 * 
		 * System.out.println("bye");//in above step we get exception , as soon as
		 * exception is thrown it will break execution //it means we r not handling
		 * exception above
		 */
		// we can handle exceptions using try catch block

		// try is a block which has all business logic which may throw exception
		try {

			//int j = 9 / 0;

			int p = 7;
			int q = 2;
			int k = p / q;
			System.out.println(k);
		}catch(ArithmeticException e) {
			System.out.println("error arithmetic");
		}
		
		catch (Exception e) {
//			System.out.println("error");
			// to print in red color we can write
			System.err.println("error");
		}finally {
			System.out.println("which execute even we get exception or not");
		}

		System.out.println("bye");
	}
}


/*
 * Arithemtic exception sub class of runtime exception , runtimeexception is sub class of exception
 * 
 */
