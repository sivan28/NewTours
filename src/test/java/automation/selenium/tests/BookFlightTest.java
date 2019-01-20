package automation.selenium.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation.selenium.base.Page;
import automation.selenium.page.BookFlightPage;
import automation.selenium.page.FlightFinderPage;
import automation.selenium.page.LoginPage;
import automation.selenium.page.SelectFlightPage;

public class BookFlightTest extends Page {
	
	@ Test	
	public static void testBookFlight() {

		LoginPage.Login();
		Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:", "Flight finder page not loaded");

		FlightFinderPage.flightDetails();
		FlightFinderPage.flightPreferences();
		Assert.assertEquals(driver.getTitle(), "Select a Flight: Mercury Tours", "Select Flight page not loaded");
		
		SelectFlightPage.selectFlightDepart();
		SelectFlightPage.clickContinue();
		Assert.assertEquals(driver.getTitle(), "Book a Flight: Mercury Tours", "Flight booking page not loaded");
		
		BookFlightPage.passengerInfo();
		BookFlightPage.creditCardDetails();
		BookFlightPage.billingAddress();
		Assert.assertEquals(driver.getTitle(), "Flight Confirmation: Mercury Tours", "Tickets are not confirmed");
	}
}
