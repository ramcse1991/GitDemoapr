package Selproj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "rahul";
		WebDriver driver = null;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		WebDriverManager.edgedriver().setup();
//		 driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		System.out.println(password);
		driver.findElement(By.className("submit")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		// --[//tagname]
		// [tagname]
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),
				"Hello " + name + ",");
		System.out.println(name);

		System.out.println(password);
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		// driver.close();

	}

	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		String passwordText = driver.findElement(By.cssSelector("form p")).getText();

		// Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray = passwordText.split("'");

		String password = passwordArray[1].split("'")[0];

		return password;

	}

}
