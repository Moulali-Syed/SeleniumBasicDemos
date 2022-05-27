package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg3 {

	@Test
	public void WebLogin() {
		// selenium code
		System.out.println("WebLoginHome");
	}

	@Test
	public void MobileLogin() {
		// appium
		System.out.println("Mobile Login");

	}

	
	@Test
	public void MobileSignOut() {
		// appium
		System.out.println("Mobile Login" );

	}

	@Test(dataProvider = "getData")
	public void MobileProcess(String username,String password) {
		// appium
		System.out.println("Mobile Login");
		System.out.println(username  +  " "+password);

	}

	@Test
	public void LoginAPILoan() {
		// rest api code
		System.out.println("API Login");
	}

	// we can our same test multiple times with different data using dataprovider
	@DataProvider
	public Object[][] getData() {
		// 1st combination - username passowrd - good credit history
		// 2nd ussername password - no credit history
		// 3rd fraudlent credit history

		Object[][] data = new Object[3][2];
		data[0][0] = "firstSetUserName";
		data[0][1] = "password";

		data[1][0] = "secondUserName";
		data[1][1] = "password1";
		
		data[2][0] = "thirdUserName";
		data[2][1] = "password2";
		
		return data;
	}
}


