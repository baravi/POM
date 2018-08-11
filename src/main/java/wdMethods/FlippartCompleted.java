package wdMethods;
//import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class FlippartCompleted extends SeMethods{
	@Test	
	public void contactSeMethods() throws InterruptedException {

		startApp("chrome", "https://www.flipkart.com/");
		WebElement elePopUp = locateElement("xpath","//button[text() = '✕']");
		click(elePopUp);
		WebElement eleTvApp = locateElement("xpath","//span[text()='TVs & Appliances']");
		WebElement eleSam = locateElement("xpath","//ul[@class='_3GtRpC']/following :: span[text()='Samsung']");
		mouseOver(eleTvApp, eleSam);
		//CHild to parent
		WebElement eleMin = locateElement("xpath","//option[text()='Min']/parent :: select");
		
	
		selectDropDownUsingValue(eleMin,"25000");
		//Child to parent
		
		WebElement eleMax = locateElement("xpath","//option[text()='₹60000+']/parent :: select");
		selectDropDownUsingValue(eleMax,"60000");
		
		Thread.sleep(3000);
		WebElement eleScreen = locateElement("xpath","//div[text()='Screen Size']");
		click(eleScreen);
	
		
		WebElement eleSize = locateElement("xpath","//div[text()='48 - 55']");
		click(eleSize);
		
		//WebElement eleFirst = locateElement("xpath", "//div[@class='_1UoZlX']/a[1]");
		WebElement eleFirst = locateElement("xpath","//div[@class='col col-7-12']/div[1]");
		click(eleFirst);
	switchToWindow(1);
WebElement eleCompOne = locateElement("xpath","//span[text()='Compare']");
	click(eleCompOne);
	closeWindow();
	switchToWindow(0);
	WebElement eleSecond = locateElement("xpath","//div[@class='col col-7-12']/div[2]");
click(eleSecond);
		switchToWindow(1);
		WebElement eleCompTwo = locateElement("xpath","//span[text()='Compare']");
		click(eleCompTwo);
Thread.sleep(3000);
WebElement eleCompare = locateElement("xpath","//span[text()='COMPARE']");
click(eleCompare);
//		Thread.sleep(5000);
//		WebElement eleProductOne = locateElement("xpath","(//div[text()='₹44,999'])[1]");
//		String priceOne = getText(eleProductOne);
//		WebElement eleProductTwo = locateElement("xpath","(//div[text()='₹55,999'])[1]");
//		String priceTwo = getText(eleProductTwo);
//		System.out.println(priceOne);
	}

}

