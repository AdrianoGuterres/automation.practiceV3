package db.trainning.automationpractice.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartSummaryAppObject {	
	private WebDriver driver;
	
	public ShoppingCartSummaryAppObject(WebDriver driver) {
		this.driver = driver;		
	}
	
	public WebElement getProceedToCheckoutButton() {
		return this.driver.findElement(By.cssSelector(".standard-checkout"));
	}
}
