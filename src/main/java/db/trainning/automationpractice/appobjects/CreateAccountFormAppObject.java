package db.trainning.automationpractice.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import db.trainning.automationpractice.utils.DevTools;

public class CreateAccountFormAppObject {	
	private WebDriver driver;
	
	public CreateAccountFormAppObject(WebDriver driver) {		
		this.driver = driver;		
	}
	
	public WebElement getFirstNameTextField() {		
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver, By.id("customer_firstname"));
	}		
	
	public WebElement getLastNameTextField() {
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.id("customer_lastname"));
	}		
	
	public WebElement getPasswordTextField() {
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.id("passwd"));
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
	
	public WebElement getCountryComboBox() {
		return this.driver.findElement(By.id("id_country"));
	}
	
	public WebElement getMobilePhoneTextField() {
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.id("phone_mobile"));
	}
	
	public WebElement getAliasAddressTextField() {
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.id("alias"));
	}
	
	public WebElement getRegisterButton() {
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.id("submitAccount"));
	}	
}
