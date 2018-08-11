package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotation;

public class ViewLead extends Annotation{
	
	public ViewLead() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id = "viewLead_firstName_sp")
	WebElement viewLead;
	
	
	public ViewLead viewLead(String expText) {
				
		verifyExactText(viewLead, expText);
		return this;
					
	}
}
