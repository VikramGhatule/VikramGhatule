package actionsClass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseHovering {
	
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		
		WebElement MouseHovering = driver.findElement(By.xpath("//a[@id='menu_maintenance_purgeEmployee' and @class='firstLevelMenu']"));
		Actions act = new Actions(driver);

		act.moveToElement(MouseHovering).perform();
		Thread.sleep(1000);	
		
		WebElement log = driver.findElement(By.xpath("//a[@id='welcome']"));
		log.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		Thread.sleep(500);
		driver.quit();
	}

}
