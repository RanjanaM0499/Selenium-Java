package beginselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigation {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/button");
		
		String url= driver.getCurrentUrl();
		System.out.println("Button page URL "+url);
		Thread.sleep(3000);
		
		driver.findElement(By.id("home")).click();
		String homeUrl= driver.getCurrentUrl();
		System.out.println("Home page URL "+homeUrl);
		Thread.sleep(3000);
		
		driver.navigate().back();
		//driver.navigate().forward();
		System.out.println("Return to button URL" +driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.navigate().to("https://letcode.in/test");
		
		driver.quit();
		
		/**Navigation nav=driver.navigate();
		nav.back();
		nav.forward();
		nav.refresh();
		nav.to("");
		**/
		
		
		
		
		
		;
	}

}
