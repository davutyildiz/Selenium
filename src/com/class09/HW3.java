package com.class09;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;
import com.utils.Constants;

public class HW3 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		setUp("chrome", Constants.HRMS_URL);
		// login into HRMS
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		//navigate to the leave
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		driver.findElement(By.id("menu_leave_viewLeaveList")).click();
		//click on the input to bring calendar view
		driver.findElement(By.id("calFromDate")).click();
		Thread.sleep(2000);
		//selecting month
		WebElement fromMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select slctFromMonth = new Select(fromMonth);
		slctFromMonth.selectByVisibleText("Dec");
		//selecting a year
		WebElement fromYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select slctFromYear = new Select(fromYear);
		slctFromYear.selectByVisibleText("2019");
		//storing all cells from the table 
		List<WebElement> fromDate = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		//looping through all cells and getting text
		for (WebElement fromCell : fromDate) {
			String fromDay = fromCell.getText();
			if (fromDay.equals("1")) {
				fromCell.click();
				break;
			}
		}

		Thread.sleep(3000);
		//click on the input to bring calendar view TO
		driver.findElement(By.id("calToDate")).click();
		WebElement toMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select slctToMonth = new Select(toMonth);
		slctToMonth.selectByVisibleText("Jan");
		WebElement toYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select slctToYear = new Select(toYear);
		slctToYear.selectByVisibleText("2020");
		List<WebElement> toDate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement toCell : toDate) {
			String toDay = toCell.getText();
			if (toDay.equals("31")) {
				toCell.click();
				break;
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.id("btnSearch")).click();
		boolean nameVerify = driver.findElement(By.xpath("//td[text()='No Records Found']")).isDisplayed();
		if (nameVerify) {
			System.out.println("No Records Found is Displayed");
		} else {
			System.out.println("Failed");
		}
		Thread.sleep(3000);
		driver.quit();
		
	}
}