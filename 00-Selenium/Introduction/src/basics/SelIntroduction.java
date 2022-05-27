package basics;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\Drivers\\chromedriver_win32\\chromedriver.exe");
//		// Invoking Browser
//		// ChromeBrowser
//		WebDriver driver = new ChromeDriver();
		// we need chromedriver.exe

		//Firefox Launch	
//		System.setProperty("webdriver.gecko.driver","C:\\Testing\\Drivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		//Microsoft Edge
		System.setProperty("webdriver.edge.driver", "C:\\Testing\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		// open link
		driver.get("https://rahulshettyacademy.com");

		// to get title
		System.out.println(driver.getTitle());
		driver.getTitle();

		// get current url
		System.out.println(driver.getCurrentUrl());

		// close browser[close only current window]
		driver.close();

		// quit[closes all browser instances]
//		driver.quit();

	}

}
