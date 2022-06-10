package ytjava2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QExceptionHandlingCheckedExceptionFinallyBlock2  {
	
	public static void main(String[] args) throws Exception {
		
		int n=0;
		System.out.println("Enter a number");
		
		BufferedReader br = null; 
			
		try {
			
		br = new BufferedReader(new InputStreamReader(System.in));
		 n = Integer.parseInt(br.readLine());
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			br.close();
		}
		
		System.out.println(n);
	}

}

//when compiler knows about exception then it is checked exception , when compiler doesnot know about it its unchecked exception

//exception can be handled with try , catch or using throws

//only runtime exception sub classes are unchecked, remaining all exceptions are checked

//anything coming from io , they are resources , after using them we must close it , else it is occupying memory


/*
 * create resource in try  , handle in catch , close resource in finally
*/