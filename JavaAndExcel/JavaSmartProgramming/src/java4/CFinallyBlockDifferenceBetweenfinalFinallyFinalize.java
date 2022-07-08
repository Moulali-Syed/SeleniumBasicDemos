package java4;

public class CFinallyBlockDifferenceBetweenfinalFinallyFinalize {
//video 110,111,112
	public static void main(String[] args) {
		// Finally Block

		try {
			// if exception occurs then catch , then executes finally
			// if no exception then executes finally

			int a = 100, b = 0, c;
			c = a / b;
			System.out.println(c);

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			// always runs
			System.out.println("Iam in finally");

			// used to write clean up code , like closing database connection
			// to release memory

			// if any exception occurs in try and we opened file then its best practice to
			// close file in finally block

			/*
			 * Finally may not execute if we use system.exit(0) in try block or if any error
			 * occured in try due to lack of memory or any error occured in finally and its
			 * not handled
			 * 
			 * 
			 */
		}

		try {
			// doesnot catch any exception

		} finally {
			// always runs
		}

		// final vs finally vs finalize
		/*
		 * final is a keyword can be used with method,class,variable final variable
		 * value cant be changed , final method cant be overridden
		 * 
		 * finally is a block , can be used with try catch
		 * 
		 * finalize is a method , finalize method is override for an object this method
		 * is called before object is garbage collected protected void finalize() throws
		 * Throwable{
		 * 
		 * }
		 */

//******************************************************
		// possible combinations of try catch finally
		/*
		 * try , catch , finally cant exist independently
		 */

	}

}