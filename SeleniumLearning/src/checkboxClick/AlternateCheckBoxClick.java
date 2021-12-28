package checkboxClick;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlternateCheckBoxClick {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver.exe");
		ChromeDriver open = new ChromeDriver();
		open.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		open.manage().window().maximize();
		
		open.findElement(By.id("txtUsername")).sendKeys("Admin");
		open.findElement(By.id("txtPassword")).sendKeys("admin123");
		open.findElement(By.id("btnLogin")).click();
		open.findElement(By.id("menu_admin_viewAdminModule")).click();
		open.findElement(By.id("menu_admin_UserManagement")).click();
		
		List<WebElement> checkbox = open.findElements(By.xpath("//input[contains(@id,'ohrmList_chkSelectRecord_')]"));
		Thread.sleep(1000);
		for(int i=0;i<checkbox.size();i++)
		{
			if(i%2==0)
			checkbox.get(i).click();
		}
		
	}

}
