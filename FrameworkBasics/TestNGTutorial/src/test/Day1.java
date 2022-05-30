package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {

	@AfterTest
	public void afterTest() {
		System.out.println("After Test will run after all classes inisde a test folder");
	}

	@Test(enabled = false)
	public void demo() {
		System.out.println("hello");// we will write some automation code here
	}

	
	@Test(timeOut=4000)
	public void SecondTest() {
		System.out.println("Bye");
	}

}
