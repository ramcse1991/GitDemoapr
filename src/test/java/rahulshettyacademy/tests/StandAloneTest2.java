package rahulshettyacademy.tests;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshettyacademy.pageobjects.LandingPage;

public class StandAloneTest2 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String productName="ZARA COAT 3";		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/client");
		
		LandingPage landingPage = new LandingPage(driver);
		driver.manage().window().maximize();
		driver.findElement(By.id("userEmail")).sendKeys("anshika@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Iamking@000");
		driver.findElement(By.id("login")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));

		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		WebElement prod =products.stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));
		Boolean match=cartProducts.stream().anyMatch(cartProduct-> cartProduct.getText().equalsIgnoreCase(productName));
		Assert.assertTrue(match);
		driver.findElement(By.cssSelector(".totalRow button")).click();
		
		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
		//wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ta-results"))));
		
	//	Thread.sleep(2000);

	
		driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
	JavascriptExecutor js = (JavascriptExecutor)driver;
  	js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btnn")).click();
		Thread.sleep(2000);
//		Thread.sleep(3000);
//		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
////		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(".action_submit")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(".action_submit")).click();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000)");
		
//		WebElement dateofBirth = driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[1]"));
//		driver.findElement(with(By.tagName("a")).below(dateofBirth)).click();
//		
//		System.out.println("test");
//		By loadingimage = By.xpath("//div[@class='actions']/a");
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingimage));
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='actions']/a")).click();
//		System.out.println("end");
		//JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,-500)");
	Thread.sleep(2000);
		String confirmmessage =driver.findElement(By.cssSelector(".hero-primary")).getText();
		Assert.assertTrue(confirmmessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		
		driver.close();
		
		
		
		
		
		
	
		
		
		
		

	}

}
