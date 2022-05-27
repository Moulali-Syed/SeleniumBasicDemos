package seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// open webpage
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		// find element[id locator]
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");

		// by name
		driver.findElement(By.name("inputPassword")).sendKeys("ajsbffb");

		// by class name
		driver.findElement(By.className("signInBtn")).click();

		// css selector
		/*
		 * Input-tagName Red-attribute Green - attribute associated value
		 * 
		 * css selector classname --> tagName.className id ---------> tagName#id
		 * 
		 * generic css selector tagName[attribute='value']
		 */

		// $('p.error') - to check css in chrome dev tools
//		selectorhub , chropath plugins can help to choose the selector is unique or not

		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());// fails at this step if some wait
																					// is not provided before this step

		// LinkText - for the a [anchor tag] elements
		driver.findElement(By.linkText("Forgot your password?")).click();

		// XPath
		/*
		 * //tagName[@attribute='value'] //input[@placeholder='Username']
		 * 
		 * $x('pathHere')
		 * 
		 */
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");

		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@gmail.com");

		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");

		// if we have multiple elements matching using xpath then we can use index to
		// select from all matching xpath elements
		// ---------> //input[@attribute='value'][index]
		// ---> //input[@type='text'][2]

		// in css we have
		/*
		 * input[type='text']:nth-child(2)
		 */

		// xpath
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9829393993");
		// ---->//parentTag/childtag
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		// css
		// in css we use parenttagName childTagName
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-container']/button[1]")).click();

		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();

		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	}

}
