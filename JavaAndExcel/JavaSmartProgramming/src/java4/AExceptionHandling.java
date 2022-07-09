package java4;

public class AExceptionHandling {

//video 105 to 108
	public static void main(String[] args) {
		//which interrupts normal flow

		/*
		 * An exception is an unwanted or unexpected event which occurs during execution of a program i.e at
		 * run time that disrupts the normal flow of program
		 *
		 *
		 * if we handle unexpected event then it is exception handling
		 */

		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println(100/0);//arthimetic exception [java.lang.ArithmeticException: ]
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");

		/*
		 * Exception heirarchy and difference between error and exception
		 *
		 * parent class of all classes in java - Object
		 *
		 * Throwable is parent class of Exception and erro
		 *
		 * 					Object
		 * 					   |
		 * 					Throwable
		 * 					/      \
		 *               Exception  Error
		 *               [due to      [due to lack of system resources], less ram ,slow speed of system
		 *               programs]		[error not recoverable]
		 *               [Exceptions
		 *               are recoverable]
		 *
		 *        exception are of 2 types        error only one type: unchecked/run time error - outofMemory
		 *        compile time / checked
		 *        runtime/unchecked
		 *
		 *        Exception class Heirarchy
		 *         											Object
		 *         												|
		 *         										     Throwabe
		 *         											/		\
		 *         										Exception    error
		 *         										/				 \
		 *         								classNotFoundException   virtualMachineerror -stackOverflowerror,outofMemoryerror
		 *         								NoSuchMethodException	 LinkageError - verifyerror,classformat error, noclassDefFoundError
		 *         								SQLException			 Assertion error
		 *         								InterruptedException
		 *         								RemoteException
		 *         								IO Exception  - EOF exception,FilenotfoundException,intereptedException
		 *         								IllegalArgumentException - NumberFormatException
		 *         								Runtime Exception - Arithmetic exception, classCastException,NullPointerException,indexOutofBoundException(ArrayIndexoutofBound,StringIndexOutofBound)
		 *
		 */

		/*
		 * Difference between checked and unchecked exception
		 *
		 * compile time vs run time exceptions
		 * whichever complier can check it is compile time exception
		 * whichever found on running the program is run time exception
		 *
		 * public class Test {
				public static void main(String[] args) {
					// TODO Auto-generated method stub

					//checked exception
					try {
						FileInputStream fis = new FileInputStream("D:/abc.txt");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println(e);
					}

					int a=100,b=0,c;
					c=a/b;//unchecked or runtime exception
					System.out.println(c);
				}

			}
		 */


		 //********************************************************
	/*
		package exceptionHandling;
		import java.io.FileInputStream;
		public class Test1 {
			public static void main(String[] args) {
				// compile time exception
				// FileInputStream fis = new FileInputStream("D:/abc.txt");
				// run time , unchecked exception
				int a = 100, b = 0, c;
				c = a / b;
				System.out.println(c);
//				whenever exception occurs , the method in which exception occurs will create an object and that object will store 3 things
				// 1. exceptionName 2.Description 3.Stack Trace an this will be passed to JVM and if its not handling then it will
				//pass to default exception handler and program abruptly ends and print the exception
				//if we dont want our program end abruptly we can use try catch

				/*
				 * try{
				 *		risky code
				 * }
				 * catch(ExceptionClassName ref.var.name){
				 * 	handling code
				 * }
				 *
				 * we must have catch after try block
				 *
				 *
				 *
				 */


		/*
				try {
					int x=100,y=0,z;
					z=x/y;
					System.out.println(z);
				}catch(ArithmeticException e){//if we dont know then write Exception
					System.out.println(e);
					System.out.println("u cannot divide by zero");
				}
				// run time , unchecked exception
				String name = null;
				System.out.println(name.length());// null pointer exception
			}
*/
		// *************************************************************************





	}
}
