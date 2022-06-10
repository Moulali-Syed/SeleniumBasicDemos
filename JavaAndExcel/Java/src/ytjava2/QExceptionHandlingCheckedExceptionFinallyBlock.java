package ytjava2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QExceptionHandlingCheckedExceptionFinallyBlock {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("Enter a number");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(n);
	}

}

//when compiler knows about exception then it is checked exception , when compiler doesnot know about it its unchecked exception

//exception can be handled with try , catch or using throws

//only runtime exception sub classes are unchecked, remaining all exceptions are checked
