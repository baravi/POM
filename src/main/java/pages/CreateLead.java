package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotation;

public class CreateLead extends Annotation{
	
	public CreateLead() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id = "createLeadForm_companyName")
	WebElement cName;
	
	@FindBy(id = "createLeadForm_firstName")
	WebElement fName;
	
	@FindBy(id = "createLeadForm_lastName")
	WebElement lName;
	
	@FindBy(name = "submitButton")
	WebElement submitButton;
	
	@FindBy(className = "errorList")
	WebElement errormsg;
	
	
	
	public CreateLead inputCompanyName(String company) {
		
		type(cName, company);
		return this;
			}
	
	public CreateLead inputFirstName(String ffname) {
				type(fName, ffname);
		return this;
						
	}
	public CreateLead inputLastName(String llname) {
				type(lName, llname);
		return this;
						
	}
	
	public CreateLead clikLeadError() {
		click(submitButton);
				return this;
			
}
	
	public CreateLead Errorverify(String expectedText) {
		verifyPartialText(errormsg, expectedText);
		return this;
			
}
	
	public ViewLead clikLead() {
				click(submitButton);
						return new ViewLead();
					
	}
}
