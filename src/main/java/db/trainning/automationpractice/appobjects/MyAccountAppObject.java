package db.trainning.automationpractice.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import db.trainning.automationpractice.utils.DevTools;

public class MyAccountAppObject {	
	private WebDriver driver;
	
	public MyAccountAppObject(WebDriver driver) {
		this.driver = driver;		
	}
	
	public WebElement getHomeButton() {
		return this.driver.findElement(By.partialLinkText("Home"));		
	}

	public WebElement getMyAddressesButton() {
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver, By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a"));
	}
}
