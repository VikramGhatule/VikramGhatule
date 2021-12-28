package actionsClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class SliderAction {
	
	public static void main(String[] args) throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		WebElement FrameLocator = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(FrameLocator);
		
		WebElement slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		Actions act = new Actions(driver);
		act.clickAndHold(slider).moveByOffset(300, 0).release().perform();
		
		
		// ScreenShot 
		
		TakesScreenshot scrshot = (TakesScreenshot)driver;
		File Source = scrshot.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumLearning\\ScrnShot\\vikram.png");
		FileHandler.copy(Source, Destination);
		driver.quit();
		
	}

}
