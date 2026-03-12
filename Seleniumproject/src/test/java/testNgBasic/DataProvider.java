package testNgBasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.DataUtils;


public class DataProvider /* extends DataUtils */ {
	
	
//	@org.testng.annotations.DataProvider(name="login") 
//	public String[][] getData()
//	{
//		String[][] data=new String[2][2];
//		
//		data[0][0]= "mranjan@0499@gmail.com";
//		data[0][1]="pass@123";
//		
//		data[1][0]="mranjan@0499@yahoo.com";
//		data[1][1]="pass@1234";
//		
//		return data;
//	}
	
	
   @Parameters({"username"})
   @Test(dataProvider ="login", dataProviderClass = DataUtils.class)
   public void login(String data[]) throws InterruptedException {
		
		  
		//System.err.println("Username:  " +username);
		System.err.println("username:" +data[0]);
		System.err.println("pass: " +   data[1]);
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(data[0]);
		driver.findElement(By.name("password")).sendKeys(data[1]);
		Thread.sleep(3000);
		driver.findElement(By.tagName("button")).click();
		String title=driver.getTitle(); 
		System.out.println("Title is " +title); 
		driver.quit();
		 
	}
}
