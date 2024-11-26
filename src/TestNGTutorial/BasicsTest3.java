package TestNGTutorial;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasicsTest3 {
	@Parameters({"URL"})   //suite level
	@Test
	public void demoTestMod3(String urlname)
	{
		System.out.println("Hello demoTest Module 3");
		System.out.println(urlname);
	}
	
	@AfterSuite   //it will only execute once all the tests completed in all the test folders from XML file.
	public void afterTest()
	{
		System.out.println("Hello End test executed");
	}
	
	@Test (groups = {"smoke"})   
	public void demoTestfun3()
	{
		System.out.println("Hello demoTest function 3");
	}
	
	
	@Test
	public void demoTestprimi3()
	{
		System.out.println("Hello demoTest primitive 3");
	
	}
	
	@Test
	public void MobileTestprim3()
	{
		System.out.println("Hello MobileTest Primitive 3");
	}

	@Test
	public void MobileTestFun3()
	{
		System.out.println("Hello MobileTest Function 3");
	}

	@Test
	public void MoileTestmod3()
	{
		System.out.println("Hello MobileTest Module 3");
	}
}
