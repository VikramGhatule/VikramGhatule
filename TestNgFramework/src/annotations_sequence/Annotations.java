package annotations_sequence;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("Before Method",true);
	}
	
	@AfterMethod
	public void aftermethod()
	{
		Reporter.log("After Method",true);
	}
	
	@AfterTest
	public void Aftertest()
	{
		Reporter.log("After Test",true);
	}
	
	@BeforeTest
	public void Beforetest()
	{
		Reporter.log("Before Test",true);
	}
	
	@Test
	public void test1()
	{
		Reporter.log("Test 1 Executed", true);
	}
	
	@Test
	public void test2()
	{
		Reporter.log("Test 2 Executed", true);
	}
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("Before Class",true);
	}
	@AfterClass
	public void afterclass()
	{
		Reporter.log("After Class",true);
	}
	@BeforeSuite
	public void beforesuite()
	{
		Reporter.log("Before Suite",true);
	}
	@AfterSuite
	public void aftersuite()
	{
		Reporter.log("After Suite",true);
	}
	@Test
	public void test3()
	{
		Reporter.log("Test 3 Executed",true);
	}
	


}
