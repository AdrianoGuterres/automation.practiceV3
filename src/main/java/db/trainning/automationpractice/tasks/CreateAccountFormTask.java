package db.trainning.automationpractice.tasks;

import org.openqa.selenium.WebDriver;

import db.trainning.automationpractice.appobjects.CreateAccountFormAppObject;
import db.trainning.automationpractice.util.DevTools;

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
		
		DevTools.selectItemInComboBox(this.createAccountFormAppObject.getStateComboBox(), state);		
		DevTools.selectItemInComboBox(this.createAccountFormAppObject.getCountryComboBox(), country);		
	}	
	
	public void clickRegisterButton() {		
		this.createAccountFormAppObject.getRegisterButton().click();		
	}
}
