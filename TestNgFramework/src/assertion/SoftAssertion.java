package assertion;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(testNGListner.TestNGListner.class)
public class SoftAssertion {
	public static WebDriver driver;
	SoftAssert soft;
	
	@BeforeSuite
	public void BrowserLounch()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
	}
	@Test
	public void VerifyLoginButton()
	{
		boolean resultOfLoginbutton = driver.findElement(By.xpath("//input[@id='bnLogin']")).isDisplayed();
		this.soft = new SoftAssert();
		soft.assertEquals(resultOfLoginbutton,true);
		Reporter.log("Checking Login Button of Login page");
		
	}
	
	
	@AfterSuite
	public void browserClose()
	{
		driver.quit();
	}
	

}
