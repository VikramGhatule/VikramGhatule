package datePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderDatePicker {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
//		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("datepicker2")).click();
		WebElement years = driver.findElement(By.xpath("//select[@title='Change the year']"));
		Select sl = new Select(years);
		Thread.sleep(1000);
		sl.deselectByVisibleText("1993");
		
		WebElement months = driver.findElement(By.xpath("//select[@title='Change the month']"));
		Select allMonths= new Select(months);
		Thread.sleep(1000);
		allMonths.selectByVisibleText("July");
		
		driver.findElement(By.xpath("//tr//td//a[@title='Select Tuesday, Jul 27, 1993']")).click();
		
		
	}

}
