package Selproj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 //Sibling - parent traverse		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 driver.manage().window().maximize();
		 //sibling - child to parent traverse
		
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText()); 
		
		//child to parent
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText()); 
		
		
		
		
		 
		 
	}

}
