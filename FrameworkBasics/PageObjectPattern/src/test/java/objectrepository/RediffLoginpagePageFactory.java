package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginpagePageFactory {

	WebDriver driver;

	public RediffLoginpagePageFactory(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ".//*[@id='login']")
	WebElement username;

	@FindBy(name = "passwd")
	WebElement password;

	@FindBy(name = "proceed")
	WebElement go;

	public WebElement emailId() {
		return username;
	}

	public WebElement password() {
		return password;
	}

	public WebElement go() {
		return go;
	}
}
