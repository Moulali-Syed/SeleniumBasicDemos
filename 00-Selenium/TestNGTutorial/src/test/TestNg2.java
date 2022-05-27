package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg2 {

	
	@BeforeClass
	public void beforeclass() {
		System.out.println("BeforeClass");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@Test(groups= {"Smoke"})
	public void sayHi() {
		System.out.println("Hi");
	}
	
	@Test(dependsOnMethods= {"sayBye","sayHi"})
	public void sayHello() {
		System.out.println("Hello");
	}
	@Parameters({"URL"})
	@Test
	public void sayBye(String url) {
		System.out.println("Bye"+ url);
	}
	
	@Test(enabled=false)
	public void enableDemo() {
		System.out.println("disabled because we already know its functionality is not working");
	}
	@Parameters({"URL"})
	@Test(timeOut=4000)
	public void setSomeTime(String url) {
		System.out.println("disabled because we already know its functionality is not working" + url);
	}
	@BeforeMethod
	public void prerequisite() {
		System.out.println("I will execute first");
	}
	//runs before any testcase present inside the test of xml, starting server , any prerequsite steps
	
	@AfterMethod
	public void lastexection() {
		System.out.println("I will execute last ");
	}
	//runs after all the testcase present inside test of xml
	
	//environmental details will be executed in beforeSuite
	@BeforeSuite
	public void beforesuite() {
		System.out.println("First executed");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("last executed");
	}
	//scope of beforesuite and aftersuite is entire xml file
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("runs before each test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("runs after every test");
	}
}
