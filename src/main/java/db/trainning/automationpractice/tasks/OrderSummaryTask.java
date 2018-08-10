package db.trainning.automationpractice.tasks;

import org.openqa.selenium.WebDriver;

import db.trainning.automationpractice.appobjects.OrderSummaryAppObject;

public class OrderSummaryTask {
	private WebDriver driver;
	private OrderSummaryAppObject orderSummaryAppObject;
	
	public OrderSummaryTask(WebDriver driver) {
		this.driver = driver;
		this.orderSummaryAppObject = new OrderSummaryAppObject(this.driver);
	}
	
	public void lclickIConfirmMyOrderButton() {
		this.orderSummaryAppObject.getIConfirmMyOrderButton().click();
	}
}
