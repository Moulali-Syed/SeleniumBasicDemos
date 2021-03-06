package interview;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//every day items added in amazon , we have to check all products
public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int j = 0;
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		// click on Add to cart
		// 1st identify the product and then click on add to cart

		// for this get all products and iterate and select the required product

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

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


//we use length for array and size method for arrayList