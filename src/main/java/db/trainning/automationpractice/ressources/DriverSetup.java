package db.trainning.automationpractice.ressources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
	
	public static WebDriver getWebDriverConfiguredForChrome(String url) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();	
		
		driver.get(url);
		
		return driver;
	}

}
