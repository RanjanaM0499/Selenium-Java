package beginselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndGetAttribute {

	public static void main(String[] args) {
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/login.html");
		
		//get Text
		WebElement header=driver.findElement(By.tagName("h3"));
		String text=header.getText();
		System.out.println(text);
		
		String text1=driver.findElement(By.id("SubmitLogin")).getText();
		System.out.println("New " +text1);
		
		String text2=driver.findElement(By.className("columns-container")).getText();
		System.out.println(text2);
		
		driver.quit();
		
		//getAttribute

		WebDriver driverone =new ChromeDriver();
		driverone.manage().window().maximize();
		driverone.get("https://letcode.in/edit");
		
		String firsttext=driverone.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(firsttext);
		
		String firsttext1=driverone.findElement(By.id("getMe")).getAttribute("id");
		System.out.println(firsttext1);
		
		String firsttext2=driverone.findElement(By.id("fullName")).getAttribute("placeholder");
		System.out.println(firsttext2);
		
		
	}

}
