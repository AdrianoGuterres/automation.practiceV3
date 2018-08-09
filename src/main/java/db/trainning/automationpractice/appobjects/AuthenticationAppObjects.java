package db.trainning.automationpractice.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthenticationAppObjects {

	private WebDriver driver;

	public AuthenticationAppObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getCreateAccoundEmailTextField() {		
		return this.driver.findElement(By.id("email_create"));
	}

	public WebElement getCreateAnAccountButton() {
		return this.driver.findElement(By.id("SubmitCreate"));		
	}	
	
	public WebElement getAlreadyRegisteredEmailTextField() {		
		return this.driver.findElement(By.id("email"));
	}
	
	public WebElement getAlreadyRegisteredPasswordTextField() {		
		return this.driver.findElement(By.id("passwd"));
	}
	
	public WebElement getAlreadyRegisteredSignInButton() {
		return this.driver.findElement(By.id("SubmitLogin"));
	}
}
