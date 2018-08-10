package db.trainning.automationpractice.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressesAppObject {	
	private WebDriver driver;
	
	public AddressesAppObject(WebDriver driver){
		this.driver = driver;		
	}
	
	public WebElement getProcessAddressButton() {
		return this.driver.findElement(By.name("processAddress"));
	}
	
	public WebElement getAddressesComboBox() {
		return this.driver.findElement(By.id("id_address_delivery"));
	}
	
	public WebElement getAliasField() {
		return this.driver.findElement(By.xpath("//*[@id=\"address_delivery\"]/li[3]"));
	}
	
	public WebElement getAddressField() {
		return this.driver.findElement(By.xpath("//*[@id=\"address_delivery\"]/li[4]"));
	}
	
	public WebElement getCountryField() {
		return this.driver.findElement(By.xpath("//*[@id=\"address_delivery\"]/li[5]"));
	}
	
	public WebElement getPhoneField() {
		return this.driver.findElement(By.xpath("//*[@id=\"address_delivery\"]/li[6]"));
	}
	
	public WebElement getPhoneMobileField() {
		return this.driver.findElement(By.xpath("//*[@id=\"address_delivery\"]/li[7]"));
	}
	
	
}
