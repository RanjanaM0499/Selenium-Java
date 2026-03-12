package beginselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleButtons {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/button");
		
		WebElement ele=driver.findElement(By.id("position"));
		Point point=ele.getLocation();
		int x=point.getX();
		int y=point.getY();
		System.out.println("x =>"+x + "y =>" +y);
		
		
		WebElement btnColor=driver.findElement(By.id("color"));
		String color = btnColor.getCssValue("background-color");
		System.out.println(color);
		
		Rectangle rect= driver.findElement(By.id("property")).getRect();
		//System.out.println(rect.getHeight());
		//System.out.println(rect.getWidth());
		//System.out.println(rect.getPoint());
		Dimension dime=rect.getDimension();
		System.out.println(dime.getHeight());
		System.out.println(dime.getWidth());
		
		
		boolean disabled=driver.findElement(By.id("isDisabled")).isEnabled();
		System.out.println(disabled);
		
		driver.quit(); 
		
		
		
	
		
		

	}

}
