package db.trainning.automationpractice.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import db.trainning.automationpractice.utils.DevTools;

public class OrderSummaryAppObject {	
	private WebDriver driver;
	
	public OrderSummaryAppObject(WebDriver driver) {
		this.driver = driver;		
	}
	
	public WebElement getIConfirmMyOrderButton() {
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver, By.xpath("//*[@id=\"cart_navigation\"]/button"));
	}
}
