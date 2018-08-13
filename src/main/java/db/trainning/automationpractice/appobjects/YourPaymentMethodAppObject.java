package db.trainning.automationpractice.appobjects;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import db.trainning.automationpractice.utils.DevTools;

public class YourPaymentMethodAppObject {
	private WebDriver driver;
	
	public YourPaymentMethodAppObject(WebDriver driver) {
		this.driver = driver;		
	}
	
	public WebElement getPayByCheckButton() {
		return this.driver.findElement(By.className("payment_module"));
	}
	
	public WebElement getProductDescriptionField() {

		WebElement table = this.driver.findElement(By.cssSelector("#cart_summary > tbody"));	

		ArrayList<WebElement> td = new ArrayList<WebElement>();
		td.addAll( table.findElements(By.cssSelector("td")));	

		return td.get(1);
	}	

	public WebElement getProductAvaliableField() {
		WebElement table = this.driver.findElement(By.cssSelector("#cart_summary > tbody"));	

		ArrayList<WebElement> td = new ArrayList<WebElement>();
		td.addAll( table.findElements(By.cssSelector("td")));	

		return td.get(2);
	}

	public WebElement getProductUnitPrice() {
		WebElement table = this.driver.findElement(By.cssSelector("#cart_summary > tbody"));	

		ArrayList<WebElement> td = new ArrayList<WebElement>();
		td.addAll( table.findElements(By.cssSelector("td")));		
		
		return td.get(3);
	}	

	public WebElement getProductQuantityField() {
		WebElement table = DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.cssSelector("#cart_summary > tbody"));	

		ArrayList<WebElement> td = new ArrayList<WebElement>();
		td.addAll( table.findElements(By.cssSelector("td")));		

		return td.get(4);
	}	

	public WebElement getProductlTotalField() {
		WebElement table = DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.cssSelector("#cart_summary > tbody"));	

		ArrayList<WebElement> td = new ArrayList<WebElement>();
		td.addAll( table.findElements(By.cssSelector("td")));		

		return td.get(5);
	}		

	public WebElement getTotalPriceAllProductField() {		
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.id("total_product"));				
	}

	public WebElement getTotalShipingField() {
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver, By.id("total_shipping"));
	}	

	public WebElement getTotalPriceOrderField() {
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.id("total_price"));
	}

	public WebElement getPayByBankWireButton() {
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.className("payment_module"));
	}		
}
