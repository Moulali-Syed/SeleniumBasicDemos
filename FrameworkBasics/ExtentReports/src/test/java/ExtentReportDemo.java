import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ExtentReportDemo {

	ExtentReports extent;

	@BeforeTest
	public void config() {

		// get the project path dynamically using
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		// ExtentSparkReporter is responsible for creating html file and put some
		// configuration inside it
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");

		// ExtentReports responsible for all the execution
		extent = new ExtentReports();
		extent.attachReporter(reporter);// pass ExtentSparkReporter object
		extent.setSystemInfo("Tester", "Moulali");
	}

	@Test
	public void demo() {
		extent.createTest("demo");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.close();
		extent.flush();
	}
}

//ExtentTest test =  extent.createTest("demo");

//test.fail("Result donot match");
//extent.flush();
