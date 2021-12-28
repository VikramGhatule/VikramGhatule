package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragable {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)","");
		
		WebElement IframeLocator = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(IframeLocator);
		Thread.sleep(2000);
		WebElement Source = driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions act = new Actions(driver);
		
		act.clickAndHold(Source).moveByOffset(100, 200).perform();;
		Thread.sleep(2000);
		
	}

}
