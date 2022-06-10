package ytjava2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RExceptionHandlingTryWithResources {

	
	
	//try with resources 
	public static void main(String[] args) throws Exception {
		int n=0;
		
		BufferedReader br =null;
		
		System.out.println("Enter  a number");
		//if we just want to close resources ,and not handling exception , still we want close resource
		try {
			
			br = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine());
			
		}finally {
			br.close();
			System.out.println("closed");
		}
		System.out.println(n);
	}
	
	
}
