package wdMethods;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week5day1.ReadDataExcelPRovider;

public class Annotation extends SeMethods {
	public String excelFileName,testName,testDesc,moduleName,author,category;
	@BeforeSuite
	public void startSuite() {
		beginResult();
	}

	@BeforeClass
	public void startTest() {
		startTest(testName, testDesc);
	}

	@Parameters({"url","uname","pass"})
	@BeforeMethod
	public void login(String url,String uname,String pass) {
		startTestIteration(moduleName, author, category);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BaraviPriya\\Desktop\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
		//		ChromeOptions op = new ChromeOptions();
		//		op.setHeadless(true);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get(url);
		driver.findElementById("username").sendKeys(uname);;
		driver.findElementById("password").sendKeys(pass);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@AfterMethod
	public void closeBrser() {
		driver.quit();
	}

	@AfterSuite
	public void flushReport() {
		endResult();
	}

	@DataProvider(name="fetchdata")
	public Object[][] getData() throws IOException

	{
		ReadDataExcelPRovider excelData = new ReadDataExcelPRovider();
		return excelData.readExcel(excelFileName);

	}

}