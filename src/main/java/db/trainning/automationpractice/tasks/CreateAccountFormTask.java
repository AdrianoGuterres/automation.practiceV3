package db.trainning.automationpractice.tasks;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import db.trainning.automationpractice.appobjects.CreateAccountFormAppObject;
import db.trainning.automationpractice.utils.DevTools;
import db.trainning.automationpractice.utils.Report;
import db.trainning.automationpractice.utils.ScreenShot;

public class CreateAccountFormTask {
	private WebDriver driver;
	private CreateAccountFormAppObject createAccountFormAppObject;

	public CreateAccountFormTask(WebDriver driver) {
		this.driver = driver;
		this.createAccountFormAppObject = new CreateAccountFormAppObject(this.driver);
	}
	
	public void fillCreateAccountForm(String firstName,  String lastName,    String password,     String address, String city,
									  String postalCode, String mobilePhone, String aliasAddress, String state,   String country) {
		
		this.createAccountFormAppObject.getFirstNameTextField().sendKeys(firstName);		
		this.createAccountFormAppObject.getLastNameTextField().sendKeys(lastName);		
		this.createAccountFormAppObject.getPasswordTextField().sendKeys(password);		
		this.createAccountFormAppObject.getAddressTextField().sendKeys(address);		
		this.createAccountFormAppObject.getCityTextField().sendKeys(city);		
		this.createAccountFormAppObject.getPostalCodeTextField().sendKeys(postalCode);		
		this.createAccountFormAppObject.getMobilePhoneTextField().sendKeys(mobilePhone);		
		this.createAccountFormAppObject.getAliasAddressTextField().clear();	
		this.createAccountFormAppObject.getAliasAddressTextField().sendKeys(aliasAddress);		
		
		DevTools.selectItemForVisibleTextInComboBox(this.createAccountFormAppObject.getStateComboBox(), state);		
		DevTools.selectItemForVisibleTextInComboBox(this.createAccountFormAppObject.getCountryComboBox(), country);	
		
		Report.log(Status.INFO, "", ScreenShot.capture(this.driver));
	}	
	
	public void clickRegisterButton() {		
		this.createAccountFormAppObject.getRegisterButton().click();	
		Report.log(Status.INFO, "", ScreenShot.capture(this.driver));
	}
}
