package db.trainning.automationpractice.tasks;

import org.openqa.selenium.WebDriver;

import db.trainning.automationpractice.appobjects.ShoppingCartSummaryAppObject;

public class ShoppingCartSummaryTask {
	private WebDriver driver;	
	private ShoppingCartSummaryAppObject shoppingCartSummaryAppObject;
	
	public ShoppingCartSummaryTask(WebDriver driver) {
		this.driver = driver;
		this.shoppingCartSummaryAppObject = new ShoppingCartSummaryAppObject(this.driver);		
	}
	
	public void clickProceedToCheckoutButton() {
		this.shoppingCartSummaryAppObject.getProceedToCheckoutButton().click();
	}
}
