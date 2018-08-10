package db.trainning.automationpractice.testsuites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import db.trainning.automationpractice.testscases.AddNewDeliveryAddress;
import db.trainning.automationpractice.testscases.AddOneProductToCartTestCase;
import db.trainning.automationpractice.testscases.CreateAccountTestCase;
import db.trainning.automationpractice.testscases.FinalisePurchaseTestCase;
import db.trainning.automationpractice.testscases.LoginTestCase;
import db.trainning.automationpractice.testscases.SelectOneProductTestCase;

@RunWith(Suite.class)
@SuiteClasses({
	AddNewDeliveryAddress.class,
	AddOneProductToCartTestCase.class,
	CreateAccountTestCase.class,
	FinalisePurchaseTestCase.class,
	LoginTestCase.class,	
	SelectOneProductTestCase.class 	
})

public class AllTests {
	
	@BeforeClass
	public static void start() {
		
	}
	
	@AfterClass
	public static void tearDown() {
		
	}
}
