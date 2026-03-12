package beginselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingInputs {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/edit");
		
		driver.findElement(By.id("fullName")).sendKeys("Ranjana");
		driver.findElement(By.id("join")).sendKeys(" human",Keys.TAB);
		String myValue= driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(myValue);
		driver.findElement(By.id("clearMe")).clear();
		boolean isEdit=driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(isEdit);
		String isReadOnly=driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		System.out.println(isReadOnly);
		driver.quit();
		
		

	}

}
