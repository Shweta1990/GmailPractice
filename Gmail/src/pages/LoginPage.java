package pages;

import java.util.ResourceBundle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage{
	
	WebDriver driver;
	ResourceBundle rb;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		rb = ResourceBundle.getBundle("Elements");
	}
	
	public void UserName(String uname) throws InterruptedException
	{
		driver.findElement(By.id(rb.getString("LoginPage_UserName_id"))).sendKeys(uname);
		driver.findElement(By.id("next")).click();
		Thread.sleep(1000);
	}
	
	public void password(String pass)
	{
		driver.findElement(By.id(rb.getString("LoginPage_password_id"))).sendKeys(pass);
	}
	
	public void enter() throws InterruptedException
	{
		driver.findElement(By.id(rb.getString("LoginPage_enter_id"))).click();
		Thread.sleep(10000);
	}

	public void logout()
	{
		driver.findElement(By.xpath(rb.getString("LoginPage_logout_xpath"))).click();
	}
	
	public void logoutclick() throws InterruptedException
	{
		driver.findElement(By.id(rb.getString("LoginPage_logoutclick_id"))).click();
		Thread.sleep(10000);
	}
	
}
