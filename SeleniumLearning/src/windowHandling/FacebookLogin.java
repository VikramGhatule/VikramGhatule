package windowHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new  ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
		
		driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("8805153041");
		driver.findElement(By.xpath("//button[@id='did_submit']")).click();
		driver.findElement(By.xpath("//input[@id='send_email']")).click();
		driver.findElement(By.xpath("//button[@name='reset_action']")).click();
	}

}
