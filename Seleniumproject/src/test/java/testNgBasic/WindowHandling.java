package testNgBasic;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandling {

	
	
	@Test
	
	public void learnWindowHandling() {
		
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		//driver.manage().window().maximize();
		driver.get("https://letcode.in/window");
		String WindowHandle=driver.getWindowHandle();
		System.out.println("First Window " +WindowHandle);
		driver.findElement(By.id("home")).click();
		Set <String>WindowHandles=driver.getWindowHandles();
		System.out.println(WindowHandles);
		
		List<String> list= new ArrayList<String>(WindowHandles);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(list.get(0));
		driver.close();
		Set<String> WindowHandles2=driver.getWindowHandles();
		list.clear();
		list.addAll(WindowHandles2);
		System.out.println(list.size());
		driver.switchTo().window(list.get(0));
		String CurrentURL=driver.getCurrentUrl();
		System.out.println(CurrentURL);
		driver.quit();
		
		
	
	}

}
