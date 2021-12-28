package testNg_Basic_Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static WebDriver driver;
	@Test
	public void lounch()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}

}
