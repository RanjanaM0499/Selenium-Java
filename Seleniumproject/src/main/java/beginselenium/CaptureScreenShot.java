package beginselenium;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
 
public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/button");
		
		File firstSrc= driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/img1.png");
		FileHandler.copy(firstSrc, dest);
		
		
		WebElement ele=driver.findElement(By.id("property"));
		File eleSrc= ele.getScreenshotAs(OutputType.FILE);
		File eleDest=new File("./snaps/img2.png");
		FileHandler.copy(eleSrc, eleDest);
		
		WebElement info=driver.findElement(By.className("card-content"));
		eleSrc= info.getScreenshotAs(OutputType.FILE);
		eleDest=new File("./snaps/img3.png");
		FileHandler.copy(eleSrc, eleDest);
		
		driver.quit();

	}

}
