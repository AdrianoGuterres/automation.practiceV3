package db.trainning.automationpractice.testscases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import db.trainning.automationpractice.tasks.AddressesTasks;
import db.trainning.automationpractice.tasks.AuthenticationTask;
import db.trainning.automationpractice.tasks.HomePageTask;
import db.trainning.automationpractice.tasks.MyAccountTasks;
import db.trainning.automationpractice.tasks.OrderSummaryTask;
import db.trainning.automationpractice.tasks.ShippingTasks;
import db.trainning.automationpractice.tasks.ShoppingCartSummaryTask;
import db.trainning.automationpractice.tasks.YourPaymentMethodTask;
import db.trainning.automationpractice.utils.DriverSetup;

public class FinalisePurchaseTestCase {	
	private WebDriver				driver;	
	private HomePageTask			homePageTask;	
	private AuthenticationTask		authenticationTask ;
	private MyAccountTasks     		myAccountTask;
	private ShoppingCartSummaryTask shoppingCartSummaryTask;
	private AddressesTasks 			addressesTasks;
	private ShippingTasks 			shippingTasks;
	private YourPaymentMethodTask   yourPaymentMethodTask;
	private OrderSummaryTask		orderSummaryTask;
	
	@Before		
	public void setUp() {		
		this.driver = DriverSetup.getWebDriverConfiguredForChrome("http://automationpractice.com/index.php");
		
		this.homePageTask 			 = new HomePageTask(this.driver);
		this.authenticationTask		 = new AuthenticationTask(this.driver);	
		this.myAccountTask     		 = new MyAccountTasks(this.driver);
		this.shoppingCartSummaryTask = new ShoppingCartSummaryTask(this.driver);
		this.addressesTasks			 = new AddressesTasks(this.driver);
		this.shippingTasks			 = new ShippingTasks(this.driver);
		this.yourPaymentMethodTask   = new YourPaymentMethodTask(this.driver);
		this.orderSummaryTask		 = new OrderSummaryTask(this.driver);
	} 

	@Test
	public void testMain() {		
		this.homePageTask.clickSignInButton();
		
		this.authenticationTask.fillAlreadyRegisteredForm("jhon@jhon.com", "12345");	
		this.authenticationTask.clickAlreadyRegisteredSignInButton();
		
		this.myAccountTask.clickHomeButton();		
		
		this.homePageTask.selectOneProduct("Faded Short Sleeve T-shirts");		
		this.homePageTask.clickAddToCartAnyProductButton();		
		this.homePageTask.clickProceedToCheckoutButton();	
		
		this.shoppingCartSummaryTask.clickProceedToCheckoutButton();
		
		this.addressesTasks.clickProceedToCheckout();
		
		
		
		this.shippingTasks.clickIGreeToTheTermsCheckBox();
		this.shippingTasks.clickgetProcessAddressButton();
		
		this.yourPaymentMethodTask.clickPayByCheckOptionButton();
		
		this.orderSummaryTask.lclickIConfirmMyOrderButton();		
	}
	
	@After 
	public void tearDown() {		
		this.driver.close();
		this.driver.quit();
	}
}
