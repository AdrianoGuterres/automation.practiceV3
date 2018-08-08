package db.trainning.automationpractice.appobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthenticationAppObjects {

	private WebDriver driver;

	public AuthenticationAppObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getCreateAccoundEmailTextField() {		
		WebElement element = this.driver.findElement(By.id("email_create"));
		return element;
	}


	public WebElement getCreateAnAccountButton() {
		WebElement element = this.driver.findElement(By.id("SubmitCreate"));		
		return     element;
	}
	
	
	
	public WebElement getAlreadyRegisteredEmailTextField() {		
		WebElement element = this.driver.findElement(By.id("email"));
		return element;
	}
	
	public WebElement getAlreadyRegisteredPasswordTextField() {		
		WebElement element = this.driver.findElement(By.id("passwd"));
		return element;
	}
	
	
	
	
	public WebElement getAlreadyRegisteredSignInButton() {
		WebElement element = this.driver.findElement(By.id("SubmitLogin"));		
		return element;
	}
}
