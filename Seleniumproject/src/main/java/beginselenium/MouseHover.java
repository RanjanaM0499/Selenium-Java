package beginselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	    //driver.findElement(By.cssSelector("span[role='button']"));
		WebElement elec=driver.findElement(By.xpath("//span[normalize-space(text())='Electronics']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(elec).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Laptop and Desktop")).click();
	
		
		
	}

}
