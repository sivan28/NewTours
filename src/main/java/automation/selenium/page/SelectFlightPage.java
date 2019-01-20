package automation.selenium.page;

import org.openqa.selenium.By;
import automation.selenium.base.Page;

public class SelectFlightPage extends Page {

	public static void selectFlightDepart() {
		driver.findElement(By.xpath("//b[contains(text(),'Unified Airlines 363')]")).click();
		log.debug("selected departure airlines!");
	}

	public static void clickContinue() {
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		log.debug("clicked on continue!");
	}

}
