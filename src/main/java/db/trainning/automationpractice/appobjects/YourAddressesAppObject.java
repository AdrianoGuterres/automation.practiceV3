package db.trainning.automationpractice.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import db.trainning.automationpractice.utils.DevTools;

public class YourAddressesAppObject {	
	private WebDriver driver;
	
	public YourAddressesAppObject(WebDriver driver) {
		this.driver = driver;		
	}
	
	public WebElement getAddressTextField() {
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.id("address1"));
	}
	
	public WebElement getCityTextField() {
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.id("city"));
	}
	
	public WebElement getStateComboBox() {
		return this.driver.findElement(By.id("id_state"));
	}
		
	public WebElement getPostalCodeTextField() {
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.id("postcode"));
	}
	
	public WebElement getMobilePhoneTextField() {
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.id("phone_mobile"));
	}	
	
	public WebElement getAliasTextField() {
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.id("alias"));
	}

	public WebElement getHomePhoneTextField() {
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.id("phone"));
	}
	
	public WebElement getSaveButton() {
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.id("submitAddress"));
	}
}
