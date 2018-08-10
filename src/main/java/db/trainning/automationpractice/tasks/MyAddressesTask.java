package db.trainning.automationpractice.tasks;

import org.openqa.selenium.WebDriver;

import db.trainning.automationpractice.appobjects.MyAddressesAppObject;

public class MyAddressesTask {	
	private WebDriver driver;
	
	private MyAddressesAppObject myAddressesAppObject;
	
	public MyAddressesTask(WebDriver driver) {
		this.driver = driver;
		this.myAddressesAppObject  = new MyAddressesAppObject(this.driver);
	}
	
	public void clickAddNewAddressButton() {
		this.myAddressesAppObject.getAddNewAddressButton().click();
	}
}
