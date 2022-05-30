package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day3 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("runs before executing any method in a class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("RUns after executing all methods in a class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("runs before every @Test method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("runs after every @Test method");
	}

	@Test
	public void WebLoginCarLoan() {
		System.out.println("Web Login Car");
	}

	@Test(groups = { "Smoke" })
	public void MobileLoginCarLoan() {
		System.out.println("Mobile Login Car");
	}

	@Test
	public void MobileSigninCarLoan() {
		System.out.println("Mobile SignIn Car");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This will run first irrespective of number of test folders");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This will run after everything got executed");
	}

	@Test
	public void MobilesignoutCarLoan() {
		System.out.println("Mobile Signout Car");
	}

	@Test(dependsOnMethods = { "WebLoginCarLoan" })
	public void LoginAPICarLoan() {
		System.out.println("Api Login Car");
	}

	@Test(dataProvider = "getData")
	public void loginWithMultipleIds(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}

	@DataProvider
	public Object[][] getData() {

		// step1: create multi dimensional array
		Object[][] data = new Object[3][2];
		// step2
		data[0][0] = "firstusername";
		data[0][1] = "password";
		data[1][0] = "secondusername";
		data[1][1] = "password2";
		data[2][0] = "thirdusername";
		data[2][1] = "password3";

		// step3
		return data;

	}
}
