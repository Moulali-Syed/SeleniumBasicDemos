package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	@Test(groups= {"Smoke"})
	public void Demo() {
		System.out.println("Hey There");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test method");
	}
}
