package automation.selenium.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation.selenium.page.RegisterPage;

public class RegisterTest extends RegisterPage{

	@Test(dataProvider = "testData")	
	public void testRegister(String firstname, String lastname, String phone, String username, String address, String city, String state, String postalcode, String country) {

		RegisterPage.register();
		Assert.assertEquals(driver.getTitle(), "Register: Mercury Tours", "Register page is not loaded");
		
		RegisterPage.contactInfo(firstname, lastname, phone, username);
		Assert.assertEquals(driver.findElement(By.xpath("//font[@color='#FFFFFF']//font[@face='ARIAL, HELVETICA'][contains(text(),'Information')]")).getText(), "Contact Information", "Text not present");
		
		RegisterPage.mailingInfo(address, city, state, postalcode, country);
		RegisterPage.userInfo();
		RegisterPage.submit();
		
		Assert.assertEquals(driver.findElement(By.xpath("//td[@valign='top']//td//td//td//p[2]//font[1]")).getText(), "Thank you for registering. You may now sign-in using the user name and password you've just entered.", "Registration is unsuccessful");

	}
}
