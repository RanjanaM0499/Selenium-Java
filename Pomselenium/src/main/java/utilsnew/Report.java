package utilsnew;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {
	
	
	
	ExtentReports extent;
	ExtentTest test;
	String description="";
	String author="" ;
	String category="";
	 
	 @BeforeSuite
	protected void startReport()
	{
		ExtentSparkReporter report=new ExtentSparkReporter("./TestReport.html");
	    extent =new ExtentReports();
	    extent.attachReporter(report);	
	}
	@AfterSuite
	protected void stopReport()
	{
		 extent.flush();
	}
	
	@BeforeClass
    void writeTest()
    {
    	   test= extent.createTest(description);
		   test.assignAuthor(author);
		   test.assignCategory(category); 
    }
    
    void reportStep(String status, String desc)
    {
     switch (status.toLowerCase()) {
	case "pass":
		test.pass(desc);
		
		break;
	case "fail":
		test.fail(desc);
		
		break;
	case "info":
		test.info(desc);
		
		break;
	case "warning":
		test.warning(desc);
		
		break;

	default:
		System.err.println("status is not defined");
		break;
	}	
    }
    
    
    
    
    
//	public static void main(String[] args) {
//		
//		
//		    
//		    
//		    
//		    
//		
//		   test.pass("Search the product name");
//		   test.pass("Check if the product is displayed");
//		   test.pass("Add the product to cart");
//		   
////		   ExtentTest test1= extent.createTest("TC002-  Remove from wishlist");
////		   test1.pass("Go to wishlist page");
////		   test1.pass("Click on the product");
////		   test1.pass("Click on the remove option");
//		   
//		   ExtentTest test2= extent.createTest("Add Payment");
//		   test2.pass("Go to the payment option");
//		   test2.pass("Enter the amount");
//		   test2.fail("Click on the pay option", MediaEntityBuilder.createScreenCaptureFromPath("downloadimage.png").build());
//		   
//		  
//		   //System.out.println("Completed");
//		    
//		    }

}
