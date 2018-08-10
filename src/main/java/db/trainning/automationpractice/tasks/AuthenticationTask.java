package db.trainning.automationpractice.tasks;

import org.openqa.selenium.WebDriver;

import db.trainning.automationpractice.appobjects.AuthenticationAppObjects;

public class AuthenticationTask {	
	private WebDriver driver;
	
	private AuthenticationAppObjects authenticationAppObjects;
	
	public AuthenticationTask(WebDriver driver) {
		this.driver = driver;					
		this.authenticationAppObjects = new AuthenticationAppObjects(this.driver);
	}

	public void fillEmailTextField(String email) {
		this.authenticationAppObjects.getCreateAccoundEmailTextField().sendKeys(email);		
	}

	public void clickCreateAnAccountButton() {
		this.authenticationAppObjects.getCreateAnAccountButton().click();		
	}	
	
	public void fillAlreadyRegisteredForm(String email, String password) {		
		this.authenticationAppObjects.getAlreadyRegisteredEmailTextField().sendKeys(email);		
		this.authenticationAppObjects.getAlreadyRegisteredPasswordTextField().sendKeys(password);		
	}	
	
	public void clickAlreadyRegisteredSignInButton() {
		this.authenticationAppObjects.getAlreadyRegisteredSignInButton().click();		
	}
}
