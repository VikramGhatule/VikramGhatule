package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
	public static void main(String [] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'Login/Register')]")).click();
		Thread.sleep(2000);
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File fileobj = new File("D:\\Velocity\\Automation\\ScreenShot\\vikram.png");
		FileHandler.copy(source, fileobj);
		
	}

}
