package week4day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BaraviPriya\\Desktop\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Drag and drop
		driver.findElementByXPath("//*[@id=\'sidebar\']/aside[1]/ul/li[2]/a").click();

		WebElement dragDrop = driver.findElementByXPath("//*[@id=\'content\']/iframe");
		driver.switchTo().frame(dragDrop);

		WebElement drag = driver.findElementById("draggable");
		WebElement drop = driver.findElementById("droppable");


		Actions builder = new Actions(driver);
		builder.dragAndDrop(drag, drop).perform();

		
		//Sort
		driver.findElementByXPath("//*[@id='sidebar']/aside[1]/ul/li[5]/a").click();
		WebElement click = driver.findElementByXPath("//*[@id=\'sortable\']/li[1]");
		Point loc = driver.findElementByXPath("//*[@id=\'sortable\']/li[6]").getLocation();

		System.out.println(loc);
		System.out.println("Completed");
		//builder.dragAndDropBy(click, xOffset, yOffset)




	}

}
