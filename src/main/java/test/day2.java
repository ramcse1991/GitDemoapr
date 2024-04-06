package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	 
		// TODO Auto-generated method stub
	
	
	 @BeforeSuite
		public void Demosuite() {
			System.out.println("Beforesuite");
		}
	    @Test(groups= {"Smoke"})
		public void Demo() {
			System.out.println("hello");
		}
	    
	    @Test
		public void jkl(String urlname,String APIKey) {
			System.out.println("hello");
			System.out.println(urlname);
			System.out.println(APIKey);
		}
	    
	    @BeforeClass
		public void Democlass() {
			System.out.println("Before class");
		}
	    
	    @BeforeTest
	    public void prerequisite()
	    {
	    	System.out.println("I will execute first");
	    }
	    

}


