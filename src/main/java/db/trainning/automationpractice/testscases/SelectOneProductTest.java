package db.trainning.automationpractice.testscases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import db.trainning.automationpractice.ressources.*;
import db.trainning.automationpractice.tasks.*;

public class SelectOneProductTest {
	
	private WebDriver driver;
	
	private HomePageTask homePageTask;	
	
	@Before		
	public void setUp() {
		
		this.driver = DriverSetup.getWebDriverConfiguredForChrome("http://automationpractice.com/index.php");
		
		this.homePageTask = new HomePageTask(this.driver);
	} 

	@Test
	public void main(){
		
		this.homePageTask.selectOneProduct("Faded Short Sleeve T-shirts");
		
		this.homePageTask.clickSelectedProductElement();
		
	}
	
	@After 
	public void tearDown() {		
		this.driver.close();
		this.driver.quit();
	}

}
