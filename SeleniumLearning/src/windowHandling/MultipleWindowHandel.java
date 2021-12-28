package windowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandel {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		
		String primarywindow= driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		Thread.sleep(1000);
		
		Set <String> MultipleWindowId = driver.getWindowHandles();
		
		
		for(String SingleWindowId:MultipleWindowId)
		{
			if(!SingleWindowId.equals(primarywindow))
			{
				driver.switchTo().window(SingleWindowId);
			//	Thread.sleep(1000);
				driver.findElement(By.xpath("//a[contains(text(),'Contact Sales')]")).click();
			}
		}
		driver.switchTo().window(primarywindow);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.close();
		driver.quit();
	}

}
