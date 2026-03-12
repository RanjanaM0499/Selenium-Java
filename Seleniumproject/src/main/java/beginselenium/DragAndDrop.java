package beginselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://letcode.in/droppable");
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		Actions builder= new Actions(driver);
		builder.dragAndDrop(source, target).perform();
		

	}

}
