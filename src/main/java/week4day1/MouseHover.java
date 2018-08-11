package week4day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BaraviPriya\\Desktop\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		driver.findElementByXPath("/html/body/div[2]/div/div/button").click();


		Actions builder = new Actions(driver);

		WebElement eleTv = driver.findElementByXPath("//*[@id=\'container\']/div/header/div[3]/ul/li[2]/a/span");

		WebElement eleTho = driver.findElementByXPath("//*[@id='container']/div/header/div[3]/ul/li[2]/ul/li/ul/li[1]/ul/li[5]/a/span");

		builder.moveToElement(eleTv).pause(1000).click(eleTho).perform();

		System.out.println("Completed");

	}

}
