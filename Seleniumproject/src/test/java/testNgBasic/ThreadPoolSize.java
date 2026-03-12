package testNgBasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThreadPoolSize {

	
	//@Test(/* invocationCount = 3, threadPoolSize =3 */ timeOut=10000)
	 @Test(expectedExceptions = {NoSuchElementException.class})

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
}
