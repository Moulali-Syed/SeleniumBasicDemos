package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomePage;
import objectrepository.RediffLoginPage;

public class Loginapplication {

	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediff.com/");
		
		RediffLoginPage rd = new RediffLoginPage(driver);
		
		rd.Email().sendKeys("hello");
		rd.Password().sendKeys("hello");
		//rd.Submit().click();
		
		rd.Home().click();
		
		RediffHomePage rh = new RediffHomePage(driver);
		rh.Search().sendKeys("rediff");
		rh.SubmitBtn().click();
	}
}
