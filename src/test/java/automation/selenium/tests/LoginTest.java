package automation.selenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import automation.selenium.base.Page;
import automation.selenium.page.LoginPage;

public class LoginTest extends Page {
	
	@Test
	public static void testLogin() {
	
		log.debug("LoginPage called!");
		LoginPage.Login();
		Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:", "Login Failed");
		
		LoginPage.Logout();
		Assert.assertEquals(driver.getTitle(), "Sign-on: Mercury Tours", "Logout Failed");
	}

}
