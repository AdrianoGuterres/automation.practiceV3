package db.trainning.automationpractice.tasks;

import org.openqa.selenium.WebDriver;

import db.trainning.automationpractice.appobjects.AddressesAppObject;

public class AddressesTasks {
	private WebDriver driver;
	private AddressesAppObject addressesAppObject;
	
	public AddressesTasks(WebDriver driver) {				
		this.driver = driver;
		this.addressesAppObject = new AddressesAppObject(this.driver);		
	}
	
	public void clickProceedToCheckout() {
		this.addressesAppObject.getProcessAddressButton().click();
	}
	

}
