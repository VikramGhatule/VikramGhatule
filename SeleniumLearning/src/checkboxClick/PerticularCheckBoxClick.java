package checkboxClick;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerticularCheckBoxClick {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver.exe");
		ChromeDriver obj = new ChromeDriver();
		obj.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		obj.manage().window().maximize();
		obj.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		obj.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		obj.findElement(By.xpath("//*[@class='button']")).click();
		obj.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
		Thread.sleep(1000);
		obj.findElement(By.xpath("//*[@id='menu_admin_UserManagement']")).click();
		
		WebElement CheckBoxClick = obj.findElement(By.xpath("//div[@id='search-results']//td//a[contains(text(),'Maggie.Manning')]/parent::td//parent::tr//input"));
		
		JavascriptExecutor jse = (JavascriptExecutor)obj;
		jse.executeScript("arguments[0].scrollIntoView();",CheckBoxClick);
		Thread.sleep(1000);
		CheckBoxClick.click();
	}

}
