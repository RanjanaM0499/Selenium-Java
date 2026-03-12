package utilsnew;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AutomationReport {

	public static void main(String[] args) {
		
		
		    ExtentSparkReporter report=new ExtentSparkReporter("./TestReport.html");
		    ExtentReports extent =new ExtentReports();
		    extent.attachReporter(report);	
		    
		    
		    
		   ExtentTest test= extent.createTest("TC001- Search product");
		   test.assignAuthor("ranjan");
		   test.assignCategory("Regression");
		   test.pass("Search the product name");
		   test.pass("Check if the product is displayed");
		   test.pass("Add the product to cart");
		   
		   ExtentTest test1= extent.createTest("TC002-  Remove from wishlist");
		   test1.pass("Go to wishlist page");
		   test1.pass("Click on the product");
		   test1.pass("Click on the remove option");
		   
		   ExtentTest test2= extent.createTest("Add Payment");
		   test2.pass("Go to the payment option");
		   test2.pass("Enter the amount");
		   test2.fail("Click on the pay option", MediaEntityBuilder.createScreenCaptureFromPath("downloadimage.png").build());
		   
		   extent.flush();
		  // System.out.println("Completed");
		    
		    }

}
