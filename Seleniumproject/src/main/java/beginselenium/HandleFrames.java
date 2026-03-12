package beginselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/frame");
	    
		driver.switchTo().frame("firstFr");
		driver.findElement(By.name("fname")).sendKeys("Ranjana");
		driver.findElement(By.name("lname")).sendKeys("Kavin");
		
		WebElement myFrame=driver.findElement(By.xpath("//*[@src='innerframe']"));
		driver.switchTo().frame(myFrame);
		driver.findElement(By.name("email")).sendKeys("mranjan0499@gmail.com");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.name("lname")).sendKeys("Kaviyarasan");
		
		//driver.switchTo().defaultContent();
		//driver.findElement(By.xpath("//button[contains(@class,'card-footer-item button')]"));

	}

}
