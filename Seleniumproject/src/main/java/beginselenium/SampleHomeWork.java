package beginselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleHomeWork {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.cssSelector("html>body>button")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(4000);
		alert.sendKeys("Ranjana");
		//System.out.println(alert.getText());
		alert.accept();
		String name=driver.findElement(By.id("demo")).getText();
		System.out.println(name);
		
		

	}

}
