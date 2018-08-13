package db.trainning.automationpractice.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
	
	public static WebDriver getWebDriverConfiguredForChrome(String url) {		
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new  ChromeDriver();		
		driver.manage().window().maximize();			
		driver.get(url);		
		return driver;
	}
	
	public static WebDriver getWebDriverConfiguredForFirefox(String url) {		
		WebDriverManager.firefoxdriver().setup();		
		WebDriver driver = new  FirefoxDriver();		
		driver.manage().window().maximize();			
		driver.get(url);		
		return driver;
	}
}
