package testNgBasic;

import org.testng.annotations.Test;

public class LearnGroups {
	
	@Test(groups = {"Smoke"})
	   public void singUp()
	   {
		   System.out.println("Signup");
	   }
	
		@Test(groups = {"Regression"})
	   public void login()
	   {
		   System.out.println("login");
	   }
		
		@Test(groups = "Sanity")
	   public void searchProduct()
	   {
		   System.out.println("Searchproduct");
	   }
		
		@Test(groups = {"Smoke"})
		
	   public void addToCart()
	   {
		  System.out.println("addToCart");
		  throw new RuntimeException();
	   }
	
		
		@Test(groups = {"Regression"})
	   public void signOut()
	   {
		   System.out.println("signOut");
	   }

	   
	   
	   

}
