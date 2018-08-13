package db.trainning.automationpractice.verificationpoints;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import db.trainning.automationpractice.appobjects.YourPaymentMethodAppObject;
import db.trainning.automationpractice.utils.Report;
import db.trainning.automationpractice.utils.ScreenShot;

public class PaymentVerificationPoint {
	private final String PRODUCT_DESCRIPTION		 	  = "Math Lab Blue";

	private final String PRODUCT_AVAIBLE 		 	 	  = "In stock";

	private final String PRODUCT_UNIT_PRICE 	    	  = "$16.51";

	private final String PRODUCT_QUANTITY		     	  = "1";

	private final String PRODUCT_TOTAL	                  = "$16.51";
	
	private final String ALL_PRODUCTS_TOTAL	              = "$16.51";
	
	private final String ALL_PRODUCTS_SHIPPING	          = "$2.00";
	
	private final String ALL_PRODUCTS_TOTAL_TAX_SHIPPING  = "$18.51";

	private WebDriver driver;
	private YourPaymentMethodAppObject yourPaymentMethodAppObject;


	public PaymentVerificationPoint(WebDriver driver) {
		this.driver = driver;
		this.yourPaymentMethodAppObject = new YourPaymentMethodAppObject(this.driver);		
	}
	
	public boolean verifyProductDescription() {
		boolean aux = false;		
		WebElement element = this.yourPaymentMethodAppObject.getProductDescriptionField();		
		if(element.getText().contains(this.PRODUCT_DESCRIPTION)) {
			aux = true;
			Report.log(Status.PASS, "The Description is correct.", ScreenShot.capture(this.driver));
		}else {	
			Report.log(Status.FAIL, "The Description isn't correct.", ScreenShot.capture(this.driver));
		}				
		return aux;		
	}	
	
	public boolean verifyAvailable() {
		boolean aux = false;		
		WebElement element = this.yourPaymentMethodAppObject.getProductAvaliableField();	
		if(element.getText().equalsIgnoreCase(this.PRODUCT_AVAIBLE)) {
			aux = true;
			Report.log(Status.PASS, "The Available is correct.", ScreenShot.capture(this.driver));
		}else {
			Report.log(Status.FAIL, "The Available isn't correct.", ScreenShot.capture(this.driver));
		}		
		return aux;
	}		
	
	public boolean verifyProductUnitPrice() {
		boolean aux = false;		
		WebElement element = this.yourPaymentMethodAppObject.getProductUnitPrice();
		if(element.getText().equalsIgnoreCase(PRODUCT_UNIT_PRICE)) {
			aux = true;
			Report.log(Status.PASS, "The Unit Price is correct.", ScreenShot.capture(this.driver));
		}else {	
			Report.log(Status.FAIL, "The Unit Price isn't correct.", ScreenShot.capture(this.driver));
		}				
		return aux;
	}
	
	public boolean verifyProductQuantity() {
		boolean aux = false;		
		WebElement element = this.yourPaymentMethodAppObject.getProductQuantityField();
		if(element.getText().equalsIgnoreCase(this.PRODUCT_QUANTITY)) {
			aux = true;
			Report.log(Status.PASS, "The Product Quantity is correct.", ScreenShot.capture(this.driver));
		}else {	
			Report.log(Status.FAIL, "The Product Quantity isn't correct.", ScreenShot.capture(this.driver));
		}				
		return aux;
	}	
		
	public boolean verifyProductTotal() {
		boolean aux = false;		
		WebElement element = this.yourPaymentMethodAppObject.getProductlTotalField();		
		if(element.getText().equalsIgnoreCase(this.PRODUCT_TOTAL)) {
			aux = true;
			Report.log(Status.PASS, "The Product Total is correct.", ScreenShot.capture(this.driver));
		}else {
			Report.log(Status.FAIL, "The Product Total isn't correct.", ScreenShot.capture(this.driver));
		}				
		return aux;		
	}
	
	public boolean verifyPriceTotalAllProducts() {
		boolean aux = false;		
		WebElement element = this.yourPaymentMethodAppObject.getTotalPriceAllProductField();
		if(element.getText().equalsIgnoreCase(this.ALL_PRODUCTS_TOTAL)) {
			aux = true;
			Report.log(Status.PASS, "The Total is correct.", ScreenShot.capture(this.driver));
		}else {
			Report.log(Status.FAIL, "The Total isn't correct.", ScreenShot.capture(this.driver));
		}				
		return aux;		
	}	
	
	public boolean verifyShippingPrice() {
		boolean aux = false;		
		WebElement element = this.yourPaymentMethodAppObject.getTotalShipingField();	
		if(element.getText().equalsIgnoreCase(this.ALL_PRODUCTS_SHIPPING)) {
			aux = true;
			Report.log(Status.PASS, "The Shipping price is correct.", ScreenShot.capture(this.driver));
		}else {		
			Report.log(Status.FAIL, "The Shipping price isn't correct.", ScreenShot.capture(this.driver));
		}					
		return aux;
	}		
		
	public boolean verifyTotalPriceTotalOrder() {
		boolean aux = false;
		WebElement element = this.yourPaymentMethodAppObject.getTotalPriceOrderField();		
		if(element.getText().equalsIgnoreCase(this.ALL_PRODUCTS_TOTAL_TAX_SHIPPING)) {
			aux = true;
			Report.log(Status.PASS, "The Total of Order is correct.", ScreenShot.capture(this.driver));
		}else {	
			Report.log(Status.FAIL, "The Total of Order isn't correct.", ScreenShot.capture(this.driver));
		}						
		return aux;
	}		
	
}
