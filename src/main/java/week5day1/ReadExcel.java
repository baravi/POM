package week5day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	@Test
	public void ReadExcel() throws IOException {

		//To open Excel
		XSSFWorkbook wBook =  new XSSFWorkbook("./TestData/TestDAta.xlsx");
		
		//To navigate to sheet
		XSSFSheet sheet = wBook.getSheet("Credentials");
		//To find the row count
		//int rowCount = sheet.getLastRowNum();
		
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows(); //4
		//To find column value
		short columnCount = sheet.getRow(0).getLastCellNum();//2
		//To Read Data
		for(int i=0;i<physicalNumberOfRows;i++) {
		//Navigate to row			
			XSSFRow row = sheet.getRow(i);

		//Navigate to column
			for (int j=0;j<columnCount;j++) {

				XSSFCell cell = row.getCell(j);
		//To read the cell value
				String data = cell.getStringCellValue();
				System.out.println(data);
			}
		}
		wBook.close();
	}
}
