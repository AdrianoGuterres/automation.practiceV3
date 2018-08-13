package db.trainning.automationpractice.testscases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import db.trainning.automationpractice.tasks.HomePageTask;
import db.trainning.automationpractice.utils.DriverSetup;
import db.trainning.automationpractice.utils.Report;
import db.trainning.automationpractice.utils.ScreenShot;

public class FirefoxAddOneProductToCartTestCase {	
	private WebDriver driver;	
	private HomePageTask homePageTask;	
	
	@Before		
	public void setUp() {
		this.driver = DriverSetup.getWebDriverConfiguredForFirefox("http://automationpractice.com/index.php");		
		this.homePageTask = new HomePageTask(this.driver);
		
		Report.startTest("(Firefox) Add One Product To Cart.");	
		Report.log(Status.INFO, "The test is running.", ScreenShot.capture(this.driver));
	} 

	@Test
	public void testMain(){					
		this.homePageTask.selectOneProduct("Faded Short Sleeve T-shirts");		
		this.homePageTask.clickAddToCartAnyProductButton();		
		this.homePageTask.clickProceedToCheckoutButton();			
	}
	
	@After 
	public void tearDown() {	
		Report.log(Status.INFO, "This test is over. ", ScreenShot.capture(this.driver));

		this.driver.quit();
	}
}
