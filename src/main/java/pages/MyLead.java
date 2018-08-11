package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotation;

public class MyLead extends Annotation{
	
	public MyLead() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(linkText = "Create Lead")
	WebElement createLeadLink;
	
	
	public CreateLead myLead() {
				
		click(createLeadLink);
		return new CreateLead();
					
	}
}
