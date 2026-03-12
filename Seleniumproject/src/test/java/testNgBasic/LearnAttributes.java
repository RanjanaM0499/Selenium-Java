package testNgBasic;

import org.testng.annotations.Test;

public class LearnAttributes {
	
	
	@Test(priority = -1)
   public void singUp()
   {
	   System.out.println("Signup");
   }
	@Test
   public void login()
   {
	   System.out.println("login");
   }
	@Test(priority = -3)
   public void searchProduct()
   {
	   System.out.println("Searchproduct");
   }
	@Test
   public void addToCart()
   {
	   System.out.println("addToCart");
   }
	@Test(priority = 5)
   public void signOut()
   {
	   System.out.println("signOut");
   }

   
   
   
   
   
   
}





