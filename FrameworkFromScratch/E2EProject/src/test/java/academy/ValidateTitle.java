package academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class ValidateTitle extends Base {
	public WebDriver driver;

	@Test
	public void validateTitle() throws IOException {
		// we can use inheritance or create object of class
		LandingPage l = new LandingPage(driver);
		l.clickPopup().click();
		String t = l.title().getText();
		Assert.assertEquals(t, "FEATURED COURSES123");
		log.info("Text validated successfully");
	}
	
	@BeforeTest
	public void setup() throws IOException {
		driver = initializeDriver();
		log.info("driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to HomePage");
	}

	@AfterTest
	public void teardown() {
		driver.close();
		log.info("driver is closed");
	}

}
