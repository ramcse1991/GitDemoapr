package Selproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();		 
		 driver.manage().window().maximize();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			driver.findElement(By.xpath("(//a[@value='DEL'])[1]")).click();
			 Thread.sleep(2000);
			 //driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']/a[@value='MAA']")).click();
			 driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
			 Thread.sleep(2000);		 
			 
			 if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
				{
					System.out.println("its enabled");
					Assert.assertTrue(true);
				
				}
				else
				{
					Assert.assertTrue(false);
				}
			
			// Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
				// System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
				
			 driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
			 
			 driver.findElement(By.id("divpaxinfo")).click();
			 Thread.sleep(2000L);
			 
//			 int i = 1;
//			 while(i<5)
//			 {
//			 driver.findElement(By.id("hrefIncAdt")).click(); 
//			 i++;
//			 }
			 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
			 for(int i=0;i<5;i++)
	         {
	         driver.findElement(By.id("hrefIncAdt")).click(); 
	   		 i++;
	         }
			 driver.findElement(By.id("btnclosepaxoption")).click();
			 Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");
			 
			 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());	
//			System.out.println(driver.findElement(By.name("ctl00_mainContent_view_date2")).isEnabled());
//		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
//			//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
//			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
			 driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
//			
			
			
			
			//System.out.println(driver.findElement(By.name("ctl00_mainContent_view_date2")).isEnabled());
			//driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
			
			
	}

}
