package db.trainning.automationpractice.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import db.trainning.automationpractice.appobjects.YourAddressesAppObject;
import db.trainning.automationpractice.utils.DevTools;

public class YourAddressesTask {
	private WebDriver driver;
	private YourAddressesAppObject yourAddressesAppObject;
	
	public YourAddressesTask(WebDriver driver) {
		this.driver = driver;
		this.yourAddressesAppObject = new YourAddressesAppObject(this.driver);
	}
	
	public void fillNewAddressForm(String address,     String city,  String postalCode, String homePhone, 
								   String mobilePhone, String alias, String state) {
		
		this.yourAddressesAppObject.getAddressTextField().sendKeys(address);
		this.yourAddressesAppObject.getCityTextField().sendKeys(city);	
		this.yourAddressesAppObject.getPostalCodeTextField().sendKeys(postalCode);
		this.yourAddressesAppObject.getHomePhoneTextField().sendKeys(homePhone);
		this.yourAddressesAppObject.getMobilePhoneTextField().sendKeys(mobilePhone);
		this.yourAddressesAppObject.getAliasTextField().clear();
		this.yourAddressesAppObject.getAliasTextField().sendKeys(DevTools.getNewAlias());
		
		DevTools.selectItemForVisibleTextInComboBox(this.yourAddressesAppObject.getStateComboBox(), state);
	}

	public void clickSaveButton() {
		this.yourAddressesAppObject.getSaveButton().click();		
	}
}
