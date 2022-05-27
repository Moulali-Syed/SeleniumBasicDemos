package exceptionHandling;

import java.util.Scanner;

public class Keywordthrow {

	/*
	 * Whenever exception occurs JVM checks if the method is handling the exception
	 * , if not the JVM will sends the exception to default exception handler which
	 * will prints all the exception details[name,description,stack trace] thus
	 * result in abnormal termination
	 * 
	 * to overcome abnormal termination we can use try catch block
	 */

	/*
	 * syntax: throw new ExceptionClassName("any message can be passed")
	 * 
	 * programmer will create exception and pass to JVM
	 * 
	 * throw is mainly used for user defined exception
	 * 
	 * its always better to create unchecked Exception
	 * 
	 */
	/*
	 * 
	 * class younger extends RuntimeException{}//unchecked class younger extends
	 * Exception{}//checked
	 */
}

//throw keyword is used to create exception manually by programmer , it cant handle exception , to
//handle we must use try catch block
class YoungerAgeException extends RuntimeException {
	YoungerAgeException() {
		super("under age");
	}
	YoungerAgeException(String msg) {
		super(msg);
	}
}

class Voting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		try {
			if(age<18) {
				//throw is used for printing the exception
				throw new YoungerAgeException("not eligible to vote");
				//we cannot write any statement after throw
			}else {
				System.out.println("Eligible for vote");
			}
		}catch(YoungerAgeException e) {
			e.printStackTrace();
		}
		System.out.println("hello");
		
	}
}