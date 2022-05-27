package section11;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class CheckBrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Soft Assertion - prevents immediate test failure
		SoftAssert a = new SoftAssert();
		
		//status code grater than 400 - link is not working
		//step1 - get all urls
		//use java method to get status code
		//if statuc code > 400 , link is broken
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		/* one single link
		String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		
		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int resCode = conn.getResponseCode();
		System.out.println(resCode);
		*/
		
		//iterate all over links in footer
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(WebElement link:links) {
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int resCode = conn.getResponseCode();
			System.out.println(resCode);
			a.assertTrue(resCode<400,"the link with text "+link.getText() +" is broken with code "+ resCode);
//			if(resCode>400) {
//				System.out.println("the link with text "+link.getText() +" is broken with code "+ resCode);
//				Assert.assertTrue(false);
//			}
		}
		a.assertAll();
	}

}
