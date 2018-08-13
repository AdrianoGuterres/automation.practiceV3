package db.trainning.automationpractice.tasks;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import db.trainning.automationpractice.appobjects.AddressesAppObject;
import db.trainning.automationpractice.utils.DevTools;
import db.trainning.automationpractice.utils.Report;
import db.trainning.automationpractice.utils.ScreenShot;

public class AddressesTasks {
	private WebDriver driver;
	private AddressesAppObject addressesAppObject;
	
	public AddressesTasks(WebDriver driver) {				
		this.driver = driver;
		this.addressesAppObject = new AddressesAppObject(this.driver);		
	}
	
	public void clickProceedToCheckout() {
		this.addressesAppObject.getProcessAddressButton().click();
		Report.log(Status.INFO, "", ScreenShot.capture(this.driver));
	}
	
	public void changeAddressDelivery(String address) {		
		DevTools.selectItemForVisibleTextInComboBox(this.addressesAppObject.getAddressesComboBox(), address);	
		Report.log(Status.INFO, "", ScreenShot.capture(this.driver));
	}
}
