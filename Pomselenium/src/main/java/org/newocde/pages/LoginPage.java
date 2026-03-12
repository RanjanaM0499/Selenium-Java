package org.newocde.pages;

import org.newcode.seleniumBase.FirstCodeBase;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPage extends FirstCodeBase{
	
	public LoginPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	

 

	public LoginPage enterUserName(String Username)

	{
		
		driver.findElement(By.id("user-name")).sendKeys(Username);
		return this;
	}

	public LoginPage enterPassword(String Password)

	{
		driver.findElement(By.id("password")).sendKeys(Password);
		return this;

	}
	public ProductsPage clickLogin() 

	{
       driver.findElement(By.id("login-button")).click();
       return new ProductsPage();       
	}
   public void login(String Username,String Password )
   {
	   enterUserName(Username);
	   enterPassword(Password);
	   clickLogin();
	   
	   
   }



}
		

	
	


