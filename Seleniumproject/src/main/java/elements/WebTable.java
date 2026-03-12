package elements;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.manage().window().maximize();
		driver.get("https://letcode.in/table");
		WebElement table= driver.findElement(By.id("simpletable"));
		List<WebElement> headers=table.findElements(By.tagName("th"));
		
		
		for (WebElement header : headers) 
		{
			String text=header.getText();
			System.out.println(text);
			
		}
		
		List<WebElement>allrows=table.findElements(By.cssSelector("tbody tr"));
		int size= allrows.size(); 
		System.out.println("Row Size: " +size);
		
		if(size==3)
		{
			System.out.println("Pass");
		}
		else System.out.println("Fail");
		
		for (WebElement rows : allrows) {
		List <WebElement>Columns=rows.findElements(By.tagName("td"));
		WebElement firstColumn=Columns.get(0);
		System.out.println(firstColumn.getText());
		}
	
		for (int i = 0; i < size; i++) {
		List <WebElement>row=allrows.get(i).findElements(By.tagName("td"));
		WebElement lastname= row.get(1);
		String text=lastname.getText();
		System.out.println(text);
		if (text.equals("Chatterjee"))
		{
			WebElement input=row.get(3).findElement(By.tagName("input"));
			input.click();
			break;
		}
			
		}
	}

}
