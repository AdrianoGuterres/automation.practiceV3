package db.trainning.automationpractice.tasks;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import db.trainning.automationpractice.appobjects.AuthenticationAppObjects;
import db.trainning.automationpractice.utils.Report;
import db.trainning.automationpractice.utils.ScreenShot;

public class AuthenticationTask {	
	private WebDriver driver;
	
	private AuthenticationAppObjects authenticationAppObjects;
	
	public AuthenticationTask(WebDriver driver) {
		this.driver = driver;					
		this.authenticationAppObjects = new AuthenticationAppObjects(this.driver);
	}

	public void fillEmailTextField(String email) {
		this.authenticationAppObjects.getCreateAccoundEmailTextField().sendKeys(email);		
		Report.log(Status.INFO, "", ScreenShot.capture(this.driver));
	}

	public void clickCreateAnAccountButton() {
		this.authenticationAppObjects.getCreateAnAccountButton().click();		
		Report.log(Status.INFO, "", ScreenShot.capture(this.driver));
	}	
	
	public void fillAlreadyRegisteredForm(String email, String password) {		
		this.authenticationAppObjects.getAlreadyRegisteredEmailTextField().sendKeys(email);		
		this.authenticationAppObjects.getAlreadyRegisteredPasswordTextField().sendKeys(password);	
		Report.log(Status.INFO, "", ScreenShot.capture(this.driver));
	}	
	
	public void clickAlreadyRegisteredSignInButton() {
		this.authenticationAppObjects.getAlreadyRegisteredSignInButton().click();		
		Report.log(Status.INFO, "", ScreenShot.capture(this.driver));
	}
}
