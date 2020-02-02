package com.class10;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class HW extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
	// open chrome and go to AA homepage
		
		setUp("chrome","https://www.aa.com/homePage.do");
		Thread.sleep(2000);
		// Enter From ----> clear place
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).clear();
		// Enter From
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys("JFK");
		Thread.sleep(2000);
	}

}
