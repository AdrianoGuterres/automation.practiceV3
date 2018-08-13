package db.trainning.automationpractice.tasks;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import db.trainning.automationpractice.appobjects.OrderSummaryAppObject;
import db.trainning.automationpractice.utils.Report;
import db.trainning.automationpractice.utils.ScreenShot;

public class OrderSummaryTask {
	private WebDriver driver;
	private OrderSummaryAppObject orderSummaryAppObject;
	
	public OrderSummaryTask(WebDriver driver) {
		this.driver = driver;
		this.orderSummaryAppObject = new OrderSummaryAppObject(this.driver);
	}
	
	public void clickIConfirmMyOrderButton() {
		this.orderSummaryAppObject.getIConfirmMyOrderButton().click();
		Report.log(Status.INFO, "", ScreenShot.capture(this.driver));
	}
}
