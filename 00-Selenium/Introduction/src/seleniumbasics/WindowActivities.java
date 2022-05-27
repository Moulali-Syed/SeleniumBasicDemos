package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//if we use get selenium will wait till all components on page gets fully loaded
		//this has inbuilt synchronization
		driver.get("https://google.com");
		//even some of page is loaded it will go through , here we have to use some wait , mostly we use for internal naviagtions
		driver.navigate().to("https://rahulshettyacademy.com");

		driver.navigate().back();
		driver.navigate().forward();
	}

}
