package org.newcode.seleniumBase;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBase implements SeleniumApi {

	long timeOuts=30;
	long maxWaitTime=10; 
	
	
	RemoteWebDriver driver=null;
	WebDriverWait wait=null;


	public void setUp(String url) {

	    driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		wait = new WebDriverWait(driver, Duration.ofSeconds(maxWaitTime));

	}


	public void setUp(Browser browserName, String url) {

		switch (browserName)
		{

		case CHROME:
			
			driver=new ChromeDriver();
			break;

		case FIREFOX:
			
		   driver = new FirefoxDriver(); 
			break;
		
		case EDGE:
			 driver=new EdgeDriver();
			break;

		default:
			
			System.err.println("Driver is not defined");
			break;
		}
		
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		wait = new WebDriverWait(driver, Duration.ofSeconds(maxWaitTime));

	}


	public void close() {
		driver.close();


	}

	
	public void quit() {
		driver.quit();

	}


	public WebElement element(Locators type, String value) {
		try {
			switch (type) {
			case id:
				return driver.findElement(By.id(value));
			case name:
				return driver.findElement(By.name(value));
			case xpath:
				return driver.findElement(By.xpath(value));
			case tagName:
				return driver.findElement(By.tagName(value));
			case className:
				return driver.findElement(By.className(value));
			case linkText:
				return driver.findElement(By.linkText(value));
			case partialLinkText:
				return driver.findElement(By.partialLinkText(value));
			case cssSelector:
				return driver.findElement(By.cssSelector(value));
				
				
			default:
				break;
			

			}
		} catch (NoSuchElementException e) 
		{
			System.err.println("Element not found =>" +e.getMessage());
			throw new NoSuchElementException("Element not found");
		}
        catch(WebDriverException e)
		{
        	System.err.println(e.getMessage());
        	throw new NoSuchElementException("Unknow error occured");
		}
		 catch(Exception e)
		{
        	System.err.println(e.getMessage());
		}
		return null;
	}


	public void switchToWindow(int i) {
		
		Set <String> windowHandles=driver.getWindowHandles();
		ArrayList<String> list=new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(i));
		

 
	}

	
	public void selectByValue(WebElement ele, String value) {
		
		WebElement element=isElementVisible(ele);
		new Select(element).selectByValue(value);

	}

	
	public void selectByVisibleText(WebElement ele, String text) {

		WebElement element=isElementVisible(ele);
		new Select(element).selectByVisibleText(text);

	}

	
	public void selectByIndex(WebElement ele, int position) {

		WebElement element=isElementVisible(ele); 
		new Select(element).selectByIndex(position);

	}

	public void click(WebElement ele) {
		
		WebElement element=wait.withMessage("Element is not clickable")
				.until(ExpectedConditions.elementToBeClickable(ele));
		element.click();


	}

	
//	public void type(WebElement ele, String testData) {
//	    WebElement element = isElementVisible(ele);
//	    element.clear();
//	    element.sendKeys(testData);
//
//		}


	private WebElement isElementVisible(WebElement ele) {
		WebElement element= wait.withMessage("Element is not visible")
				.until(ExpectedConditions.visibilityOf(ele));
		return element;
	}

	public void type(WebElement ele, String testData,Keys keys) {
    WebElement element = isElementVisible (ele);
    element.clear();
    element.sendKeys(testData,keys);

	}
	
      
	public void appendText(WebElement ele,String testData ) {
		WebElement element = isElementVisible (ele);
	    element.sendKeys(testData);


	}


	public String getTitle() {
		return driver.getTitle();

	}

	
	public String getURL() {
		return driver.getCurrentUrl();
	}

	
	public boolean isDisplayed(WebElement ele) {
        return ele.isDisplayed();
	}


	@Override
	public void type(WebElement ele, String testData) {
		
	}



	


}
