package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotation;

public class MyHomePage extends Annotation{
	
	public MyHomePage() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath = "//a[text()='Leads']")
	WebElement leadsLink;
	
	
	public MyLead clickLead() {
				
		click(leadsLink);
		return new MyLead();
					
	}
}
