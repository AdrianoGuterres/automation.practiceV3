package db.trainning.automationpractice.testsuites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import db.trainning.automationpractice.testscases.AddOneProductToCartTest;
import db.trainning.automationpractice.testscases.CreateAccountTest;
import db.trainning.automationpractice.testscases.LoginTest;
import db.trainning.automationpractice.testscases.SelectOneProductTest;

@RunWith(Suite.class)
@SuiteClasses({
	CreateAccountTest.class,
	LoginTest.class,
	AddOneProductToCartTest.class,
	SelectOneProductTest.class	
})

public class AllTests {
	
	@BeforeClass
	public static void start() {
		
	}
	
	@AfterClass
	public static void tearDown() {
		
	}
}
