package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	private By email = By.cssSelector("input[id='user_email']");

	private By password = By.cssSelector("input#user_password");

	private By submit = By.cssSelector("input[type='submit']");

	public WebElement email() {
		return driver.findElement(email);
	}

	public WebElement password() {
		return driver.findElement(password);
	}

	public WebElement submit() {
		return driver.findElement(submit);
	}
}
