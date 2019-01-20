package automation.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import automation.selenium.base.Page;

public class RegisterPage extends Page {

	public static void register() {
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		log.debug("clicked Register link!");
	}
	
	public static void contactInfo(String firstname, String lastname, String phone, String username) {
		driver.findElement(By.xpath(OR.getProperty("firstname"))).sendKeys(firstname);
		driver.findElement(By.xpath(OR.getProperty("lastname"))).sendKeys(lastname);
		driver.findElement(By.xpath(OR.getProperty("phone"))).sendKeys(phone);
		driver.findElement(By.xpath(OR.getProperty("username"))).sendKeys(username);
		log.debug("entered contact details!");
	}

	public static void mailingInfo(String address, String city, String state, String postalcode, String country) {
		driver.findElement(By.xpath(OR.getProperty("address"))).sendKeys(address);
		driver.findElement(By.xpath(OR.getProperty("city"))).sendKeys(city);
		driver.findElement(By.xpath(OR.getProperty("state"))).sendKeys(state);
		driver.findElement(By.xpath(OR.getProperty("postalcode"))).sendKeys(postalcode);
		Select s1 = new Select(driver.findElement(By.xpath(OR.getProperty("country"))));
		s1.selectByVisibleText(country);
		log.debug("entered mailing details!");
	}

	public static void userInfo() {
		driver.findElement(By.cssSelector("#email")).sendKeys("test");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("testpwd");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("testpwd");
		log.debug("entered user information!");
	}

	public static void submit() {
		driver.findElement(By.xpath("//input[@name='register']")).click();
		log.debug("clicked on submit!");
	}

}