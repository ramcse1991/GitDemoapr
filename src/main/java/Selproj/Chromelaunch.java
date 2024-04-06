package Selproj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chromelaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
//		 
//		 WebDriverManager.edgedriver().setup();
//		 driver = new EdgeDriver();
		// driver.get("https://www.amazon.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 String Title=driver.getTitle();
		 System.out.println("The page title is: " + Title);
		 driver.close();
		 driver.quit();
		

	}

}
