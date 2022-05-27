package section11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//delete all cookies
		driver.manage().deleteAllCookies();
		
		//delete specific cookie
		driver.manage().deleteCookieNamed("cookieName");
		
		//add cookie
//		driver.manage().addCookie("cookie");
	}

}
