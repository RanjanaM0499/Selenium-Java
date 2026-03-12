package org.newcode.seleniumBase;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utilsnew.ReadExcel;

public class FirstCodeBase {
	
	
	String URL = "https://www.saucedemo.com/inventory.html";
	protected RemoteWebDriver driver=null;
	public String filename="";
	
	@DataProvider(name="data")
	public String[][] dataProvider()
	{
		String [][]excelData=ReadExcel.getExcelData(filename);
		return excelData;
	}
	
	@BeforeMethod
	public void BeginApp() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(URL);
	 
		
	}
	
	
	  @AfterMethod
	  public void tearDown()
	  { 
		  driver.quit();
	  }
	 
}
