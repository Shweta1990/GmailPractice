package base;

import java.util.ResourceBundle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import compare.Validate;

public class DriverInitialization {
	
	public WebDriver driver;
	ResourceBundle r = ResourceBundle.getBundle("driver");

	@BeforeMethod
	public void bmet()
	{
		
		if (r.getString("browser_name").equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
			driver= new FirefoxDriver();
			driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
			
			//Assert.assertTrue(Validate.validateURL(driver, "https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier"), "Error: URL not matched");
			//Assert.assertTrue(Validate.validateTitle(driver, "Gmail"));
			//Assert.assertTrue(Validate.validateElementExist(driver, "//h2[@class='hidden-small']"),"Error: Element not found");
			Assert.assertTrue(Validate.validateText(driver, "//h2[@class='hidden-small']", "Sign in to continue to Gmail"), "Error: Text not found");
		}
		else if(r.getString("browser_name").equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver","./driver/IEDriverServer.exe");
			driver= new InternetExplorerDriver();	
			driver.get("https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1");
		}
		
	}
	
//	@AfterMethod
//	public void amet()
//	{
//		driver.quit();
//	}

}
