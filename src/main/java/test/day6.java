package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day6 {

	 
		// TODO Auto-generated method stub
	
	
	
	@Parameters({"URL","APIKey/usrname"})
	    @Test
		public void jkl(String urlname,String APIKey) {
			System.out.println("hello");
			System.out.println(urlname);
			System.out.println(APIKey);
		}
	    
	   
	    

}


