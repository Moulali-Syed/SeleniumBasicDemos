package resources;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsNG {
	static ExtentReports extent;

	
	public static ExtentReports getReportObject() {

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
		
		return extent;
	}

}
