package automation.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import automation.selenium.base.Page;

public class FlightFinderPage extends Page {

	public static void flightDetails() {

		driver.findElement(By.xpath(OR.getProperty("oneway")));
		Select s1 = new Select(driver.findElement(By.xpath(OR.getProperty("passengers"))));
		s1.selectByValue("3");
		Select s2 = new Select(driver.findElement(By.xpath(OR.getProperty("departFrom"))));
		s2.selectByValue("Frankfurt");
		Select s3 = new Select(driver.findElement(By.xpath(OR.getProperty("departMonth"))));
		s3.selectByValue("3");
		Select s4 = new Select(driver.findElement(By.xpath(OR.getProperty("departDay"))));
		s4.selectByValue("5");
		Select s5 = new Select(driver.findElement(By.xpath(OR.getProperty("returnTo"))));
		s5.selectByValue("Paris");
		Select s6 = new Select(driver.findElement(By.xpath(OR.getProperty("returnMonth"))));
		s6.selectByValue("8");
		Select s7 = new Select(driver.findElement(By.xpath(OR.getProperty("returnDay"))));
		s7.selectByValue("6");
		log.debug("entered flight details!");

	}

	public static void flightPreferences() {

		driver.findElement(By.xpath(OR.getProperty("serviceClass"))).click();
		Select s8 = new Select(driver.findElement(By.name("airline")));
		s8.selectByVisibleText("Pangea Airlines");
		
		driver.findElement(By.xpath(OR.getProperty("continue"))).click();
		log.debug("entered flight preferences!");	
		
	}
	
	public static void itenarary() {
		driver.findElement(By.xpath("//a[contains(text(),'ITINERARY')]")).click();
	}
		

}
