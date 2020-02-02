package com.class09;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

/* TC 1: Table headers and rows verification
1.Open chrome browser
2.Go to “https://www.aa.com/homePage.do”
3.Enter From and To
4.Select departure as May 14 of 2020
5.Select arrival as November 8 of 2020
6.Verify “Choose flights” text is displayed
7.Take s screenshot of the results
8.Close browser
 */
public class Task extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","https://www.aa.com/homePage.do");
		Thread.sleep(2000);
		// Enter From ----> clear place
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).clear();
		// Enter From
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys("JFK");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm\"]/div[3]/div[1]/div/a/span[1]")).click();
		Thread.sleep(2000);
		String mainWindow=driver.getWindowHandle();
		WebElement country=driver.findElement(By.id("countryCode"));
		Select select=new Select(country);
		select.selectByVisibleText("United States");
		Thread.sleep(2000);
		WebElement state=driver.findElement(By.id("stateCode"));
		Select select1=new Select(state);
		select1.selectByVisibleText("New York");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@id='airportsSection']/tbody/tr[9]/td[3]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("airportLookupDialogButton0")).click();
		
		//
		driver.switchTo().window(mainWindow);
		// Enter To
		driver.findElement(By.id("aa-lang-en")).click();
		
		// select from
		
		//driver.quit();
		
	}

}
