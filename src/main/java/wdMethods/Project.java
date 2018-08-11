package wdMethods;

import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.jsoup.select.Evaluator.ContainsText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BaraviPriya\\Desktop\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
		//Launch Browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//LAunch leaftaps
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();

		//Create Contact	
		driver.findElementByLinkText("Contacts").click();
		driver.findElementByLinkText("Create Contact").click();
		driver.findElementById("firstNameField").sendKeys("TestLeaf");
		driver.findElementById("lastNameField").sendKeys("Test");
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("Local");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("LocalTest");
		driver.findElementById("createContactForm_personalTitle").sendKeys("Mr");
		driver.findElementById("createContactForm_generalProfTitle").sendKeys("Title");
		driver.findElementById("createContactForm_departmentName").sendKeys("Testing");

		//Dropdown	

		WebElement preCurrency = driver.findElementById("createContactForm_preferredCurrencyUomId");
		Select dd1 = new Select(preCurrency);
		dd1.selectByIndex(1);

		driver.findElementById("createContactForm_description").sendKeys("DOing Project");
		driver.findElementById("createContactForm_importantNote").sendKeys("Testing");
		driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("600100");
		driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("91");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("test@test.com");
		driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("1234567890");
		driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("0001112120");

		//PRinting the name 

		String name = driver.findElementById("generalToNameField").getAttribute("value");
		System.out.println("Entered Name  = "+name);

		driver.findElementById("createContactForm_generalAttnName").sendKeys("Testing");
		driver.findElementById("createContactForm_generalAddress1").sendKeys("Chennai");
		driver.findElementById("createContactForm_generalAddress2").sendKeys("Nanganallur");

		driver.findElementById("createContactForm_generalCity").sendKeys("Chennai");
		driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("0001112120");
		driver.findElementById("createContactForm_generalPostalCode").sendKeys("600100");
		driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("600100");




		//State dropdown

		WebElement state = driver.findElementById("createContactForm_generalStateProvinceGeoId");
		Select dd2 = new Select(state);
		dd2.selectByIndex(1);

		//country dropdown

		WebElement country = driver.findElementById("createContactForm_generalCountryGeoId");
		Select dd3 = new Select(country);
		dd3.selectByIndex(1);



		//Click submit

		driver.findElementByXPath("//input[@class ='smallSubmit']").click();

		String nameOutput = driver.findElementByXPath("//*[@id=\'viewContact_fullName_sp\']").getText();
		

		System.out.println(nameOutput);

		//Verifying the name

		if(nameOutput.contains(name))
		{
			System.out.println("Name Matches");
		}
		else {
			System.out.println("Name is not matching");
		}

		//Edit

		driver.findElementByLinkText("Edit").click();

		WebElement marketingCampaign = driver.findElementById("addMarketingCampaignForm_marketingCampaignId");
		Select dd4 = new Select(marketingCampaign);
		dd4.selectByIndex(1);
		String outname = dd4.getFirstSelectedOption().getText();
		
		

		//WebElement p = marketingCampaign.findElements(lo);

		//String selectedMarketingCampaign = driver.findElementById("addMarketingCampaignForm_marketingCampaignId").getAttribute("value");

		//String outname = driver.findElementByXPath("//select[@id ='addMarketingCampaignForm_marketingCampaignId']/option[2]").getText();
		System.out.println("selected campaingn " +outname);



		driver.findElementByXPath("//input[@value='Add']").click();

		driver.findElementByXPath("//input[@value='Update']").click();

		//driver.findElementByXPath("//*[@id=\'ext-gen631\']").click();



		String markCamp = 	driver.findElementById("viewContact_marketingCampaigns_sp").getText();

		System.out.println("Compared  campaign of " +markCamp);


		if(markCamp.contains(outname))
		{
			System.out.println("Selected campaign is displayed correctly");
		}
		else {

			System.out.println("Selected campaign is not displayed correctly");
		}

	}

}
