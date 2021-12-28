package seleniumPlugins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {
	
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver.exe");
		ChromeDriver ref = new ChromeDriver();
		ref.get("https://opensource-demo.orangehrmlive.com/");
		ref.manage().window().maximize();
		
		WebElement username = ref.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
		WebElement password = ref.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement btnlog = ref.findElement(By.id("btnLogin"));
		btnlog.click();
		
		
		WebElement dropdown = ref.findElement(By.id("welcome"));
		dropdown.click();
		Thread.sleep(1000);
		
		
		WebElement logOut = ref.findElement(By.linkText("Logout"));
		Thread.sleep(1000);
		logOut.click();
		ref.close();
	
	}

}
