package db.trainning.automationpractice.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShippingAppObject {	
	private WebDriver driver;
	
	public ShippingAppObject(WebDriver driver) {
		this.driver = driver;		
	}
	
	public WebElement getIGreeToTheTermsCheckBox() {
		return this.driver.findElement(By.id("uniform-cgv"));
	}
	
	public WebElement getProcessAddressButton() {
		return this.driver.findElement(By.name("processCarrier"));
	}
}
