package task_HRM_utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRM_test {
	
	public static void main(String[] args) throws IOException {
		
		HRM_Utility test = new HRM_Utility();
		String username = test.Read(1, 0, 0, null);
		String password = test.Read(1, 0, 1, null);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
	
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		test.ScreenShot(driver);
		driver.close();
		
		
		
	}

}
