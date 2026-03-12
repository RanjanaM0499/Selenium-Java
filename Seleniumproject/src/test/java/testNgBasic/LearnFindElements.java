package testNgBasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnFindElements {
	
	
	@Test(invocationCount = 3,invocationTimeOut = 20000)

	public void findElements()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.get("https://www.google.com/?zx=1771133215597&no_sw_cr=1");
		driver.findElement(By.name("q")).sendKeys("Cricket", Keys.ENTER);
		List<WebElement>crickets=
		driver.findElements(By.xpath("//*[contains(text(), 'cricket') or  contains(text(), 'Cricket')]"));
		System.out.println(crickets.size());
		driver.quit();

	
	}

	
	/*
	 * public static void main1(String[] args) {
	 * 
	 * 
	 * 
	 * WebDriver driver= new ChromeDriver();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 * driver.get("https://letcode.in/edit");
	 * List<WebElement>labels=driver.findElements(By.tagName("label")); WebElement
	 * lastele=labels.get(labels.size()-1); System.out.println(lastele);
	 * System.out.println("LastElement " +lastele.getText()); int
	 * size=labels.size(); if(size==6) { System.out.println("Test case pass"); }
	 * else System.out.println("Test case fail");
	 * 
	 * for (WebElement label : labels) { String texts=label.getText();
	 * System.out.println(texts);
	 * 
	 * } driver.quit(); }
	 */

}
