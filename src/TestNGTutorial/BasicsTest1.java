package TestNGTutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicsTest1 {
	
	//Suite>class>method>test
	@BeforeClass //The scope of it is to that specific class only. So before executing any test/method in that class that beforeclass test/method will be executed just before beforeSuite. Before suite executed at the end only.
	public void beforeClassTest()
	{
		System.out.println("Hello Before class Test");
	}
	@Test (groups = {"smoke"})   
	public void demoTest()
	{
		System.out.println("Hello TestNg");
	}
	@Test
	public void demoTest1()
	{
		System.out.println("Hello BasicsTest1");
	}
	@BeforeMethod //In particular class file, before executing each and every test/method, that method/test will execute.
	public void beforeMethodTest()
	{
		System.out.println("Hello Before method execute");
	}
	
	@AfterMethod //In particular class file, after executing each and every test/method, that method/test will execute.
	public void afterMethodTest()
	{
		System.out.println("Hello Before method execute");
	}
	
	@AfterClass
	public void afterClassTest() //The scope of it is to that specific class only. So after executing  all test/method in that class that afterclass test/method will be executed just after AfterSuite
	{
		System.out.println("Hello After class Test");
	}
}
