package automation.selenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import automation.selenium.base.Page;
import automation.selenium.page.FlightFinderPage;
import automation.selenium.page.ItenararyPage;
import automation.selenium.page.LoginPage;

public class CancelFlightTest extends Page {
	@Test
	public static void CancelItinerary() {
		LoginPage.Login();
		FlightFinderPage.itenarary();
		ItenararyPage.cancelAllReservations();
		Assert.assertEquals(driver.getTitle(), "Welcome: Mercury Tours", "Reservations not cancelled");
	}

}
