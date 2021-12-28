package windowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowId {
	
	public static void main(String [] args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver.exe");
		ChromeDriver obj = new ChromeDriver();
		obj.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		obj.manage().window().maximize();
//		obj.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
//		obj.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
//		obj.findElement(By.xpath("//*[@class='button']")).click();
		obj.findElement(By.xpath("//*[contains(text(),'OrangeHRM, Inc')]")).click();
		Set <String> windowid = obj.getWindowHandles();
		System.out.println("Window id is :"+windowid);
		
		
		
	}
	

}
