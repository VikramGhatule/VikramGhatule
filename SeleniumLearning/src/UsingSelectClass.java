import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectClass {
	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver.exe");
		ChromeDriver obj = new ChromeDriver();
		obj.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		obj.manage().window().maximize();
		
		 WebElement birthday = obj.findElement(By.xpath("//select[@id='day']"));
		 Select dropdown= new Select(birthday);
		 System.out.print(dropdown);
		
		
	}

}
