package weekend3day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameWork {

	//Frame,alert,Window Handle
	
	public static void main(String[] args) {
		//Chrome Property
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BaraviPriya\\Desktop\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//Maximize Windows
		driver.manage().window().maximize();

		//Passing URL
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");

		//Getting in to the frame
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("/html/body/button").click();

		//Alert 
		Alert myAlert = driver.switchTo().alert();
		myAlert.sendKeys("testing");
		myAlert.accept();

		//Getting the text inside the frame
		String text = driver.findElementById("demo").getText();
		System.out.println(text);

		//Switching back to previoius screen 		
		driver.switchTo().defaultContent();
		
		//WidnowsHandle
		
		String firstWidnow = driver.getWindowHandle();

		//Clicking on the button in home page
		driver.findElementById("tryhome").click();
		
		//Window Handles 
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		//Saving it in list because, in list we don't have anything like 'get'
		
		List<String> allListwindowHandles = new ArrayList<String>();
		
		//Adding the set values to the list 
		
		allListwindowHandles.addAll(allWindowHandles);
		
		//Switching to the child window	 - second window
		driver.switchTo().window(allListwindowHandles.get(1));
		
		String url1 = driver.getCurrentUrl();
		String tilte1 = driver.getTitle();
		System.out.println(url1);
		System.out.println(tilte1);
		
		//Switching back to the parent window -  first window
		
		driver.switchTo().window(allListwindowHandles.get(0));
		
		String url = driver.getCurrentUrl();
		String tilte = driver.getTitle();
		System.out.println(url);
		System.out.println(tilte);
	
				
		//Closing all the open browser
						
		driver.quit();

	}

}
