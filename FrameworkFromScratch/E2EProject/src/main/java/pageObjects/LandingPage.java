package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	private By signIn = By.cssSelector("a[href*='sign_in']");

	private By popup = By.xpath("//button[text()='NO THANKS']");

	private By title = By.cssSelector(".text-center>h2");

	private By contact = By.xpath("//a[text()='Contact']");

	public WebElement getLogin() {
		return driver.findElement(signIn);
	}

	public WebElement clickPopup() {
		return driver.findElement(popup);
	}

	public WebElement title() {
		return driver.findElement(title);
	}

	public WebElement contact() {
		return driver.findElement(contact);
	}

}
