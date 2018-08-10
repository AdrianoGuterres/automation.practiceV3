package db.trainning.automationpractice.testscases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import db.trainning.automationpractice.tasks.AuthenticationTask;
import db.trainning.automationpractice.tasks.HomePageTask;
import db.trainning.automationpractice.tasks.MyAccountTasks;
import db.trainning.automationpractice.tasks.MyAddressesTask;
import db.trainning.automationpractice.tasks.YourAddressesTask;
import db.trainning.automationpractice.utils.DriverSetup;

public class AddNewDeliveryAddress {
	private WebDriver			 driver;	
	private HomePageTask	     homePageTask;	
	private AuthenticationTask   authenticationTask ;
	private MyAccountTasks		 myAccountTasks;
	private MyAddressesTask      myAddressesTask;
	private YourAddressesTask    yourAddressesTask;
	
	@Before		
	public void setUp() {		
		this.driver = DriverSetup.getWebDriverConfiguredForChrome("http://automationpractice.com/index.php");
		
		this.homePageTask 		= new HomePageTask(this.driver);
		this.authenticationTask = new AuthenticationTask(this.driver);	
		this.myAccountTasks		= new MyAccountTasks(this.driver);
		this.myAddressesTask    = new MyAddressesTask(this.driver);
		this.yourAddressesTask  = new YourAddressesTask(this.driver);
	} 

	@Test
	public void testMain() {		
		this.homePageTask.clickSignInButton();
		
		this.authenticationTask.fillAlreadyRegisteredForm("jhon@jhon.com", "12345");	
		this.authenticationTask.clickAlreadyRegisteredSignInButton();
		
		this.myAccountTasks.clickMyAddressesButton();
		
		this.myAddressesTask.clickAddNewAddressButton();
		
		this.yourAddressesTask.fillNewAddressForm("Math Lab Blue", "albuquerque city", "87101", "(505) 768-1975", "(505) 768-1976", "Math Lab", "New Mexico");		
		this.yourAddressesTask.clickSaveButton();
	}
	
	@After 
	public void tearDown() {		
		this.driver.close();
		this.driver.quit();
	}

}
