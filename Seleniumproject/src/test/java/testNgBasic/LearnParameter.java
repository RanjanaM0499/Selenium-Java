package testNgBasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnParameter {
	
	RemoteWebDriver driver; 
	@Parameters({ "username", "password", "browser" })
	@Test
	void login(String username, String password, String browser) {
		
		
		switch(browser)
		{
		case "Chrome":
			driver=new ChromeDriver();
		break;
		case "Firefox":
			driver=new FirefoxDriver();
		break;
		default:
			System.err.println("Browser is not defined");
		break;
		}
		
		  
		System.out.println(username + " " + password);
		//WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.tagName("button")).click();
		String title=driver.getTitle(); 
		System.out.println("Title is " +title); 
		driver.quit();
		 
	}
}
