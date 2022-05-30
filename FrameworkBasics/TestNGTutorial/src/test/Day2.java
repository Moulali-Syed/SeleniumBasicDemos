package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {

	@Test(groups= {"Smoke"})
	public void Demo() {
		System.out.println("Hey There");
	}
	
	@Parameters({"URL"})
	@Test
	public void Demo1(String urlName) {
		System.out.println("Hey There");
		System.out.println(urlName);
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test method");
	}
}
