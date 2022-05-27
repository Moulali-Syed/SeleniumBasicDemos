package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsGenration {
	static ExtentReports extent;

	public static ExtentReports getReportObject() {
		// ExtentReports , ExtentSparkReporter
				// user.dir gives project path
				String path = System.getProperty("user.dir") + "\\reports\\index.html";
				ExtentSparkReporter reporter = new ExtentSparkReporter(path);

				// set the report name and document title
				reporter.config().setReportName("Web Automation Results");
				reporter.config().setDocumentTitle("Test Results");

				extent = new ExtentReports();
				extent.attachReporter(reporter);
				extent.setSystemInfo("Tester", "Moulali");
				
				return extent;
	}
}
