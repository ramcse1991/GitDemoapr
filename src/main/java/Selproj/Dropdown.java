package Selproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();		 
		 driver.manage().window().maximize();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='BLR'])[1]")).click();
		 Thread.sleep(4000);
		 //driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']/a[@value='MAA']")).click();
		 driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		 
		 driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
		 
		
		 
		 
		// ctl00_mainContent_ddl_destinationStation1_CTNR
		 
		//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']
		
		 
		//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']//a[@value='MAA']
		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	}

}
