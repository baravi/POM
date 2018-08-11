package testcases_pom;
import java.io.IOException;

//import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.Annotation;
import wdMethods.SeMethods;
import week5day1.ReadExcelForCreateLeadData;

public class TC001_CreatingNewLead extends Annotation {
	
	@BeforeTest
	public void testdata() {
		
		excelFileName ="CreateLead";
		testName = "Test";
		testDesc = "Creating a new lead";
		moduleName ="moduleName";
		author ="author";
		category ="category";
		
			
	}

	@Test(dataProvider="fetchdata")
	public void createLead(String company , String ffname ,String llname){
		
		new MyHomePage()
		.clickLead()
		.myLead()
		.inputCompanyName(company)
		.inputFirstName(ffname)
		.inputLastName(llname)
		.clikLead()
		.viewLead(ffname);
		
	
	
	}

}



