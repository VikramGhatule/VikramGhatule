package useOFpropertiesFILE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFIle {
	
	public static void main(String[] args) throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver.exe");
		
		FileInputStream path = new  FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\SeleniumLearning\\Demo.properties");
		Properties prop = new Properties();
		prop.load(path);
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys(prop.getProperty("username"));
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
	}

}
