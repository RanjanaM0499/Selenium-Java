package utils;

import utilsnew.ReadExcel;

public class DataUtils {
	
	
	@org.testng.annotations.DataProvider(name="login",/*indices = {0,2}*/ parallel=true) 
	
	public String[][] getData()
	
	{
		
		String[][] excelData=ReadExcel.getExcelData();	
		
//		String[][] data=new String[3][2];
//		data[0][0]= "mranjan@0499@gmail.com";
//		data[0][1]="pass@123";
//		
//		data[1][0]="mranjan@0499@yahoo.com";
//		data[1][1]="pass@1234";
//		
//		data[2][0]="mranjan@0499@google.com";
//		data[2][1]="pass@1234";
		
	
		return excelData;
		
	}

}
