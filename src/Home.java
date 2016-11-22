package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	public WebElement searchBox(WebDriver driver)
	{
		return driver.findElement(By.id("twotabsearchtextbox"));
	}
	public WebElement clickSearch(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input"));
	}
	public WebElement selectProduct(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='result_2']/div/div[3]/div[1]/a/h2"));
	}
	public WebElement addToCart(WebDriver driver)
	{
		return driver.findElement(By.id("add-to-cart-button"));
	}
	public WebElement cart(WebDriver driver)
	{
	    return driver.findElement(By.xpath("//*[@id='hlb-view-cart-announce']"));	
	}
	public WebElement changequantity(WebDriver driver)
	{
	    return driver.findElement(By.xpath("//*[@id='activeCartViewForm']/div[2]/div/div[4]/div[2]/div[3]/div/div/span/select"));	
	}
	public WebElement proceed_checkout(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='sc-buy-box-ptc-button']/span/input"));
	}
	public WebElement emailId(WebDriver driver)
	{
		return driver.findElement(By.id("ap_email"));
	}
	public WebElement password(WebDriver driver)
	{
		return driver.findElement(By.id("ap_password"));
	}
	public WebElement login(WebDriver driver)
	{
		return driver.findElement(By.id("signInSubmit"));
	}
	public WebElement continue1(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='changeQuantityFormId']/div[7]/div/div/span/span/input"));
	}
	
}
