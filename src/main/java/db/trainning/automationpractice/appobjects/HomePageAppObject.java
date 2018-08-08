package db.trainning.automationpractice.appobjects;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import db.trainning.automationpractice.ressources.DevTools;

public class HomePageAppObject {
	
	private WebDriver driver;
	
	public HomePageAppObject(WebDriver driver) {
		this.driver = driver;		
	}
	
	public WebElement getSignInButton() {
		return this.driver.findElement(By.className("login"));
	}
	
	public ArrayList<WebElement> getAllProductList() {
		
		WebElement element = this.driver.findElement(By.id("homefeatured"));		
		
		ArrayList<WebElement> itens = (ArrayList<WebElement>) element.findElements(By.tagName("li"));
		
		return itens;
	}
	
	public WebElement getAddToCartButton() {
		return this.driver.findElement(By.cssSelector("#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default"));
	}
	
	public WebElement getProcessedToCheckoutButton() {
		return DevTools.waitForClickability(this.driver,By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a"));
		
	}
	
	public WebElement getQuickViewButton() {
		
		return DevTools.waitForClickability(this.driver, By.cssSelector("#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.left-block > div > a.quick-view"));
		
	}

}
