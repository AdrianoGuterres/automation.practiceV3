package db.trainning.automationpractice.testscases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import db.trainning.automationpractice.tasks.HomePageTask;
import db.trainning.automationpractice.utils.DriverSetup;

public class AddOneProductToCartTestCase {	
	private WebDriver driver;	
	private HomePageTask homePageTask;	
	
	@Before		
	public void setUp() {
		this.driver = DriverSetup.getWebDriverConfiguredForChrome("http://automationpractice.com/index.php");		
		this.homePageTask = new HomePageTask(this.driver);
	} 

	@Test
	public void testMain(){		
		this.homePageTask.selectOneProduct("Faded Short Sleeve T-shirts");		
		this.homePageTask.clickAddToCartAnyProductButton();		
		this.homePageTask.clickProceedToCheckoutButton();		
	}
	
	@After 
	public void tearDown() {		
		this.driver.close();
		this.driver.quit();
	}
}
