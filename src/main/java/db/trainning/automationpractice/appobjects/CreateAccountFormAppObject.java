package db.trainning.automationpractice.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import db.trainning.automationpractice.util.DevTools;

public class CreateAccountFormAppObject {
	
	private WebDriver driver;
	
	public CreateAccountFormAppObject(WebDriver driver) {		
		this.driver = driver;		
	}
	
	public WebElement getFirstNameTextField() {		
		return DevTools.waitForClickability(this.driver, By.id("customer_firstname"));
	}		
	
	public WebElement getLastNameTextField() {
		return this.driver.findElement(By.id("customer_lastname"));
	}		
	
	public WebElement getPasswordTextField() {
		return this.driver.findElement(By.id("passwd"));
	}
	
	public WebElement getAddressTextField() {
		return this.driver.findElement(By.id("address1"));
	}
	
	public WebElement getCityTextField() {
		return this.driver.findElement(By.id("city"));
	}
	
	public WebElement getStateComboBox() {
		return this.driver.findElement(By.id("id_state"));
	}
	
	public WebElement getPostalCodeTextField() {
		return this.driver.findElement(By.id("postcode"));
	}	
	
	public WebElement getCountryComboBox() {
		return this.driver.findElement(By.id("id_country"));
	}
	
	public WebElement getMobilePhoneTextField() {
		return this.driver.findElement(By.id("phone_mobile"));
	}
	
	public WebElement getAliasAddressTextField() {
		return this.driver.findElement(By.id("alias"));
	}
	
	public WebElement getRegisterButton() {
		return this.driver.findElement(By.id("submitAccount"));
	}	
}
