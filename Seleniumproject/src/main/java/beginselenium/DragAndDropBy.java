package beginselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {

	public static void main(String[] args) {
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		WebElement sample=driver.findElement(By.id("draggable"));
		Actions builder=new Actions(driver);
		int x=sample.getLocation().getX();
		int y=sample.getLocation().getY();
		builder.dragAndDropBy(sample, x+60, y+70).perform();

	}

}
