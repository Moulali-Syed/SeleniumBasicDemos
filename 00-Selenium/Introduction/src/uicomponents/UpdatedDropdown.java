package uicomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		//we have to click on + icon to increase count
		//driver.findElement(By.id("hrefIncAdt")).click(); //2 adults selected as 1 is default selected, so to select 5 adults use for loop
		Thread.sleep(2000);
		
		/*
		int i=1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();	
			i++;
		}
		*/
		for(int i=1;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();	
		}
		
		//close
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
	}

}
