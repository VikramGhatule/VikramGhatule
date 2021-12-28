package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement destinaion = driver.findElement(By.xpath("//div[@id='destination']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, destinaion).build().perform();
	}

}
