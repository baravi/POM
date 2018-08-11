package week2day2;

import java.util.List;

import javax.swing.text.html.HTML;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class FindElements {



	@Test
	public static void createLeadWithExtentReport() {

		//		//To creat a html file - read only file
		//		ExtentHtmlReporter html = new ExtentHtmlReporter("./ExtentReport/report.html");
		//		html.setAppendExisting(true); //To maintain history of execution. If false, latest execution only  displayed . If true, we can see all the results
		//		
		//		//To make the report writtable
		//		ExtentReports extent = new ExtentReports();
		//		extent.attachReporter(html);
		//		//Where exactly the test case start	s
		//		
		//		//Whereever you want, just call this - 
		//		ExtentTest test = suiteTest.createNode("Lead");
		//		test.pass("pass");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\BaraviPriya\\Desktop\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
		//ChromeOptions op = new ChromeOptions();
		//op.setHeadless(true);e
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		//driver.findElementById("ext-gen597").click();
		//driver.findElementByName("companyName").sendKeys("WIpro");
		//driver.findElementByName("firstName").sendKeys("Baravi");
		//driver.findElementByName("lastName").sendKeys("C");
		//driver.findElementById("ext-gen634").click();	
		//driver.close();

		/*WebElement src = driver.findElementById("createLeadForm_industryEnumId");
			Select dd = new Select(src);
			dd.selectByVisibleText("Insurance");

			List<WebElement> all = dd.getOptions();
			int totalsize =all.size();
			System.out.println(totalsize);
			for(WebElement each:all) {
				System.out.println(each.getText());*/

		List<WebElement> dropDownList = driver.findElementsByTagName("Select");
		int sizeDropDown = dropDownList.size();
		System.out.println(sizeDropDown);



	}
}


