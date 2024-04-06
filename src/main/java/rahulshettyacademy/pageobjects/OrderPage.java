package rahulshettyacademy.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import rahulshettyacademy.AbstractComponents.AbstractComponent;

public class OrderPage extends AbstractComponent {
	
	WebDriver driver;
	@FindBy(css=".totalRow button")
	WebElement checkoutEle;
	
	@FindBy(css="tr td:nth-child(3)")
	private List<WebElement> productNames;
	
	
	public OrderPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//WebElement userEmail = driver.findElement(By.id("userEmail"));
	
	
	//driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
	
	public Boolean VerifyOrderDisplay(String productName)
	{
		
	Boolean match=productNames.stream().anyMatch(product-> product.getText().equalsIgnoreCase(productName));
	return match;
	}
	
	public CheckoutPage goToCheckout()
	{
		checkoutEle.click();
		return new CheckoutPage(driver);
	}
	
	
	@FindBy(css=".mb-3")
	List<WebElement> products;
	
	@FindBy(css=".ng-animating")
	WebElement spinner;
	
	By productsBy = By.cssSelector(".mb-3");
	By addToCart = By.cssSelector(".card-body button:last-of-type");
	
	By toastmessage = By.cssSelector("#toast-container");
	
	//List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
	
	public List<WebElement> getProductList()
	{
		waitForElementToAppear(productsBy);
		return products;
	}
	
	public WebElement getProductByname(String productName)
	{
		WebElement prod =getProductList().stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
		return prod;
		}
	
	public void addProductToCart(String productName) throws InterruptedException
	{
		WebElement prod = getProductByname(productName);
		prod.findElement(addToCart).click();
		waitForElementToAppear(toastmessage);
		waitForElementToDisappear(spinner);
		
		//wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		
		
	}
	
	
	//prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	
}
