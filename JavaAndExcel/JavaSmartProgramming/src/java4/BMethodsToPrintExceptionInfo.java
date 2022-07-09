/*package java4;

public class BMethodsToPrintExceptionInfo {

	//video 109
	public static void main(String[] args) {
		// methods to print exception details

		try {
			int a = 100, b = 0, c;
			c = a / b;
			System.out.println(a);
		} catch (ArithmeticException e) {
			e.printStackTrace(); // gives exception name , description , stack trace
			System.out.println(e);// gives exception name , description
			System.out.println(e.toString());// gives exception name ,description

			System.out.println(e.getMessage());// gives description
		}
	}

}*/

/*
 * output
 *
 * java.lang.ArithmeticException: / by zero at
 * exceptionHandling.MethodsToPrintException.main(MethodsToPrintException.java:
 * 10) java.lang.ArithmeticException: / by zero java.lang.ArithmeticException: /
 * by zero / by zero
 *
 *
 */