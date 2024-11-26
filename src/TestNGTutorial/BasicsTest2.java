package TestNGTutorial;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicsTest2 {
	@Test (enabled = false)
	public void demoTest() //you have to skip that particular test by using enabled attributes
	{
		System.out.println("Hello BasicsTest2");
	}
	
	@BeforeTest   //whatever method you define here that will execute first before any test belonging to that folder.
	public void preRequisiteTest()
	{
		System.out.println("Hello Pre-requisite executed");
	}
	
	@AfterTest   //whatever method you define AfterTest annotation that will execute at the last.
	public void afterTest()
	{
		System.out.println("Hello End test executed");
	}
	
	@Test (dependsOnMethods = {"WebLoginCar"})  //If there is dependency of WebLoginCar test before executing APIloginCar. //one or more method/test name can be defined by comma seprated.											
	public void APIloginCar()
	{
		System.out.println("Hello APIloginCar");
	}
	
	@Test (timeOut=4000) //if one of your test case, it's taking long time to execute.
	public void WebLoginCar()
	{
		System.out.println("Hello WebLoginCar");
	}
}
