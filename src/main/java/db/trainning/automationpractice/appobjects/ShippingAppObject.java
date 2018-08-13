package db.trainning.automationpractice.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import db.trainning.automationpractice.utils.DevTools;

public class ShippingAppObject {	
	private WebDriver driver;
	
	public ShippingAppObject(WebDriver driver) {
		this.driver = driver;		
	}
	
	public WebElement getIGreeToTheTermsCheckBox() {
		return this.driver.findElement(By.id("uniform-cgv"));
	}
	
	public WebElement getProcessAddressButton() {
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.name("processCarrier"));
	}
}
