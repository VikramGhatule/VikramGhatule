package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new  ChromeDriver();
		driver.get("https://chercher.tech/practice/implicit-wait-example");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		int i=1;
		
		while(i>0)
		{
			driver.findElement(By.xpath("(//input[@type='checkbox'])["+i+"]")).click();
			i++;
		}
	}

}
