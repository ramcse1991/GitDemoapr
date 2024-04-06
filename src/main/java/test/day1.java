package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {

	 
		// TODO Auto-generated method stub
	
	    @Parameters({"URL","APIKey/usrname"})
	    @Test
		public void Demosf(String urlname,String APIKey) {
			System.out.println("hello");
			System.out.println(urlname);
			System.out.println(APIKey);
		}
	    @Test
		public void Demoad() {
			System.out.println("hello3434");
		}
	    @Test(groups= {"Smoke"})
		public void Demosffs() {
			System.out.println("hellowewwewe");
		}
	    @Test
		public void Demohh() {
			System.out.println("hello");
			Assert.assertTrue(false);
		}
	    
	    @BeforeMethod
			public void Demomethod() {
				System.out.println("beforemethod");
			}
	    
	    @AfterMethod
		public void Demomethod567() {
			System.out.println("Aftermethod");
		}
    
	    
	    @AfterTest
	    public void SecondTest()
	    {
	    	System.out.println("Byeexecutelast");
	    }
	    @AfterSuite
		public void Demosuite() {
			System.out.println("Aftersuite");
		}
	    

}


