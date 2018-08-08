package db.trainning.automationpractice.testscases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import db.trainning.automationpractice.ressources.*;
import db.trainning.automationpractice.tasks.*;

public class LoginTest {
	
	private WebDriver driver;
	
	private HomePageTask			homePageTask;	
	private AuthenticationTask		authenticationTask ;
	
	@Before		
	public void setUp() {
		
		this.driver = DriverSetup.getWebDriverConfiguredForChrome("http://automationpractice.com/index.php");
		
		this.homePageTask 		   = new HomePageTask(this.driver);
		this.authenticationTask    = new AuthenticationTask(this.driver);
		
	} 

	@Test
	public void main(){
		
		this.homePageTask.clickSignInButton();
		
		this.authenticationTask.fillAlreadyRegisteredForm("jhon@jhon.com", "12345");	
		
		this.authenticationTask.clickAlreadyRegisteredSignInButton();
		
	}
	
	@After 
	public void tearDown() {		
		this.driver.close();
		this.driver.quit();
	}

}
