package automation.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import automation.selenium.base.Page;

public class BookFlightPage extends Page {

	public static void passengerInfo() {
		driver.findElement(By.xpath(OR.getProperty("pFirstname"))).sendKeys("Ramesh");
		driver.findElement(By.xpath(OR.getProperty("pLastname"))).sendKeys("P");
		driver.findElement(By.xpath(OR.getProperty("mealPreference"))).getText().equals("Hindu");
		log.debug("entered passenger info");

	}

	public static void creditCardDetails() {
		driver.findElement(By.xpath(OR.getProperty("cardType"))).getText().equals("Visa");
		driver.findElement(By.xpath(OR.getProperty("cardNumber"))).sendKeys("4543 3434 34343 3323");
		driver.findElement(By.xpath(OR.getProperty("cardExpirationMonth"))).getText().equals("09");
		driver.findElement(By.xpath(OR.getProperty("cardExpirationYear"))).getText().equals("2009");
		driver.findElement(By.xpath(OR.getProperty("cardFirstname"))).sendKeys("Shiva");
		driver.findElement(By.xpath(OR.getProperty("cardLastname"))).sendKeys("N");
		log.debug("entered credit card details!");
	}

	public static void billingAddress() {
		driver.findElement(By.xpath(OR.getProperty("billingAddress"))).sendKeys("200 water street");
		driver.findElement(By.xpath(OR.getProperty("billingCity"))).sendKeys("New York");
		driver.findElement(By.xpath(OR.getProperty("billingState"))).sendKeys("New York State");
		driver.findElement(By.xpath(OR.getProperty("billingZip"))).sendKeys("34343");
		driver.findElement(By.xpath(OR.getProperty("sameAsBilling"))).click();
		driver.findElement(By.xpath(OR.getProperty("securePurchase"))).click();
		log.debug("entered billing address!");
	}

}
