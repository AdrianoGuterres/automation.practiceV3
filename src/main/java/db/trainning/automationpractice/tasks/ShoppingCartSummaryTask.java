package db.trainning.automationpractice.tasks;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import db.trainning.automationpractice.appobjects.ShoppingCartSummaryAppObject;
import db.trainning.automationpractice.utils.DevTools;
import db.trainning.automationpractice.utils.Report;
import db.trainning.automationpractice.utils.ScreenShot;

public class ShoppingCartSummaryTask {
	private WebDriver driver;	
	private ShoppingCartSummaryAppObject shoppingCartSummaryAppObject;
	
	public ShoppingCartSummaryTask(WebDriver driver) {
		this.driver = driver;
		this.shoppingCartSummaryAppObject = new ShoppingCartSummaryAppObject(this.driver);		
	}
	
	public void clickProceedToCheckoutButton() {
		DevTools.clickButtonWithJSExecutor(this.driver, this.shoppingCartSummaryAppObject.getProceedToCheckoutButton());
		Report.log(Status.INFO, "", ScreenShot.capture(this.driver));
	}
}
