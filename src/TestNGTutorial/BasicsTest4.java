package TestNGTutorial;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasicsTest4 {
	
	@Test
	public void demoTestMod4()
	{
		System.out.println("Hello demoTest Module 4");
	}
	@BeforeSuite   //it will execute before it executes any test in this XML file.
	public void afterTest()
	{
		System.out.println("Hello End test executed");
	}
	
	@Test (groups = {"smoke"})
	public void demoTestFun4() 
	{
		System.out.println("Hello demoTest Function 4");
	}
	@Parameters({"URL"})   //class level
	@Test 
	public void demoTestprim4(String classurl)
	{
		System.out.println("Hello demoTest Primitive 4");
		System.out.println(classurl);
	}
	
	@Parameters({"URL","Username"})   //class level multiple paramter
	@Test 
	public void demoTestprim5(String classurl,String Username)
	{
		System.out.println("Hello demoTest Primitive 5");
		System.out.println(classurl);
		System.out.println(Username+" Is my Username");
	}
	
	@Test(dataProvider="getData")
	public void demosignoutcarLoan(String username,String password)
	{
		//Appium
		System.out.println("demo SIGNOUT BasicsTest4");
		System.out.println(username);
		System.out.println(password);
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combiantion - username password - good credit history= row
		//2nd - username password  - no crdit history
		// 3rd - fraudelent credit history
		Object[][] data= new Object[3][2];
		//1st set 
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//couloumns in the row are nothing but values for that particualar combination(row)
		
		//2nd set
		data[1][0]= "secondsetusername";
		data[1][1]= "secondpassword";
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
		
	}
	

	@Test
	public void MobileTestprim4()
	{
		System.out.println("Hello MobileTest Primitive 4");
	}

	@Test
	public void MobileTestFun4()
	{
		System.out.println("Hello MobileTest Function 4");
	}

	@Test
	public void MobileTestmod4()
	{
		System.out.println("Hello MobileTest Module 4");
	}
}
