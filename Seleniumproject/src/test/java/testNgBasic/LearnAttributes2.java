package testNgBasic;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class LearnAttributes2 {
	
	
	@Test(enabled = false,alwaysRun =true )
	public void singUp()
	{
		System.out.println("Signup");
	}
	
	 @Test(description = "This is used to login purpose")
	 public void login()
	 { 
	 System.out.println("Login"); 
	 throw new NoSuchElementException("Element not present"); 
	 }
	 
 
	/*
	 * @Test(dependsOnMethods ="testNgBasic.LearnAttributes2.login", alwaysRun =
	 * true) public void addToCart() { System.out.println("addToCart"); }
	 */
}
