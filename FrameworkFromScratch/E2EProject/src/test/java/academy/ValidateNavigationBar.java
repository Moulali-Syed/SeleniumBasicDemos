package academy;

import java.io.IOException;

import org.testng.Assert;

import org.testng.annotations.Test;

import pageObjects.LandingPage;

public class ValidateNavigationBar extends Base {

	@Test
	public void basePageNavigation() throws IOException {

		// we can use inheritance or create object of class
		LandingPage l = new LandingPage(driver);
		l.clickPopup().click();
		Assert.assertTrue(l.contact().isDisplayed());
		log.info("contact button is visible");

		// Assert.assertFalse();
	}

}
