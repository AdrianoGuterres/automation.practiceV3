package db.trainning.automationpractice.tasks;

import org.openqa.selenium.WebDriver;

import db.trainning.automationpractice.appobjects.ShippingAppObject;

public class ShippingTasks {	
	private WebDriver driver;
	
	private ShippingAppObject shippingAppObject;
	
	public ShippingTasks(WebDriver driver) {
		this.driver = driver;
		this.shippingAppObject = new ShippingAppObject(this.driver);
	}
	
	public void clickIGreeToTheTermsCheckBox() {
		this.shippingAppObject.getIGreeToTheTermsCheckBox().click();
	}
	
	public void clickgetProcessAddressButton() {
		this.shippingAppObject.getProcessAddressButton().click();
	}
}
