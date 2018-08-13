package db.trainning.automationpractice.tasks;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import db.trainning.automationpractice.appobjects.ShippingAppObject;
import db.trainning.automationpractice.utils.Report;
import db.trainning.automationpractice.utils.ScreenShot;

public class ShippingTasks {	
	private WebDriver driver;
	
	private ShippingAppObject shippingAppObject;
	
	public ShippingTasks(WebDriver driver) {
		this.driver = driver;
		this.shippingAppObject = new ShippingAppObject(this.driver);
	}
	
	public void clickIGreeToTheTermsCheckBox() {
		this.shippingAppObject.getIGreeToTheTermsCheckBox().click();
		Report.log(Status.INFO, "", ScreenShot.capture(this.driver));
	}
	
	public void clickgetProcessAddressButton() {
		this.shippingAppObject.getProcessAddressButton().click();
		Report.log(Status.INFO, "", ScreenShot.capture(this.driver));
	}
}
