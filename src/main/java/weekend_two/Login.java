package weekend_two;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BaraviPriya\\Desktop\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
		//ChromeOptions op = new ChromeOptions();
		//op.setHeadless(true);
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


	


