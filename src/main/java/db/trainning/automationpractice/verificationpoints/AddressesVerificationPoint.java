package db.trainning.automationpractice.verificationpoints;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import db.trainning.automationpractice.appobjects.AddressesAppObject;
import db.trainning.automationpractice.utils.Report;
import db.trainning.automationpractice.utils.ScreenShot;

public class AddressesVerificationPoint {

	private final String ALIAS 			 = "Math Lab Blue";

	private final String ADDRESS 		 = "albuquerque city, New Mexico 87101";

	private final String COUNTRY 		 = "United States";

	private final String PHONE			 = "(505) 768-1975";

	private final String PHONE_MOBILE	 = "(505) 768-1976";

	private WebDriver driver;
	private AddressesAppObject addressesAppObject;


	public AddressesVerificationPoint(WebDriver driver) {
		this.driver = driver;
		this.addressesAppObject = new AddressesAppObject(this.driver);		
	}

	public boolean verifyAddressAlias() {
		boolean aux = false;
		if(this.addressesAppObject.getAliasField().getText().equalsIgnoreCase(ALIAS)) {	
			Report.log(Status.PASS, "The Address Alias is correct.", ScreenShot.capture(this.driver));			
			aux = true;			
		}else {
			Report.log(Status.FAIL, "The Address Alias isn't correct.", ScreenShot.capture(this.driver));
		}
		return aux;
	}

	public boolean verifyAddressAddress() {
		boolean aux = false;
		if(this.addressesAppObject.getAddressField().getText().equalsIgnoreCase(ADDRESS)) {		
			Report.log(Status.PASS, "The Address is correct.", ScreenShot.capture(this.driver));	
			aux = true;		
		}else {
			Report.log(Status.FAIL, "The Address isn't correct.", ScreenShot.capture(this.driver));	
		}
		return aux;
	}

	public boolean verifyAddressCountry() {
		boolean aux = false;
		if(this.addressesAppObject.getCountryField().getText().equalsIgnoreCase(COUNTRY)) {			
			Report.log(Status.PASS, "The Address Country is correct.", ScreenShot.capture(this.driver));	
			aux = true;		
		}else {
			Report.log(Status.FAIL, "The Address Country isn't correct.", ScreenShot.capture(this.driver));	
		}
		return aux;
	}

	public boolean verifyAddressPhone() {
		boolean aux = false;
		if(this.addressesAppObject.getPhoneField().getText().equalsIgnoreCase(PHONE)) {			
			Report.log(Status.PASS, "The Address Phone is correct.", ScreenShot.capture(this.driver));	
			aux = true;		
		}else {
			Report.log(Status.FAIL, "The Address Phone isn't correct.", ScreenShot.capture(this.driver));	
		}
		return aux;
	}

	public boolean verifyAddressPhoneMobile() {
		boolean aux = false;
		if(this.addressesAppObject.getPhoneMobileField().getText().equalsIgnoreCase(PHONE_MOBILE)) {			
			Report.log(Status.PASS, "The Address Mobile Phone is correct.", ScreenShot.capture(this.driver));	
			aux = true;		
		}else {
			Report.log(Status.FAIL, "The Address Mobile Phone isn't correct.", ScreenShot.capture(this.driver));	
		}		
		return aux;
	}
}
