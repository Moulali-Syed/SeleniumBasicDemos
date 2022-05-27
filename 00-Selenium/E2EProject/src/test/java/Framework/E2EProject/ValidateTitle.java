package Framework.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class ValidateTitle extends base {
	private static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeMethod
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home Page");
	}
	@Test
	public void basePageNavigation() throws IOException {
		
		
		LandingPage l = new LandingPage(driver);
		//compare text from browser with actual text
		Assert.assertEquals(l.getTitle().getText(),"FEATURED 1COURSES");
		//l.getTitle().getText();
		log.info("Successfully validated text message");
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}


}
