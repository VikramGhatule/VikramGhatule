package seleniumPlugins;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTittle {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		String abc = driver.getTitle();
		if(abc.equals("OrangeHRM"))
			System.out.println("Test is passed." +abc);
		else
			System.out.println("Test case is failed.");
		
		
		
		String url = driver.getCurrentUrl();
		
		if(url.equals("https://opensource-demo.orangehrmlive.com/"))
			System.out.println("URL test case is passed");
		else
			System.out.println("URL test case is failed.");
		driver.close();
		
		
		
		
		driver.close();
	}

}
