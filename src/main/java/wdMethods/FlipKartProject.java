package wdMethods;
	import java.util.concurrent.TimeUnit;
//import org.junit.Test;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

	public class FlipKartProject extends SeMethods  {
	@Test	
		public void flipkartMethod() throws InterruptedException
		{
			startApp("Chrome", "https://www.flipkart.com/");
			WebElement closePopUp = locateElement("xpath", "/html/body/div[2]/div/div/button");
			click(closePopUp);
			
			WebElement mouseHover = locateElement("xpath", "//span[text() ='TVs & Appliances']");
			
			actions(mouseHover);
			
					Thread.sleep(5000);
			WebElement samsung = locateElement("xpath", "//*[@id='container']/div/header/div[3]/ul/li[2]/ul/li/ul/li[1]/ul/li[8]/a/span");
			click(samsung);
			
			WebElement minValue = locateElement("xpath", "//*[@id='container']/div/div[1]/div[2]/div/div[1]/div/div[1]/div/section[2]/div[4]/div[1]/select");
		selectDropDownUsingIndex(minValue, 3);
		
		WebElement maxValue = locateElement("xpath", "//*[@id='container']/div/div[1]/div[2]/div/div[1]/div/div[1]/div/section[2]/div[4]/div[3]/select");
		selectDropDownUsingIndex(maxValue, 3);
			
		WebElement scrnSize = locateElement("xpath", "//div[text()='Screen Size']");
		click(scrnSize);
		
		
		WebElement selScrnSize = locateElement("xpath", "//div[text()='48 - 55']");
				click(selScrnSize);
				
				
		
		//div[text()='48 - 55']
			
		}
		
		

//			Actions builder = new Actions(driver);
//
//			WebElement eleTv = driver.findElementByXPath("//*[@id=\'container\']/div/header/div[3]/ul/li[2]/a/span");
//
//			WebElement eleTho = driver.findElementByXPath("//*[@id='container']/div/header/div[3]/ul/li[2]/ul/li/ul/li[1]/ul/li[5]/a/span");
//
//			builder.moveToElement(eleTv).pause(1000).click(eleTho).perform();
//
//			System.out.println("Completed");

		

	}


