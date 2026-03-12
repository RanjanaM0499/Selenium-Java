package beginselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowMaximize {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
	    //This is how the above function is working
		
		Options opt =driver.manage();
		Window win=opt.window();
		win.maximize();
		
	    
		
		driver.get("https://letcode.in/");

	}

}
