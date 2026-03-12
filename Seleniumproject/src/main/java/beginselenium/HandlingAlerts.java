package beginselenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/alert");
		
		
		//accept
		driver.findElement(By.id("accept")).click();
		Alert alert=driver.switchTo().alert();
		//Thread.sleep(3000);
		String text=alert.getText();
		System.out.println("Sample alert text "+text);
		alert.accept();
		
		//dismiss
		driver.findElement(By.id("confirm")).click();
		Alert alerts=driver.switchTo().alert();
		//Thread.sleep(4000);
		String texts=alerts.getText();
		System.out.println("Sample alert text "+ texts);
		alert.dismiss();
		
		//prompt
		driver.findElement(By.id("prompt")).click();
		driver.switchTo().alert();
		alert.sendKeys("Ranjana");
		System.out.println(alert.getText());
		alert.accept();
		String name=driver.findElement(By.id("myName")).getText();
		System.out.println(name);
		
		driver.quit();
		
		
		
		
	}

} 


/**Exceptions in alert
1.Unhandled alert exception
2.Noalert present exception **/