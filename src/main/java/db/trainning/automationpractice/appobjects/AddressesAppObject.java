package db.trainning.automationpractice.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import db.trainning.automationpractice.utils.DevTools;

public class AddressesAppObject {	
	private WebDriver driver;
	
	public AddressesAppObject(WebDriver driver){
		this.driver = driver;		
	}
	
	public WebElement getProcessAddressButton() {
		return this.driver.findElement(By.cssSelector("#center_column > form > p > button"));
	}
	
	public WebElement getAddressesComboBox() {
				
		//DevTools.moveToElementByActionPerform(this.driver, By.id("Choose a delivery address:"));
		
		return this.driver.findElement(By.id("id_address_delivery"));
	}
	
	public WebElement getAliasField() {
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.xpath("//*[@id=\"address_delivery\"]/li[3]"));
	}
	
	public WebElement getAddressField() {
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.xpath("//*[@id=\"address_delivery\"]/li[4]"));
	}
	
	public WebElement getCountryField() {
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.xpath("//*[@id=\"address_delivery\"]/li[5]"));
	}
	
	public WebElement getPhoneField() {
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.xpath("//*[@id=\"address_delivery\"]/li[6]"));
	}
	
	public WebElement getPhoneMobileField() {
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.xpath("//*[@id=\"address_delivery\"]/li[7]"));
	}	
}
