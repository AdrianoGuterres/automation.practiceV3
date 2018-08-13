package db.trainning.automationpractice.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import db.trainning.automationpractice.utils.DevTools;

public class AuthenticationAppObjects {
	private WebDriver driver;

	public AuthenticationAppObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getCreateAccoundEmailTextField() {		
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.id("email_create"));
	}

	public WebElement getCreateAnAccountButton() {
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.id("SubmitCreate"));		
	}	
	
	public WebElement getAlreadyRegisteredEmailTextField() {		
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.id("email"));
	}
	
	public WebElement getAlreadyRegisteredPasswordTextField() {		
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.id("passwd"));
	}
	
	public WebElement getAlreadyRegisteredSignInButton() {
		return DevTools.waitUntilFifteenSecondsForClickability(this.driver,By.id("SubmitLogin"));
	}
}
