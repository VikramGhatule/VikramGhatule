package actionsClass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderBar {
	
	
	public static void main(String [] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		Actions act = new Actions(driver);
		WebElement Slider = driver.findElement(By.xpath("//div[@id='slider']/span"));
		act.clickAndHold(Slider).moveToElement(Slider,550, 0).build().perform();
		act.release();
	
	}
	
	
}	
