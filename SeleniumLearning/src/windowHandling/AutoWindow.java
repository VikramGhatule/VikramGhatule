package windowHandling;


import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AutoWindow {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		TakesScreenshot sc= (TakesScreenshot)driver;
		File screenshot = sc.getScreenshotAs(OutputType.FILE);
		File store =new File("D:\\Velocity\\Automation\\ScreenShot\\vikram.png");
		FileHandler.copy(screenshot, store);
		Thread.sleep(2000);
	
		}
		
		
		
		
		
		
		
	

}
