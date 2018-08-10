package db.trainning.automationpractice.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import db.trainning.automationpractice.utils.DevTools;

public class MyAddressesAppObject {	
	private WebDriver driver;
	
	public MyAddressesAppObject(WebDriver driver) {
		this.driver = driver;		
	}
	
	public WebElement getAddNewAddressButton() {
		return DevTools.waitUntilFifteenSecondsForClickability(driver, By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/a"));
	}
}
