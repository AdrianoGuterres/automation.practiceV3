package db.trainning.automationpractice.tasks;

import org.openqa.selenium.WebDriver;

import db.trainning.automationpractice.appobjects.YourPaymentMethodAppObject;

public class YourPaymentMethodTask {	
	private WebDriver driver;
	
	private YourPaymentMethodAppObject yourPaymentMethodAppObject;
	
	public YourPaymentMethodTask(WebDriver driver) {
		this.driver = driver;
		this.yourPaymentMethodAppObject = new YourPaymentMethodAppObject(this.driver);
	}
	
	public void clickPayByCheckOptionButton() {
		this.yourPaymentMethodAppObject.getPayByCheckButton().click();		
	}
}
