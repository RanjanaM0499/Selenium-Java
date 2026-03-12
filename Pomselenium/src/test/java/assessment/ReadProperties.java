package assessment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
//		Properties  properties = new Properties();
//		properties.load(new FileInputStream("./newcodeFrench.properties"));	
//		String property=properties.getProperty("welcome");
//		System.out.println(property);
		
		Properties  properties = new Properties();
     	properties.load(new FileInputStream("./locators.properties"));
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(properties.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(properties.getProperty("password"));
		driver.findElement(By.id("login-button")).click();
		
	}

}
