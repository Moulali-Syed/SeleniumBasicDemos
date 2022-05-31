package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.RediffLoginpage;

public class LoginApplication {

	@Test
	public void login() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediff.com/cgi-bin/login.cgi");
		
		RediffLoginpage rd = new RediffLoginpage(driver);
		rd.emailId().sendKeys("hello");
		rd.password().sendKeys("hello123@");
		rd.go().click();
	}
}
