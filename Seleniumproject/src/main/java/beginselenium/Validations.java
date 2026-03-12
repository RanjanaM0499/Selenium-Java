package beginselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validations {

	public static void main(String[] args) {
	
		
		/*
		 * WebDriver driver =new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://demo.guru99.com/"); WebElement
		 * visible=driver.findElement(By.xpath("(//form[@action='index.php']//input)[2]"
		 * )); boolean button=visible.isDisplayed(); System.out.println("Submit button:"
		 * +button);
		 */
		
		
		/*
		 * //isEnabled WebDriver driver=new ChromeDriver();
		 * driver.manage().window().maximize(); driver.get("https://letcode.in/edit");
		 * WebElement enable=driver.findElement(By.id("noEdit"));
		 * System.out.println(enable.isEnabled());
		 */
		
		/*
		 * WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://letcode.in/button"); WebElement
		 * btn=driver.findElement(By.id("isDisabled"));
		 * System.out.println(btn.isEnabled());
		 */
		
		//contains() func
		/*
		 * WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://semantic-ui.com/elements/button.html"); WebElement
		 * btnfunc=driver.findElement(By.xpath(
		 * "//button[normalize-space(text())='Button']"));
		 * System.out.println(btnfunc.isEnabled()); String test=
		 * btnfunc.getAttribute("class"); System.out.println(test.contains("disabled"));
		 */
		
	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/radio");
		WebElement checked=driver.findElement(By.xpath("(//label[@class='checkbox']//input)[1]"));
		System.out.println(checked.isSelected());
		driver.quit();
		
		
	
}

}
