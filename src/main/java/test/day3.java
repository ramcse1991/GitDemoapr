package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	
	//@Test(enabled=false)
	@Test
	public void WebloginCarLoan()
	{
		System.out.println("weblogincar");
	}
	
	@Parameters({"URL1"})
	@Test
	public void WebloginCarLoannew(String urlname)
	{
		//System.out.println("weblogincar");
		System.out.println(urlname);
	}
	
	@Test(groups= {"Smoke"})
	
	public void MobileloginCarLoan()
	{
		System.out.println("Mobilelogincar");
	}
	
	@Test(groups= {"Smoke"})
	public void MobilesigninCarLoan()
	{
		System.out.println("Mobilelogincar");
	}
	
	@Test(groups= {"Smoke"})
	public void MobilesignoutCarLoan()
	{
		System.out.println("Mobilelogincar");
	}
	
	@Test(dataProvider="getData")
	public void MobilesignoutCarLoanjihjh(String username, String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
	
	
	@Test
	public void Mobilesignout1CarLoan()
	{
		System.out.println("Mobilelogincar");
	}
	@Test//(dependsOnMethods= {"Mobilesignout1CarLoan","WebloginCarLoan"})
	public void LoginAPICarLoan()
	{
		System.out.println("APIlogincar");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination - username password  - good credit history
		//2nd - username password - no credit histroy
		//3rd - fraudelent credit history
		Object[][]  data= new Object[3][2];
		data[0][0] = "firstsetusername";
		data[0][1] = "password";
		
		data[1][0]="secondsetusername";
		data[1][1]="Secondsetpassword";
		
		data[2][0]="Thirdsetusername";
		data[2][1]="Thirdsetpassword";
		return data;
		
		
	}
	
}
