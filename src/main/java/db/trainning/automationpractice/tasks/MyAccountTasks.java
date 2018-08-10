package db.trainning.automationpractice.tasks;

import org.openqa.selenium.WebDriver;

import db.trainning.automationpractice.appobjects.MyAccountAppObject;

public class MyAccountTasks {	
	private WebDriver driver;
	private MyAccountAppObject myAccountAppObject;
	
	public MyAccountTasks(WebDriver driver) {
		this.driver = driver;	
		this.myAccountAppObject = new  MyAccountAppObject(this.driver);
	}
	
	public void clickHomeButton() {
		this.myAccountAppObject.getHomeButton().click();		
	}
	
	public void clickMyAddressesButton() {
		this.myAccountAppObject.getMyAddressesButton().click();		
	}
}
