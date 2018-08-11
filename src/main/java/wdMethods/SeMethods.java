package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods extends Reporter  implements WdMethods{

	private static final Boolean TRUE = null;
	private static final Boolean FALSE = null;
	//Chromedriver is inside Remotewebdriver
	
	public static RemoteWebDriver driver ;
	Actions builder;
	int i = 1;
	
	public void startApp(String browser, String url) 
	{
		
		if (browser.equalsIgnoreCase("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\BaraviPriya\\Desktop\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();			
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
			driver = new FirefoxDriver();		
		}
		 builder = new Actions(driver);
		
		driver.manage().window().maximize();
		driver.get(url);
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		System.out.println("The Browser "+browser+" is Launched Successfully");
		takeSnap();
		
		
	}
	
	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id": 	  return driver.findElementById(locValue);
			case "class": return driver.findElementByClassName(locValue);
			case "xpath": return driver.findElementByXPath(locValue);
			case "name": return driver.findElementByName(locValue);	
			case "linktext": return driver.findElementByLinkText(locValue);
			case "partiallinktext" : return driver.findElementByPartialLinkText(locValue);
			case "tagname" : return driver.findElementByTagName(locValue);
			}

		}
		catch (WebDriverException e) {
			System.err.println("Exception occured" +e);
		}
		catch (Exception e)//CAn have multiple catch block. Exeception is the parent so, we need to use at the last in hierarchy
		{
			System.err.println("UnknownExcepption occured");
		}

		return null;

	}

	//To Understand MethodOverloading

	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
	}

	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);

		}
		catch (Exception e) //Exception is parent level of any exception
		{
			System.err.println("Exception occured_PrintingInRedColourSoUsedErr."+e);
			throw new RuntimeException();

			//Syntax for throw
		}

		finally {
			takeSnap();
		}

		System.out.println("The Data "+data+" is Entered Successfully");

	}

	public void click(WebElement ele) {
		try {
			ele.click();
		}
		catch (Exception b) {
			System.out.println("The Element" +ele+ "is clicked Successfully");
			System.out.println(b); // to print the exception name
		}
		finally {
			takeSnap();	
		}

	}

	public void mouseOver(WebElement ele, WebElement el){
		
		builder.moveToElement(ele).pause(1000).perform();
		click(el);
		
	}
	
	
	public void clickWithoutSnap(WebElement ele) {
		try {
			ele.click();
		}
		catch (Exception b) {
			System.out.println("The Element" +ele+ "is clicked Successfully");
			System.out.println(b); // to print the exception name
		}

	}

	public String getText(WebElement ele) {
		String txt = null; // return need to return something so we are assigning null value other wise it will throw error
		try {
			txt = ele.getText();
			System.out.println(txt);
		} catch (Exception e) {
		}	
		return txt;

	}
	
	public String getAttribute(WebElement ele)
	{
		String txt1=ele.getAttribute("value");
		
		System.out.println(txt1);
		
		return txt1;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		try {
			Select dropDown = new Select(ele);
			dropDown.selectByVisibleText(value);

		}
		catch (Exception e)	{
			System.err.println(e+"exception occured");
		}

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {

		Select dropDown = new Select(ele);
		dropDown.selectByIndex(index);
		//String ddSelected = dropDown.getFirstSelectedOption().getText();

	}
	
	public void selectDropDownUsingValue(WebElement ele, String value)	{
		Select dropDown = new Select(ele);
		dropDown.selectByValue(value);
	
	}
	
	public String selectDropDownUsingIndexReturn(WebElement ele, int index) {

		Select dropDown = new Select(ele);
		dropDown.selectByIndex(index);
		String ddSelected = dropDown.getFirstSelectedOption().getText();
return ddSelected;

	}


	public boolean verifyTitle(String expectedTitle) {
		driver.getTitle();

		Boolean flag = FALSE;
		if(driver.getTitle().equals(expectedTitle))
		{
			flag = TRUE;
		}
		return flag;
	}

	public void verifyExactText(WebElement ele, String expectedText) {


		if(ele.getText().equals(expectedText))
		{
			System.out.println("Text are matching");
		}
		System.out.println("Text are not matching");

	}


	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

		if((expectedText.contains(ele.getText())))
		{
			System.out.println("Text are matching");
		}
			else {
				System.out.println("Text are not matching");
			}
		}
		

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		value = ele.getAttribute(attribute);
		System.out.println(value);

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		value = ele.getAttribute(attribute);
		System.out.println(value);

	}

	public void verifySelected(WebElement ele) {
		//ele.isSelected();
		if(ele.isSelected()) {
			System.out.println("Selected");
		}
		System.out.println(" Not Selected");

	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		if(ele.isDisplayed()) {
			System.out.println("Selected");
		}
		System.out.println(" Not Selected");
	}

	public void switchToWindow(int index) {

		String firstWidnow = driver.getWindowHandle();
		//driver.switchTo().window(firstWidnow);
		//driver.findElementById("tryhome").click();
		Set<String> allWindowHandles = driver.getWindowHandles();
		List<String> allListwindowHandles = new ArrayList<String>();
		allListwindowHandles.addAll(allWindowHandles);
		driver.switchTo().window(allListwindowHandles.get(index));

	}

	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);
	}

	public void acceptAlert() {

		//driver.switchTo().alert().accept();
		Alert myAlert = driver.switchTo().alert();
		myAlert.accept();

	}

	public void dismissAlert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();

	}

	public String getAlertText() {

		Alert alert = driver.switchTo().alert();
		//String text = alert.getText();
		//System.out.println(text);
		return alert.getText();
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		driver.close();

	}

	public void closeAllBrowsers() {
		driver.quit();

	}
	
	public void actions(WebElement ele)
	{
		builder.moveToElement(ele).pause(1000).perform();
		
	}
	
	public void closeWindow() {
		driver.close();
		
	}
	
}
