package select_Enabled_Displayed;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectMethod {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver.exe");
		ChromeDriver ref = new ChromeDriver();
		ref.get("https://opensource-demo.orangehrmlive.com/");
		ref.manage().window().maximize();
		
		ref.findElement(By.id("txtUsername")).sendKeys("Admin");
		ref.findElement(By.id("txtPassword")).sendKeys("admin123");
		ref.findElement(By.id("btnLogin")).click();
		ref.findElement(By.id("menu_admin_viewAdminModule")).click();
		ref.findElement(By.id("menu_admin_UserManagement")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)ref;
		
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-600)");
	}

}
