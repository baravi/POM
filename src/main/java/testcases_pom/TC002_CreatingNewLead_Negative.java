package testcases_pom;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.Annotation;
import wdMethods.SeMethods;
import week5day1.ReadExcelForCreateLeadData;

public class TC002_CreatingNewLead_Negative extends Annotation {
	
	@BeforeTest
	public void testdata() {
		
		excelFileName ="CreateLead_Negative";
		testName = "Test";
		testDesc = "Creating a new lead";
		moduleName ="LeadCreation";
		author ="Baravi ";
		category ="Smoke";
		
			
	}

	@Test(dataProvider="fetchdata")
	public void createLead(String company , String ffname ,String llname,String expectedText){
		
		new MyHomePage()
		.clickLead()
		.myLead()
		.inputCompanyName(company)
		.inputFirstName(ffname)
		.inputLastName(llname)
		.clikLeadError()
		.Errorverify(expectedText);
				
	
	}

}



