package beginselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moh.gov.my/assets/modules/assets_mgr/scripts/contextMenu/demo.html?utm_source=chatgpt.com");
		WebElement ele=driver.findElement(By.xpath("//strong[normalize-space(text())='right click me']"));
		Actions builder=new Actions(driver);
		builder.contextClick(ele).perform();
		driver.findElement(By.cssSelector("li.context-menu-item.icon.icon-cut")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.quit();
		
		

	}

}
