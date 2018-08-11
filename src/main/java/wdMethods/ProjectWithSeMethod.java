package wdMethods;

import org.apache.poi.util.SystemOutLogger;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class ProjectWithSeMethod extends SeMethods {
@Test
		public void projectWithSeMethod(){
			
		
		
		 startApp("chrome", "http://leaftaps.com/opentaps");
			WebElement eleUserName = locateElement("id", "username");
			type(eleUserName, "DemoSalesManager");
			WebElement elePassword = locateElement("id","password");
			type(elePassword, "crmsfa");
			WebElement eleLogin = locateElement("class","decorativeSubmit");
			click(eleLogin);
			
			
			WebElement crmLink = locateElement("linktext","CRM/SFA");
			click(crmLink);
			
			WebElement contactLink = locateElement("linktext","Contacts");
			click(contactLink);
			
			WebElement CreatecontactLink = locateElement("linktext","Create Contact");
			click(CreatecontactLink);
			
			WebElement firstName = locateElement("id","firstNameField");
			type(firstName, "Test");
			
			WebElement secondName = locateElement("id","lastNameField");
			type(secondName, "Leaf");
			
			WebElement firstNameLocal = locateElement("id","createContactForm_firstNameLocal");
			type(firstNameLocal, "FirstNmaeLocal");
			
			WebElement lastNameLocal = locateElement("id","createContactForm_lastNameLocal");
			type(lastNameLocal, "LastNameLocal");
			
			WebElement title = locateElement("id","createContactForm_personalTitle");
			type(title, "Mr");
			
			WebElement profTitle = locateElement("id","createContactForm_generalProfTitle");
			type(profTitle, "Testing");
			
			WebElement deptName = locateElement("id","createContactForm_departmentName");
			type(deptName, "Testing");
			
			
			WebElement prefCurrerncy = locateElement("id","createContactForm_preferredCurrencyUomId");
			selectDropDownUsingIndex (prefCurrerncy,1);
			
			WebElement desc = locateElement("id","createContactForm_description");
			type(desc, "Testing");
			
			WebElement note = locateElement("id","createContactForm_importantNote");
			type(note, "Testing");
			
			WebElement areaCode = locateElement("id","createContactForm_primaryPhoneAreaCode");
			type(areaCode, "600");
			
			WebElement extn = locateElement("id","createContactForm_primaryPhoneExtension");
			type(extn, "91");
			
			WebElement email = locateElement("id","createContactForm_primaryEmail");
			type(email, "Testing@test.com");
			
			WebElement pPhone = locateElement("id","createContactForm_primaryPhoneNumber");
			type(pPhone, "1234567890");
			
			WebElement phoneAsk = locateElement("id","createContactForm_primaryPhoneAskForName");
			type(phoneAsk, "123");
					
			
			WebElement toName = locateElement("id","generalToNameField");
			String attribute = getAttribute(toName);
			
			WebElement attName = locateElement("id","createContactForm_generalAttnName");
			type(attName, "Chennai");
			
			WebElement addrOne = locateElement("id","createContactForm_generalAddress1");
			type(addrOne, "Nanga");
			
			WebElement addrTwo = locateElement("id","createContactForm_generalAddress2");
			type(addrTwo, "Leaf");
			
			WebElement city = locateElement("id","createContactForm_generalCity");
			type(city, "Chennai");
			
			WebElement phoneAskNw = locateElement("id","createContactForm_primaryPhoneAskForName");
			type(phoneAskNw, "123456789");
			
			WebElement postalCoe = locateElement("id","createContactForm_generalPostalCode");
			type(postalCoe, "600100");
			
			WebElement postalCode = locateElement("id","createContactForm_generalPostalCodeExt");
			type(postalCode, "600100");
			
			WebElement state = locateElement("id","createContactForm_generalStateProvinceGeoId");
			selectDropDownUsingIndex (state,1);
			

			WebElement country = locateElement("id","createContactForm_generalCountryGeoId");
			selectDropDownUsingIndex (country,1);
			

			WebElement submit = locateElement("xpath","//input[@class ='smallSubmit']");
			click(submit);
			
							
			WebElement nameC = locateElement("xpath","//span[@id='viewContact_fullName_sp']");
			String name = getText(nameC);
							
			if(name.contains (attribute)) {
				
				System.out.println("NameIsCorrect");
				}
				else {
		
					System.out.println("NameNotCorrect");
				}
			
							
			//Edit
			WebElement edit = locateElement("linktext","Edit");
			click(edit);
			
			
			WebElement ddMarket = locateElement("id", "addMarketingCampaignForm_marketingCampaignId");
			String selectDropDownUsingIndexReturn = selectDropDownUsingIndexReturn(ddMarket, 1);
			
			System.out.println(selectDropDownUsingIndexReturn(ddMarket, 1));
			
			
			WebElement add = locateElement("xpath", "//input[@value='Add']");
			click(add);
			
			WebElement update = locateElement("xpath", "//input[@value='Update']");
			click(update);
			
			WebElement campCheck = locateElement("xpath", "//span[@id='viewContact_marketingCampaigns_sp']");
		System.out.println(campCheck.getText());	
		
		if(selectDropDownUsingIndexReturn.equals(campCheck))
		{
			System.out.println("cam matching");
		}
			
		System.out.println("cam matching");
			
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		}
}





