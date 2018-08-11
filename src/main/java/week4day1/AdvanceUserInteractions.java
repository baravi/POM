package week4day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdvanceUserInteractions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BaraviPriya\\Desktop\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Sort
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement frameLink = driver.findElementByXPath("//*[@id=\'content\']/iframe");
		driver.switchTo().frame(frameLink);

		WebElement firstElement = driver.findElementByXPath("//ul[@id ='sortable']/li[1]");


		int xValue = driver.findElementByXPath("//ul[@id ='sortable']/li[5]").getLocation().getX();
		int yValue = driver.findElementByXPath("//ul[@id ='sortable']/li[5]").getLocation().getY();

		Actions builder = new Actions(driver);
		builder.dragAndDropBy(firstElement, xValue, yValue).perform();
		
		System.out.println("Sort Completed");
		
		//Drag and drop
		
		driver.findElementByXPath("//a[text() ='Droppable']").click();
		driver.findElementByLinkText("Droppable").click();
		WebElement dragElement = driver.findElementById("draggable");
		WebElement dropElement = driver.findElementById("droppable");
		
		builder.dragAndDrop(dragElement, dropElement).perform();
		
		System.out.println("Drag and Drop completed");
		

	}

}
