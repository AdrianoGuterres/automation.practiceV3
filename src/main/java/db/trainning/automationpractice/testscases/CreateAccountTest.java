package db.trainning.automationpractice.testscases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import db.trainning.automationpractice.tasks.AuthenticationTask;
import db.trainning.automationpractice.tasks.CreateAccountFormTask;
import db.trainning.automationpractice.tasks.HomePageTask;
import db.trainning.automationpractice.util.DevTools;
import db.trainning.automationpractice.util.DriverSetup;

public class CreateAccountTest {
	
	private WebDriver driver;
	
	private HomePageTask			homePageTask;
	
	private AuthenticationTask		authenticationTask ;
	
	private CreateAccountFormTask 	createAccountFormTask;
	
	@Before		
	public void setUp() {		
		this.driver = DriverSetup.getWebDriverConfiguredForChrome("http://automationpractice.com/index.php");
		
		this.homePageTask 		   = new HomePageTask(this.driver);
		this.authenticationTask    = new AuthenticationTask(this.driver);
		this.createAccountFormTask = new CreateAccountFormTask(this.driver);		
	} 

	@Test
	public void testMain(){		
		this.homePageTask.clickSignInButton();		
		
		this.authenticationTask.fillEmailTextField(DevTools.getNewEmailAddress());		
		this.authenticationTask.clickCreateAnAccountButton();
		
		this.createAccountFormTask.fillCreateAccountForm("Jhon", "Doe", "1234567", "Nonsense street", "Paradise City", "12345", "55-99999999", "Limbo", "Iowa", "United States");		
		this.createAccountFormTask.clickRegisterButton();		
		
	}
	
	@After 
	public void tearDown() {		
		this.driver.close();
		this.driver.quit();
	}
}
