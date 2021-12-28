package bookMyShow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TicketBooking {
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/buytickets/pandu-pune/movie-pune-ET00318116-MT/20211220");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebElement vaibhavLocation = driver.findElement(By.xpath("//div//a[@class='__venue-name' and contains(text(),'Vaibhav Chitramandir: Hadapsar')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",vaibhavLocation);
		WebDriverWait wb = new WebDriverWait(driver,10);
		wb.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}

}
