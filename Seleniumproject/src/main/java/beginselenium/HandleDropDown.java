package beginselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		WebElement fruits=driver.findElement(By.id("fruits"));
		Select myFruits=new Select(fruits);	
		myFruits.selectByVisibleText("Mango");
		Thread.sleep(3000);
		myFruits.selectByVisibleText("Orange"); 
		System.out.println(myFruits.isMultiple());
		List<WebElement> allFruits = myFruits.getOptions();
		allFruits.forEach(i-> System.out.println(i.getText()));
		
		WebElement country=driver.findElement(By.id("country"));
		Select myCountry=new Select(country);
		myCountry.selectByValue("India");
		WebElement selectedCountry=myCountry.getFirstSelectedOption();
		System.out.println(selectedCountry.getText());
		
		
		
		
		
		WebElement hero=driver.findElement(By.id("superheros"));
		Select myHero=new Select(hero);
		boolean isMulti=myHero.isMultiple();
		System.out.println("Is Multiple?" +isMulti);
		myHero.selectByIndex(3);
		myHero.selectByValue("bp");
		
		
		/**List<WebElement> allHero=myHero.getAllSelectedOptions();
		for (WebElement webElement: myHero) {
			System.out.println(webElement.getText());
			
		}
		**/
		
		//Deselect is work only for multiselect dropdown
		myHero.deselectByIndex(3);
		 
		//myFruits.deselectByVisibleText("orange"); -Applicable only multiselect dropdown
		
		//If no select class dropdown, then use Bootstrap dropdown-interview question
	}

}
