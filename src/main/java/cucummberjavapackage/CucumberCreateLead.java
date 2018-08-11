package cucummberjavapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberCreateLead {
	public static ChromeDriver driver;

	@Given("Open Browser") 
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/BaraviPriya/Desktop/TestLeaf/Softwares/drivers/chromedriver.exe");
		driver = new ChromeDriver();
				
	}
	@And("Maximize the window")
public void maxWindow() {
		driver.manage().window().maximize();
				
	}

	
	
	@And("Set timeout")
	public void timeOut() {
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
}



	
	@And("Load URL")
	public void loadURL() {
		driver.get("http://leaftaps.com/opentaps/control/main");
				
}
	
	@And("Enter UserName as (.*)")
	public void userName(String uName) {
	
		driver.findElementById("username").sendKeys(uName);
				
}
	
	@And("Enter Password as (.*)")
	public void passWord(String pass) {
	
	driver.findElementById("password").sendKeys(pass);
				
}
	@And("Click on Login")
	public void clickLogin() {
	
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	
	
	@And("Click CRMSFA link")
	public void crmsfaLink() {
		driver.findElementByLinkText("CRM/SFA").click();
	
	}
	
	@And("Click CreateLead link")
	public void createLeadLink() {
		driver.findElementByLinkText("Create Lead").click();
	
	}
	
	@And("Enter Company as (.*)")
	public void enterCompany(String company) {
		driver.findElementById("createLeadForm_companyName").sendKeys(company);
	
	}
	@And("Enter FirstName as (.*)")
	public void enterFirstName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	
	}
	@And("Enter LastName as (.*)")
	public void enterLastName(String lNmae) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lNmae);
		
	}

	@When("Click on CreateLead link")
	
		public void clickCreateLeadLInk() {
		driver.findElementByName("submitButton").click();
		
			}
	@Then("Verify created lead")
	
	public void verifyCreatedLead() {
	System.out.println("CreateLead is success");
	
		}
	
	@But("Verify created lead failed")
	public void failedCreateLead() {
		System.out.println("CreateLead is not success");
	}
	
	

}
