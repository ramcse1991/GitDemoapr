package Selproj;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		WebDriver driver = null;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String Parid=it.next();
		String Childid= it.next();
		driver.switchTo().window(Childid);
		driver.get("https://rahulshettyacademy.com/");		
		String Coursename = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(Parid);
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(Coursename);
		File file =name.getScreenshotAs(OutputType.FILE);
		//driver.findElement(By.cssSelector("[name='name']")).sendKeys(Coursename);
	//	driver.quit();
		FileUtils.copyFile(file, new File("logo.png"));
		// Get Height & width
		
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());

		
		
		
		
		
		

	}

}
