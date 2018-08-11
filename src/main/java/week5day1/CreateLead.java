package week5day1;
import java.io.IOException;

//import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import wdMethods.Annotation;
import wdMethods.SeMethods;
public class CreateLead extends Annotation {

	@Test(dataProvider="providedata")
	public void createLead(String company , String name ,String lname) throws InterruptedException {


		//Creating Lead

		WebElement eleCRMSFALink = locateElement("xpath", "//*[@id=\'button\']/a/img");
		click(eleCRMSFALink);
		WebElement eleCreateLeadLink = locateElement("linktext", "Create Lead");

		//GetText
		String text = getText(eleCreateLeadLink);
		System.out.println(text);

		click(eleCreateLeadLink);

		WebElement companyNameFiled = locateElement("xpath", "//*[@id=\'createLeadForm_companyName\']");
		type(companyNameFiled,company );
		WebElement firstNameFiled = locateElement("xpath", "//*[@id=\'createLeadForm_firstName\']");
		type(firstNameFiled, name);
		WebElement lastNameFiled = locateElement("xpath", "//*[@id=\'createLeadForm_lastName\']");
		type(lastNameFiled, lname);


		//DropDown by text value

		WebElement ddText = locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingText(ddText, "Partner");

		WebElement ddIndex = locateElement("createLeadForm_marketingCampaignId");
		selectDropDownUsingIndex(ddIndex, 1);

		WebElement clickCreateLeadFinish = locateElement("name", "submitButton");
		click(clickCreateLeadFinish);
			}
	
	
	@DataProvider(name ="providedata") //For data provider , we need to create method. so created a method  with name sendDatas

	//@DataProvider(name ="providedata",indices = {1}) -  to run the first set of data alone 
	
	//Object is a super class of String and Integer. So we are using Object here 
	public Object[][] sendData() throws IOException {
		
		ReadExcelForCreateLeadData dataSet = new ReadExcelForCreateLeadData();
		return dataSet.ReadExcel();
		
		
		//Object [][] data = new Object[2][3];
//		
//	data[0][0] = "test";
//	data[0][1] = "baravi";
//	data[0][2] = "C";
//	
//	data[1][0] = "testing";
//	data[1][1] = "gopi";
//	data[1][2] = "K";
//	return data;
	
	
			
		
	}

}
