package testNg_Basic_Program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BajajLoginTest {
	public static WebDriver driver;
	@BeforeSuite
	public void BrowserLounch()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void login() throws InterruptedException
	{
		driver.get("https://bflconsumer.force.com/dealer/login");
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rameshwar.chandrakant4@bizsupporta.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Amar@123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(12000);
	}
	
	@Test
	public void SearchBtnTest() throws InterruptedException
	{
		driver.findElement(By.xpath("//div//li//a//span[contains(text(),'Search')]")).click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='input-84']")).sendKeys("8668755184");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
	}
	
	@AfterSuite
	public void BrowserClose()
	{
		driver.quit();
		
	}

}
