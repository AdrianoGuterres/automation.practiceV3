package db.trainning.automationpractice.appobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import db.trainning.automationpractice.utils.DevTools;

public class HomePageAppObject {	
	private WebDriver driver;
	
	public HomePageAppObject(WebDriver driver) {
		this.driver = driver;		
	}
	
	public WebElement getSignInButton() {
		return DevTools.waitUntilFifteenSecondsForClickability(driver, By.className("login"));
	}
	
	public List<WebElement> getAllProductList() {		
		WebElement element = this.driver.findElement(By.id("homefeatured"));			
		return element.findElements(By.tagName("li"));
	}
	
	public WebElement getAddToCartButton() {
		return this.driver.findElement(By.cssSelector("#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default"));
	}
	
	public WebElement getProcessedToCheckoutButton() {
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a"));		
	}
	
	public WebElement getQuickViewButton() {		
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver, By.cssSelector("#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.left-block > div > a.quick-view"));		
	}
}
