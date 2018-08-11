package week2day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BaraviPriya\\Desktop\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/table.html");
		
		int row = driver.findElementsByXPath("//div[@id='contentblock']//tr[*]").size();
		System.out.println("No of rows " +row);
		
		int column = driver.findElementsByXPath("//div[@id='contentblock']//td[*]").size();
		System.out.println("Now of columns " +column);
		
		//First column count
		int FirstRowColumn = driver.findElementsByXPath("//div[@id='contentblock']//td[1]").size();
		System.out.println("Now of columns in first row " +FirstRowColumn);
		
		
		//div[@id='contentblock']//tr[3]/td[1]
		
		



	}
}


