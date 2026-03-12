package beginselenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		//driver.manage().window().maximize();
		//driver.get("https://letcode.in/waits");
		//driver.findElement(By.id("accept")).click();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//Alert until= wait.until(ExpectedConditions.alertIsPresent());
		//System.out.println(until.getText());
		//until.accept();
		//driver.switchTo().alert().accept();
		
		
		WebDriver driver =new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.manage().window().maximize(); 
		driver.get("https://www.flipkart.com/account/login?ret=/");
	    //driver.findElement(By.cssSelector("span[role='button']"));
		WebElement elec=driver.findElement(By.xpath("//span[normalize-space(text())='Electronics']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(elec).perform();
		Thread.sleep(3000);
		WebElement apple=driver.findElement(By.linkText("Apple"));
		wait.until(ExpectedConditions.visibilityOf(apple));
		apple.click();
		wait.until(ExpectedConditions.titleContains("Apple"));
		System.out.println(driver.getTitle());
        
	}

}

//visibilityOf
//invisibilityOf
//title
//titleContains