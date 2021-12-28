package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("CZM747");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vikram2665@#");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@id='pin']")).click();
	}

}
