package compare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Validate {
	
	public static boolean validateURL(WebDriver driver , String expURL)
	
	{
		boolean res=false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expURL))
		{
			res = true;
		}
		
		return res;
	}
	
	public static boolean validateTitle(WebDriver driver , String expTitle)
	
	{
		boolean res=false;
		if(driver.getTitle().equalsIgnoreCase(expTitle))
		{
			res = true;
		}
		
		return res;
	}

	public static boolean validateElementExist(WebDriver driver , String xpath)
	
	{
		boolean res=false;
		try
		{
			driver.findElement(By.xpath(xpath));
			res = true;
			System.out.println(res);
		}
		catch(Exception e)
		{
			
		}
			return res;
	}
	
public static boolean validateText(WebDriver driver , String xpath, String expText)
	
	{
		boolean res=false;
		if(driver.findElement(By.xpath(xpath)).getText().equalsIgnoreCase(expText))
			{
				res = true;
				System.out.println(res);
				System.out.println(expText);
			}
			return res;
	}
}
