package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNg1 {

	@Parameters({"URL"})
	@Test
	public void Demo(String urlName) {
		System.out.println("hello  "+ urlName);//automation code
	}
	
	@Test(groups= {"Smoke"})
	public void SecondTest() {
		System.out.println("Bye");
	}
//we can define multiple testcases in one file
	

//Create testNG file
//right click on project --> testNG -->Convert to TestNg -->Next --> Finish
}
