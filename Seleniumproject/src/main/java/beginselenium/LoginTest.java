package beginselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
	
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
	    driver.findElement(By.name("uid")).sendKeys("mngr652789");
		driver.findElement(By.name("password")).sendKeys("vYbErUs");
		driver.findElement(By.name("btnLogin")).click();
		
		
		/**WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		**/driver.findElement(By.name("btnLogin")).click();
		
		

	}

}
