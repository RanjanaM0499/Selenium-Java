package utilsnew;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testnew extends Report {
	 
	@BeforeTest
	void setData()
	{
 		description="First test report";
		author="Ranjana";
		category="Sanity";
	}
	@Test
	void testNew()
	{
		System.out.println("Test begins");
		reportStep("pass", "Provide description");
		System.out.println("Test ends");
	}

}
