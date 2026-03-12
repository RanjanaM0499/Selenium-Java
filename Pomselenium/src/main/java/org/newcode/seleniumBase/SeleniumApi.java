package org.newcode.seleniumBase;

import org.openqa.selenium.WebElement;

public interface SeleniumApi {
	
	/**This is used to launch the chrome browser with the given URL 
	 * @author mranj
	 * @param url
	 * @exception NullPointerException, URLMalfunction
	 */
	
	
	void setUp(String url);
	
	/**This method is used to launch the given browser with the given URL 
	 * @author mranj
	 * @param url
	 * 
	 * @param browserName
	 * @param url
	 */
	
	void setUp(Browser browserName, String url);
	
	/**
	 * This is used to close the current tab browser
	 */
	void close();
	
	/**
	 * This is used to quit the entire browser
	 */
	void quit();
	
	/**
	 * This method is used to find element in the webpage
	 * @param type-element type example- id,name,linkText,tagName
	 * @param value-Element value
	 * @return WebElement
	 */
	
	WebElement element(Locators type, String value);
	
	
	
	/**
	 * This method is used to handle windows
	 * @param i
	 */
	void switchToWindow(int i);
	
	/**
	 * This method is used to select using the value attribute
	 * @param ele
	 * @param value
	 */
	
   void selectByValue(WebElement ele, String value);
   
   /**
    * This method is used to select using the text shown in UI
    * @param ele
    * @param text
    */
   
   void selectByVisibleText(WebElement ele, String text);
   
   
   /**
    * This method is used to select using the option position
    * @param ele
    * @param position
    */
   
   void selectByIndex(WebElement ele, int position);
   
   
   /**
    * This method is used to click the webelement in a web page(eg: button,link)
    * @param ele
    */
   void click(WebElement ele);
   
   /**
    * This method is used to clear the values and type the given text
    * @param ele
    */
   
   void type(WebElement ele, String testData);
   
   /**
    * This method is used to append a value to the existing value in the field
    * @param ele
    */
   
   void  appendText(WebElement ele, String  testData);
   
   
   /**
    * This method is used to get the title of the current page
    * @return
    */
   String getTitle();
   
   /**
    * This method is used to get the current url of the page
    * @return
    */
   String getURL();
   
   
   /**
    *This method is used to check whether the expecting element is displayed or not.
    *(Where on the page is the top left-hand corner of the rendered element?)
    * @return
    */
   boolean isDisplayed(WebElement ele);
   
   


}
