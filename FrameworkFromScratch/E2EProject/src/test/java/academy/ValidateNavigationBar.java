package academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;

public class ValidateNavigationBar extends Base {
	public WebDriver driver;
	@Test
	public void validatenavBar() throws IOException {

		// we can use inheritance or create object of class
		LandingPage l = new LandingPage(driver);
		l.clickPopup().click();
		Assert.assertTrue(l.contact().isDisplayed());
		log.info("contact button is visible");

		// Assert.assertFalse();
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
