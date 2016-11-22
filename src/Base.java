package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import pom.Home;

public class Base {
	private WebDriver driver;
	private Home access;
	Base()
	{
		access = new Home();
		driver=new FirefoxDriver();
		driver.get("http://www.amazon.co.uk/");
	}
	public void searchIphone()
	{
		access.searchBox(driver).sendKeys("Iphone 6s");
	}
	public void clickPhoneSearch()
	{
		access.clickSearch(driver).click();
	}
	public void selectPhone()
	{
		access.selectProduct(driver).click();
	}
	public void windoHandle()
	{
		for(String childWidow : driver.getWindowHandles())
		{
			driver.switchTo().window(childWidow);
		}
	}
	public void cart()
	{
		access.cart(driver).click();
	}
	public void changeqnty(){
	 Select changeqty = new Select(access.changequantity(driver));
	 changeqty.selectByValue("3");
	}
	public void chkout()
	{
		access.proceed_checkout(driver).click();
	}
	public void email()
	{
		access.emailId(driver).sendKeys("mitksgr4@gmail.com");
	}
	public void enterPass()
	{
		access.password(driver).sendKeys("sagar123");
	}
	public void reenter()
	{
		access.login(driver).click();
	}
	public void continue12()
	{
		access.continue1(driver).click();
	}
	public void main(String agrs[])
	{
		Base base = new Base();
		base.searchIphone();
		base.clickPhoneSearch();
		base.selectPhone();
	}

	
}
