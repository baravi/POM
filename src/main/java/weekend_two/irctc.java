package weekend_two;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class irctc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BaraviPriya\\Desktop\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
		//ChromeOptions hide = new ChromeOptions();
	//hide.setHeadless(true);
	//	ChromeDriver driver = new ChromeDriver(hide);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");//Launch URL		
		driver.manage().window().maximize();//Maximize		
		driver.findElementById("userRegistrationForm:userName").sendKeys("Baravi");//TextBox fileds
		driver.findElementById("userRegistrationForm:password").sendKeys("123456");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("123456");
		
		
		WebElement drop =driver.findElementByName("userRegistrationForm:securityQ");//SecurityQestions
		Select dd = new Select(drop);
		dd.selectByIndex(1);
		//To print all the values in the drop down
		
		List<WebElement> options = dd.getOptions();
		int size = options.size();
		
		for( WebElement  each  : options) {
			System.out.println(each.getText());
			
		}
	
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Registration");
		WebElement drop2 =driver.findElementByName("userRegistrationForm:prelan");
		Select dd2 = new Select(drop2);
		dd2.selectByIndex(0);
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Baravi");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("C");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementByXPath("//*[@id=\"userRegistrationForm:maritalStatus:0\"]").click();
		WebElement date =driver.findElementByName("userRegistrationForm:dobDay");//Date
		Select dte = new Select(date);
		dte.selectByVisibleText("19");
		WebElement mon =driver.findElementByName("userRegistrationForm:dobMonth");//Month
		Select mont = new Select(mon);
		mont.selectByVisibleText("SEP");
		WebElement yr =driver.findElementByName("userRegistrationForm:dateOfBirth");//Year
		Select year = new Select(yr);
		year.selectByVisibleText("1990");
		WebElement OS =driver.findElementByName("userRegistrationForm:occupation");	//Occupation selection
		Select occ = new Select(OS);
		occ.selectByVisibleText("Private");
		driver.findElementByName("userRegistrationForm:uidno").sendKeys("78965412336");//Aadhar
		driver.findElementById("userRegistrationForm:idno").sendKeys("BKIP1547P");//PAN
		WebElement SC =driver.findElementByName("userRegistrationForm:countries");//Select Country
		Select country = new Select(SC);
		country.selectByVisibleText("India");
		driver.findElementById("userRegistrationForm:email").sendKeys("baravi@gmail.com");//email
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9486403438");//Mobile
		WebElement nat =driver.findElementByName("userRegistrationForm:nationalityId");	//Nationlaity
		Select nation = new Select(nat);
		nation.selectByVisibleText("India");
		driver.findElementById("userRegistrationForm:address").sendKeys("Jayachandran Nagar");	//Address
		driver.findElementById("userRegistrationForm:street").sendKeys("St");
		driver.findElementById("userRegistrationForm:area").sendKeys("Medavakkam");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600100", Keys.TAB);
		Thread.sleep(3000);
		WebElement ct =driver.findElementByName("userRegistrationForm:cityName");	//City
		Select cy = new Select(ct);
		cy.selectByIndex(1);				
		Thread.sleep(3000);
		WebElement po =driver.findElementByName("userRegistrationForm:postofficeName");//Post Office
		Select post = new Select(po);
		post.selectByIndex(1);
		driver.findElementById("userRegistrationForm:landline").sendKeys("12345678");
		driver.findElementById("userRegistrationForm:resAndOff").click();
		System.out.println("Completed Regestration successfully :)");//Completion
	}
}
