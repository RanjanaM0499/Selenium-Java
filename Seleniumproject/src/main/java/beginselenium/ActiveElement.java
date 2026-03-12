package beginselenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement activeFunc=driver.switchTo().activeElement();
        activeFunc.sendKeys("Ranjana", Keys.TAB, "Password" , Keys.ENTER);
	    driver.quit();
        
	}

}
 