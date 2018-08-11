package week5day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import wdMethods.Annotation;

public class ReadExcelForCreateLeadData extends Annotation{

	@Test
	public Object [][] ReadExcel() throws IOException {

		//To open Excel
		XSSFWorkbook wBook =  new XSSFWorkbook("./TestData/CreateLead.xlsx");
		
		//To navigate to sheet
		XSSFSheet sheet = wBook.getSheet("Sheet1");
		//To find the row count
		int rowCount = sheet.getLastRowNum();
		
	
		//To find column value
		short columnCount = sheet.getRow(0).getLastCellNum();//2
		//To Read Data
		
		Object [][] data = new Object[rowCount][columnCount];
		
		for(int i=1;i<=rowCount;i++) {
		//Navigate to row			
			XSSFRow row = sheet.getRow(i);

		//Navigate to column
			for (int j=0;j<columnCount;j++) {

				XSSFCell cell = row.getCell(j);
		//To read the cell value //i-0 =  need to save data in array from 0 
				data[i-1][j] = cell.getStringCellValue();
				
			}
		}
		wBook.close();
		return data;
	}
}
