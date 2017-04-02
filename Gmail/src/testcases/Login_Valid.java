package testcases;

import org.testng.annotations.Test;
import base.DriverInitialization;
import pages.LoginPage;

public class Login_Valid extends DriverInitialization {
	
	@Test
	public void testcase_01() throws InterruptedException
	{
		LoginPage login = new LoginPage(driver);
		login.UserName("shwetaleo19@gmail.com");
		login.password("thrusday@123");
		login.enter();
		login.logout();
		login.logoutclick();
	}
	
}
