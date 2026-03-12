package org.newcode.test;

import org.newcode.seleniumBase.FirstCodeBase;
import org.newocde.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001Login extends FirstCodeBase {
	
	
	@BeforeTest
	public void setData() {
		filename="TC001"; 
		
	}

	@Test(dataProvider = "data")
	
	public void loginTest(String[] data) {
		
		/*
		 * LoginPage lp=new LoginPage(); lp.enterUserName(null); lp.enterPassword(null);
		 */
		 
		//BDD style
		new LoginPage(driver)
		.enterUserName(data[0])
		.enterPassword(data[1])
		.clickLogin();
	
		
	}
}
