package automation.selenium.page;

import org.openqa.selenium.By;

import automation.selenium.base.Page;

public class ItenararyPage extends Page {
	
	public static void cancelAllReservations() {
		driver.findElement(By.xpath("//area[@shape='rect']")).click();
		
	}	
}
