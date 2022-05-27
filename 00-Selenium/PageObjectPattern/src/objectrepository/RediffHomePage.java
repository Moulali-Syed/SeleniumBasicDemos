package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {

	WebDriver driver;

	public RediffHomePage(WebDriver driver) {
		this.driver = driver;
	}

	By search = By.id("srchword");
	By submit = By.xpath("//input[@type='submit']");

	public WebElement Search() {
		return driver.findElement(search);
	}
	
	public WebElement SubmitBtn() {
		return driver.findElement(submit);
	}
}
