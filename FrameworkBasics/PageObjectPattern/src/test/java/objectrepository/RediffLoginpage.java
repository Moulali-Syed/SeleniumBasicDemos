package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {

	WebDriver driver;
	
	public RediffLoginpage(WebDriver driver) {
		this.driver = driver;
	}
	By username = By.xpath(".//*[@id='login']");

	By password = By.name("passwd");
	
	By go = By.name("proceed");
	
	public WebElement emailId() {
		return driver.findElement(username);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement go() {
		return driver.findElement(go);
	}
}
