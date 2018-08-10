package db.trainning.automationpractice.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourAddressesAppObject {	
	private WebDriver driver;
	
	public YourAddressesAppObject(WebDriver driver) {
		this.driver = driver;		
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
	
	public WebElement getMobilePhoneTextField() {
		return this.driver.findElement(By.id("phone_mobile"));
	}	
	
	public WebElement getAliasTextField() {
		return this.driver.findElement(By.id("alias"));
	}

	public WebElement getHomePhoneTextField() {
		return this.driver.findElement(By.id("phone"));
	}
	
	public WebElement getSaveButton() {
		return this.driver.findElement(By.id("submitAddress"));
	}
}
