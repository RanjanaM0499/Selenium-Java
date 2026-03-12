package testNgBasic;

import org.testng.annotations.Test;

public class LearnAttributes1 {
	
	
	@Test(priority = 1)
	   public void singUp()
	   {
		   System.out.println("Signup");
	   }
	
		@Test(dependsOnMethods = "singUp", priority = -1)
	   public void login()
	   {
		   System.out.println("login");
	   }
		
		@Test(dependsOnMethods ="login")
	   public void searchProduct()
	   {
		   System.out.println("Searchproduct");
	   }
		
		@Test(/* dependsOnMethods ="searchProduct" */ priority = 3)
		
	   public void addToCart()
	   {
		  System.out.println("addToCart");
		  throw new RuntimeException();
	   }
	
		
		@Test(/* dependsOnMethods ="addToCart" */ priority = 4)
	   public void signOut()
	   {
		   System.out.println("signOut");
	   }

	   
	   
	   
	   
	   
}


