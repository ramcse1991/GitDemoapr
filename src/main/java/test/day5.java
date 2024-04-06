package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day5 {

	 
		// TODO Auto-generated method stub
	
	    @Parameters({"URL","APIKey/usrname"})
	    @Test
		public void Demosf(String urlname,String APIKey) {
			System.out.println("hello");
			System.out.println(urlname);
			System.out.println(APIKey);
		}
	   
	    

}


