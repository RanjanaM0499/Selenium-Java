package assessment;

import org.newcode.seleniumBase.Locators;
import org.newcode.seleniumBase.SeleniumBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginScript extends SeleniumBase  {
	
	@BeforeMethod
	void launch() {
		setUp("https://www.saucedemo.com/");
	}
	@AfterMethod(alwaysRun = true)
	void tearDown() {
		quit();
		
	}
	@Test
	void login()
	{
		
		type(element(Locators.name, "user-"),"secret_sauce");
		type(element(Locators.name, "password"), "secret_sauce");
		click(element(Locators.name, "login-button"));
		System.out.println("Completed");
	
	}

}
