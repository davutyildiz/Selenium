package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

/*
 * Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Dynamic Loading” link
Click on “Example 1...” and click on “Start”
Verify element with text “Hello World!” is displayed
Close the browser
 */
public class Task1 extends CommonMethods {

	public static void main(String[] args) {
	setUp("chrome", "https://the-internet.herokuapp.com/");
	driver.findElement(By.linkText("Dynamic Loading")).click();
	driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
	driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
	
	WebDriverWait wait=new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h4[text()='Hello World!']")));
	Boolean isdisplayed=driver.findElement(By.xpath("//h4[text()='Hello World!']")).isDisplayed();
	System.out.println(isdisplayed);
	
	String str =driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText();
	System.out.println(str);
	driver.close();
	
	}

}
