package java4;

public class HTest1 {
	public static void main(String[] args) {

		// compile time exception
		// FileInputStream fis = new FileInputStream("D:/abc.txt");

		// run time , unchecked exception
		int a = 100, b = 0, c;
		c = a / b;
		System.out.println(c);

//		whenever exception occurs , the method in which exception occurs will create an object and that object will store 3 things
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

}
