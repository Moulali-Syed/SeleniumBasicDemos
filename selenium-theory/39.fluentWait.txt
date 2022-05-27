package interview;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * There is another explicit wait mechanism type called fluent wait Explicit
		 * wait can be achieved in 2 ways 1. webdriver wait = 10 seconds 2.fluent wait =
		 * 10seconds , polling 2sec
		 * 
		 * how different it is from webdriver wait? fluent wait finds the web element
		 * repeatedly at regular intervals of time until the timeout or till the object
		 * gets found
		 * 
		 * unlike webdriver wait , we need to build customized wait methods based on
		 * condition
		 * 
		 * Both webdriverwait and fluent wait classes implement wait interface
		 */

		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				if( driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed()) {
					return driver.findElement(By.cssSelector("[id='finish'] h4"));
				}else {
					return null;
				}
			}
		});
		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
	}

}
