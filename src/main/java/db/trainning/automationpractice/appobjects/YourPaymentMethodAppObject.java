package db.trainning.automationpractice.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourPaymentMethodAppObject {
	private WebDriver driver;
	
	public YourPaymentMethodAppObject(WebDriver driver) {
		this.driver = driver;		
	}
	
	public WebElement getPayByCheckButton() {
		return this.driver.findElement(By.className("payment_module"));
	}
}
