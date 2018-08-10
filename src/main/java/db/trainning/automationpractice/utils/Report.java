package db.trainning.automationpractice.utils;

import java.io.IOException;
import java.net.InetAddress;
import java.time.LocalDateTime;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Report { 
	private static final String DEFAULT_DESCRIPTION = "Test DBServer";
	private static final String DEFAULT_PATH = "./reports/report_s.html";
	private static ExtentReports extentReport;
	private static ExtentTest loggerTest;

	public static void create(String title, String description) {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(String.format(DEFAULT_PATH, LocalDateTime.now().getNano()));

		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle(title); 
		htmlReporter.config().setReportName(description);

		extentReport = new ExtentReports();
		extentReport.attachReporter(htmlReporter);
		extentReport.setSystemInfo("OS: "            , System.getProperty("os.name"));
		extentReport.setSystemInfo("OS Version: "    , System.getProperty("os.version"));
		extentReport.setSystemInfo("OS Architecture:", System.getProperty("os.arch"));
		extentReport.setSystemInfo("Java Version: "  , System.getProperty("java.version"));		
		try {extentReport.setSystemInfo("IP Address: "    , InetAddress.getLocalHost().getHostAddress());} catch (Exception e) {System.err.println(e +"  "+ e.getMessage());}
	}

	public static void startTest(String testDescription) {
		if(extentReport == null) {
			create(DEFAULT_DESCRIPTION, testDescription);
		}
		loggerTest = extentReport.createTest(testDescription);
	}	

	public static void log(Status logStatus, String message, String imagePath) {		
		try {
			if(loggerTest == null) {
				startTest(DEFAULT_DESCRIPTION);
			}
			loggerTest.log(logStatus, message, MediaEntityBuilder.createScreenCaptureFromPath(imagePath).build());
		} catch (IOException ex) {
			loggerTest.log(logStatus, message + " (Screenshot fail)");
		}
	}	

	public static void log(Status logStatus, String message) {		
		if(loggerTest == null) {
			startTest(DEFAULT_DESCRIPTION);
		}
		loggerTest.log(logStatus, message);
	}

	public static void close() {
		if(extentReport != null) {
			extentReport.flush();
		} else {
			startTest("The test passed!");
			log(Status.INFO, "The tests ended.");
			close();
		}
	}
}
