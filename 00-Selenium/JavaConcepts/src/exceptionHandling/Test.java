package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {

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
