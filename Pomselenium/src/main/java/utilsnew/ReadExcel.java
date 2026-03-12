package utilsnew;


//import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] getExcelData(String fileName) {
		
		
		//String fileLocation= "./test-data/Login-datas.xlsx";
		//FileInputStream fis = new FileInputStream(fileLocation);
		XSSFWorkbook book = null;
		try {
			book = new XSSFWorkbook("./data/" +fileName+ ".xlsx");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		XSSFSheet sheet=book.getSheetAt(0);
		int lastRow=sheet.getLastRowNum();
	    int physicalNum= sheet.getPhysicalNumberOfRows();
	    short lastCell=sheet.getRow(0).getLastCellNum();
	    System.out.println("No of cells: " +lastCell);
	    System.out.println("Inclusive of header " +physicalNum);
		System.out.println("No of row: " + lastRow);
		XSSFRow row;
		String[][] data=new String[lastRow][lastCell]; 
		
		
		for (int i = 1; i <= lastRow; i++) {
			row = sheet.getRow(i);
		
		for (int j = 0; j < lastCell; j++) {
			XSSFCell cell = row.getCell(j);
			DataFormatter dft=new DataFormatter();
			String value=dft.formatCellValue(cell);
			//String value = cell.getStringCellValue();
			System.out.println(value);
			data[i-1][j]=value;
		}
	    }
		try {
			book.close();
		} 
		catch (IOException e) 
		{
		
			e.printStackTrace();
		}
		return data;
		
	} 
}


