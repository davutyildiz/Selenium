package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

/*
Verify element is clickable
Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Dynamic Controls” link
Select checkbox and click Remove
Click on Add button and verify “It’s back!” text is displayed
Close the browser 	
*/
public class HW extends CommonMethods{

	public static void main(String[] args) {
		// initializin webdriver, call web page
		setUp("chrome","https://the-internet.herokuapp.com");
		
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.xpath("//div[@id='checkbox']")).click();
		driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[@id='message']")));
		driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[@id='message']")));
		Boolean isdisplayed=driver.findElement(By.xpath("//p[@id='message']")).isDisplayed();
		System.out.println(isdisplayed);
		String text=driver.findElement(By.xpath("//p[@id='message']")).getText();
		System.out.println(text);
		driver.close();
		
		
		
		
	}

}
