package db.trainning.automationpractice.testscases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import db.trainning.automationpractice.tasks.AuthenticationTask;
import db.trainning.automationpractice.tasks.HomePageTask;
import db.trainning.automationpractice.utils.DriverSetup;
import db.trainning.automationpractice.utils.Report;
import db.trainning.automationpractice.utils.ScreenShot;

public class ChromeLoginTestCase {	
	private WebDriver			driver;	
	private HomePageTask		homePageTask;	
	private AuthenticationTask	authenticationTask ;
	
	@Before		
	public void setUp() {		
		this.driver = DriverSetup.getWebDriverConfiguredForChrome("http://automationpractice.com/index.php");
		
		this.homePageTask 		   = new HomePageTask(this.driver);
		this.authenticationTask    = new AuthenticationTask(this.driver);	
		
		Report.startTest("(Chrome) Login.");	
		Report.log(Status.INFO, "The test is running.", ScreenShot.capture(this.driver));	
	} 

	@Test
	public void testMain() {	
		this.homePageTask.clickSignInButton();
		
		this.authenticationTask.fillAlreadyRegisteredForm("jhon@jhon.com", "12345");		
		this.authenticationTask.clickAlreadyRegisteredSignInButton();		
	}
	
	@After 
	public void tearDown() {		
		Report.log(Status.INFO, "This test is over. ", ScreenShot.capture(this.driver));
		
		this.driver.quit();
	}
}
