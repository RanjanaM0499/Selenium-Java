package beginselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/window");
		//driver.quit();
		
		driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB);
		driver.get("https://letcode.in/test/");
		Thread.sleep(3000);
		driver.close();
	   
	}

}
