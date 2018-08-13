package db.trainning.automationpractice.testsuites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import db.trainning.automationpractice.testscases.ChromeAddNewDeliveryAddressTestCase;
import db.trainning.automationpractice.testscases.ChromeAddOneProductToCartTestCase;
import db.trainning.automationpractice.testscases.ChromeCreateAccountTestCase;
import db.trainning.automationpractice.testscases.ChromeFinalizePurchaseTestCase;
import db.trainning.automationpractice.testscases.ChromeLoginTestCase;
import db.trainning.automationpractice.testscases.ChromeSelectOneProductTestCase;
import db.trainning.automationpractice.testscases.FirefoxAddNewDeliveryAddressTestCase;
import db.trainning.automationpractice.testscases.FirefoxAddOneProductToCartTestCase;
import db.trainning.automationpractice.testscases.FirefoxCreateAccountTestCase;
import db.trainning.automationpractice.testscases.FirefoxFinalizePurchaseTestCase;
import db.trainning.automationpractice.testscases.FirefoxLoginTestCase;
import db.trainning.automationpractice.testscases.FirefoxSelectOneProductTestCase;
import db.trainning.automationpractice.utils.Report;

@RunWith(Suite.class)
@SuiteClasses({
	ChromeAddNewDeliveryAddressTestCase.class,
	ChromeAddOneProductToCartTestCase.class,
	ChromeCreateAccountTestCase.class,
	ChromeFinalizePurchaseTestCase.class,
	ChromeLoginTestCase.class,	
	ChromeSelectOneProductTestCase.class,
	
	FirefoxAddNewDeliveryAddressTestCase.class,
	FirefoxAddOneProductToCartTestCase.class,
	FirefoxCreateAccountTestCase.class,
	FirefoxFinalizePurchaseTestCase.class,
	FirefoxLoginTestCase.class,	
	FirefoxSelectOneProductTestCase.class 
})

public class AllTests {
	
	@BeforeClass
	public static void start() {
		Report.create("automationpractice-com", "Test Case");		
	}
	
	@AfterClass
	public static void tearDown() {		
		Report.close();		
	}
}
