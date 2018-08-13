package db.trainning.automationpractice.tasks;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import db.trainning.automationpractice.appobjects.HomePageAppObject;
import db.trainning.automationpractice.utils.DevTools;
import db.trainning.automationpractice.utils.Report;
import db.trainning.automationpractice.utils.ScreenShot;

public class HomePageTask {
	private WebDriver driver;
	private HomePageAppObject homePageAppObject;

	public HomePageTask(WebDriver driver) {
		this.driver = driver;
		this.homePageAppObject = new HomePageAppObject(this.driver);
	}

	public void clickSignInButton(){
		this.homePageAppObject.getSignInButton().click();		
		Report.log(Status.INFO, "", ScreenShot.capture(this.driver));
	}

	public void selectOneProduct(String title) {
		ArrayList<WebElement> productList = (ArrayList<WebElement>) this.homePageAppObject.getAllProductList();
		for(WebElement x : productList) {
			if(x.getText().contains(title)) {
				DevTools.moveToElement(this.driver, x);						
			}			
		}
		Report.log(Status.INFO, "", ScreenShot.capture(this.driver));
	}

	public void clickAddToCartAnyProductButton() {
		this.homePageAppObject.getAddToCartButton().click();
		Report.log(Status.INFO, "", ScreenShot.capture(this.driver));
	}

	public void clickProceedToCheckoutButton() {
		this.homePageAppObject.getProcessedToCheckoutButton().click();
		Report.log(Status.INFO, "", ScreenShot.capture(this.driver));
	}

	public void clickSelectedProductElement() {
		this.homePageAppObject.getQuickViewButton().click();
		Report.log(Status.INFO, "", ScreenShot.capture(this.driver));
	}
}
