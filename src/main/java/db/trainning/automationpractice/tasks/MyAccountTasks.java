package db.trainning.automationpractice.tasks;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import db.trainning.automationpractice.appobjects.MyAccountAppObject;
import db.trainning.automationpractice.utils.Report;
import db.trainning.automationpractice.utils.ScreenShot;

public class MyAccountTasks {	
	private WebDriver driver;
	private MyAccountAppObject myAccountAppObject;
	
	public MyAccountTasks(WebDriver driver) {
		this.driver = driver;	
		this.myAccountAppObject = new  MyAccountAppObject(this.driver);
	}
	
	public void clickHomeButton() {
		this.myAccountAppObject.getHomeButton().click();	
		Report.log(Status.INFO, "", ScreenShot.capture(this.driver));
	}
	
	public void clickMyAddressesButton() {
		this.myAccountAppObject.getMyAddressesButton().click();	
		Report.log(Status.INFO, "", ScreenShot.capture(this.driver));
	}
}
