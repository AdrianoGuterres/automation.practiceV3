package db.trainning.automationpractice.utils;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DevTools {
	
	public static String getNewEmailAddress() {
		Random random = new Random();		
		String base = "abcdefghijklmnopqrstuvxz";
		String user = "";
		String domain = "";
		int indexUser   = 0;
		int indexDomain = 0;

		for(int i = 0; i <10 ; i++) {
			indexUser   = random.nextInt(base.length() -1);
			indexDomain = random.nextInt(base.length() -1);

			user	 = user + base.substring(indexUser, indexUser+1);
			domain   = domain + base.substring(indexDomain, indexDomain +1);
		}	
		return user +"@"+domain+".com.br";
	}
	
	public static String getNewAlias() {
		Random random = new Random();		
		String base = "abcdefghijklmnopqrstuvxz";
		
		String firstPart = "";
		String secondPart = "";
		
		int indexFirst   = 0;
		int indexSecond = 0;

		for(int i = 0; i <10 ; i++) {
			indexFirst   = random.nextInt(base.length() -1);
			indexSecond = random.nextInt(base.length() -1);

			firstPart	 = firstPart + base.substring(indexFirst, indexFirst+1);
			secondPart   = secondPart + base.substring(indexSecond, indexSecond +1);
		}	
		return firstPart +" "+secondPart;
	}

	public static void selectItemForVisibleTextInComboBox(WebElement comboBox, String item) {
		Select select = new Select(comboBox);
		select.selectByVisibleText(item);	
	}

	public static WebElement waitUntilFifteenSecondsForClickability(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 15); 
		return wait.until(ExpectedConditions.elementToBeClickable(locator));		
	}

	public static void moveToElement(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();		
	}

	public static WebElement waitUntilFifteenSecondsForClickability(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 15); 
		return wait.until(ExpectedConditions.elementToBeClickable(element));	
	}	
	
	public static void clickButtonWithJSExecutor(WebDriver driver, By locator) {
		WebElement element = driver.findElement(locator);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);		
	}
	
	public static void clickButtonWithJSExecutor(WebDriver driver, WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);		
	}
	
	public static void moveToElementByActionPerform(WebDriver driver, By locator) {	

		WebElement element = driver.findElement(locator);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();		
	}	
	
}
