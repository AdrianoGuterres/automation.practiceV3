package db.trainning.automationpractice.tasks;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import db.trainning.automationpractice.appobjects.MyAddressesAppObject;
import db.trainning.automationpractice.utils.Report;
import db.trainning.automationpractice.utils.ScreenShot;

public class MyAddressesTask {	
	private WebDriver driver;
	
	private MyAddressesAppObject myAddressesAppObject;
	
	public MyAddressesTask(WebDriver driver) {
		this.driver = driver;
		this.myAddressesAppObject  = new MyAddressesAppObject(this.driver);
		Report.log(Status.INFO, "", ScreenShot.capture(this.driver));
	}
	
	public void clickAddNewAddressButton() {
		this.myAddressesAppObject.getAddNewAddressButton().click();
		Report.log(Status.INFO, "", ScreenShot.capture(this.driver));
	}
}
