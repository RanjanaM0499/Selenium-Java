package framework;

import org.newcode.seleniumBase.Browser;
import org.newcode.seleniumBase.Locators;
import org.newcode.seleniumBase.SeleniumBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrowserTest extends SeleniumBase {
	
	@Test
	void searchLetCode() throws InterruptedException
	
	{
		
	
		setUp(Browser.CHROME,"https://www.google.com/");
		WebElement search= element(Locators.name,"q");
        type(element(Locators.name,"q"),"Letcode with koushik", Keys.ENTER);
     	Thread.sleep(3000);
		quit();
	}

}
