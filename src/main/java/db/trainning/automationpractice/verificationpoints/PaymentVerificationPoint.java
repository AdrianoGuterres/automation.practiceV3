package db.trainning.automationpractice.verificationpoints;

import org.openqa.selenium.WebDriver;

import db.trainning.automationpractice.appobjects.AddressesAppObject;

public class PaymentVerificationPoint {
	
	private final String ALIAS 			 = "Math Lab Blue";
	
	private final String ADDRESS 		 = "albuquerque city, New Mexico 87101";
	
	private final String COUNTRY 		 = "United States";
	
	private final String PHONE			 = "(505) 768-1975";
	
	private final String PHONE_MOBILE	 = "(505) 768-1976";
	
	private WebDriver driver;
	private AddressesAppObject addressesAppObject;
	
	
	public PaymentVerificationPoint(WebDriver driver) {
		this.driver = driver;
		this.addressesAppObject = new AddressesAppObject(this.driver);		
	}
	
	public boolean verifyAddress() {
		boolean aux = false;
		
		return aux;
	}
	
	

}
