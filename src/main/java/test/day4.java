package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day4 {
	
	@Test
	public void WebloginhomeLoan()
	{
		System.out.println("webloginhome");
	}
	
	@Test
	public void MobileloginhomeLoan()
	{
		System.out.println("Mobileloginhome");
	}
	@Test
	public void LoginAPIhomeLoan()
	{
		System.out.println("APIloginhome");
	}
	
	  
    @AfterClass
	public void Democlass() {
		System.out.println("After class");
	}
	
}
