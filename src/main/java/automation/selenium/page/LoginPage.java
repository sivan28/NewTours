package automation.selenium.page;

import org.openqa.selenium.By;
import automation.selenium.base.Page;

public class LoginPage extends Page {
	
	public static void Login() {
		
		driver.findElement(By.xpath(OR.getProperty("uname"))).sendKeys("mercury");
		log.debug("username entered!");
		driver.findElement(By.xpath(OR.getProperty("password"))).sendKeys("mercury");
		log.debug("password entered!");
		driver.findElement(By.xpath(OR.getProperty("login"))).click();
		log.debug("clicked login!");
	}
	
	public static void Logout() {
		
		driver.findElement(By.xpath(OR.getProperty("logout"))).click();
		log.debug("clicked singoff!");
	}

}
