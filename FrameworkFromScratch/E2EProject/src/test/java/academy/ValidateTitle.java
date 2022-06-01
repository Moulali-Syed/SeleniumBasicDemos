package academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class ValidateTitle extends Base {

	@Test
	public void basePageNavigation() throws IOException {
		// we can use inheritance or create object of class
		LandingPage l = new LandingPage(driver);
		l.clickPopup().click();
		String t = l.title().getText();
		Assert.assertEquals(t, "FEATURED COURSES");
		log.info("Text validated successfully");
	}

}
