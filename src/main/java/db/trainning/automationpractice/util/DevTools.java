package db.trainning.automationpractice.util;

import java.util.Random;

import org.openqa.selenium.By;
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

	public static void selectItemInComboBox(WebElement comboBox, String item) {
		Select select = new Select(comboBox);
		select.selectByVisibleText(item);	
	}

	public static WebElement waitForClickability(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 15); 
		return wait.until(ExpectedConditions.elementToBeClickable(locator));		
	}

	public static void moveToElement(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();		
	}	

}
