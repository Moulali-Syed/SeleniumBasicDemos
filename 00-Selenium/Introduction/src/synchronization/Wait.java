package synchronization;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	/*
	 * Implicit wait: it is a global wait , if we declare one time till the object
	 * is killed it is applied to all steps suppose if we give 5 seconds , if the
	 * element found in 2 seconds then it will move to next step 5 seconds is
	 * maximum time , it will keep on listening to DOM
	 * 
	 * pros:Readable code
	 * cons: if we say 5 seconds each step may wait , thus hiding performance issues
	 * 
	 */
	
	
	/*
	 * 
	 * Explicit Wait: if suppose a certain step that takes more time we use explicit
	 * wait , target specific element only
	 * 
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		// click on Add to cart
		// 1st identify the product and then click on add to cart

		// for this get all products and iterate and select the required product

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		additems(driver, itemsNeeded);

		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text),'PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		//explict wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	public static void additems(WebDriver driver, String[] itemsNeeded) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {

			String name = products.get(i).getText().split("-")[0].trim();
			// format name to get actual vegetable name

			// convert array into array list for easy search
			// check whether name you extracted in present in array list or not

			List itemNeededList = Arrays.asList(itemsNeeded);

			if (itemNeededList.contains(name)) {
				// click on add to cart
				j++;
				// its not preferable to use text element in x path because it might change
//				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if (j == itemsNeeded.length) {
					break;
				}

			}
		}
	}

}
