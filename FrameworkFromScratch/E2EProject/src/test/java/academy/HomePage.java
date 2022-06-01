package academy;

import java.io.IOException;
import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class HomePage extends Base {

	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@Test(dataProvider = "getData")
	public void basePageNavigation(String username, String password, String text) throws IOException {
		

		// we can use inheritance or create object of class
		LandingPage l = new LandingPage(driver);
		l.clickPopup().click();
		l.getLogin().click();

		LoginPage lp = new LoginPage(driver);
		
		lp.email().sendKeys(username);
		log.info("username entered");
		lp.password().sendKeys(password);
		log.info("password entered");
		System.out.println(text);
		lp.submit().click();
	}

	@DataProvider
	public Object[][] getData() {

		// Object takes total count - 2 here is 2 sets of data , 3 is 3 parameters in
		// each data set
		Object[][] data = new Object[2][3];
		data[0][0] = "nonrestricteduser@qw.com";
		data[0][1] = "123456";
		data[0][2] = "non restricted user";
		data[1][0] = "restricteduser@qw.com";
		data[1][1] = "64532100";
		data[1][2] = "restricted user";

		return data;

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
