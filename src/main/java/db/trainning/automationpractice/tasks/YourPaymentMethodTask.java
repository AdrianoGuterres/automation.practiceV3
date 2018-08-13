package db.trainning.automationpractice.tasks;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import db.trainning.automationpractice.appobjects.YourPaymentMethodAppObject;
import db.trainning.automationpractice.utils.Report;
import db.trainning.automationpractice.utils.ScreenShot;

public class YourPaymentMethodTask {	
	private WebDriver driver;
	
	private YourPaymentMethodAppObject yourPaymentMethodAppObject;
	
	public YourPaymentMethodTask(WebDriver driver) {
		this.driver = driver;
		this.yourPaymentMethodAppObject = new YourPaymentMethodAppObject(this.driver);
	}
	
	public void clickPayByCheckOptionButton() {
		this.yourPaymentMethodAppObject.getPayByCheckButton().click();		
		Report.log(Status.INFO, "", ScreenShot.capture(this.driver));
	}
}
