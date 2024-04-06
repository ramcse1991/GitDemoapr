package Selproj;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Updateddropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = null;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		// System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Thread.sleep(2000);
//	System.out.println(driver.findElement(By.name("ctl00_mainContent_view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("its enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		// ctl00_mainContent_rbtnl_Trip_0

		System.out.println(driver.findElement(By.name("ctl00_mainContent_view_date2")).isEnabled());
		// driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);

//		 int i = 1;
//		 while(i<5)
//		 {
//		 driver.findElement(By.id("hrefIncAdt")).click(); 
//		 i++;
//		 }
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for (int i = 0; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}
