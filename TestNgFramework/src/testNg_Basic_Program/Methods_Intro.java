package testNg_Basic_Program;

import org.bouncycastle.asn1.cmc.GetCRL;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Methods_Intro {

	
	@Test(groups="Sanity")
	public static void method1()
	{
		Reporter.log("Method 1 that is sanity test case",true);
	}
	
	@Test(groups="Regression")
	public static void method2()
	{
		Reporter.log("Method 2 is running");
		Assert.assertEquals(false, true);
	}
	@Test(groups="sanity",dependsOnMethods="method2",alwaysRun=true)
	public static void method3()
	{
		Reporter.log("Method 3 that is sanity test case",true);
	}
	
}
