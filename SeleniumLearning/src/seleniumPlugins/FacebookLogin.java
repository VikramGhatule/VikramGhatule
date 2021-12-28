package seleniumPlugins;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	
	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver.exe");
		ChromeDriver ref = new ChromeDriver();
		ref.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		ref.manage().window().maximize();
		
		WebElement fname = ref.findElement(By.name("firstname"));
		fname.sendKeys("Vikram");
		
		WebElement sname = ref.findElement(By.name("lastname"));
		sname.sendKeys("Ghatule");
		
		WebElement mobnum = ref.findElement(By.name("reg_email__"));
		mobnum.sendKeys("8668755184");
		
		WebElement radiobtn = ref.findElement(By.xpath("//*[@name='sex' and @value='2']"));
		radiobtn.click();
		
		List<WebElement> bdate = ref.findElements(By.xpath("//*[@name='birthday_day']//option"));
		for(WebElement date :bdate)
		{
			if(date.getText().equalsIgnoreCase("27"))
				date.click();
		}
		
		List<WebElement> bmonth = ref.findElements(By.xpath("//*[@name='birthday_month']//option"));
		for(WebElement month :bmonth)
		{
			if(month.getText().equalsIgnoreCase("Jul"))
			month.click();
		}
		List<WebElement> year = ref.findElements(By.xpath("//*[@name='birthday_year']//option"));
		for(WebElement byear :year)
		{
			if(byear.getText().equalsIgnoreCase("1993"))
				byear.click();
		}
		WebElement password = ref.findElement(By.id("password_step_input"));
		password.sendKeys("Vikram@12345");
		
		
		
	}

}
