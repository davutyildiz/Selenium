package com.class07;
/*TC 1: Verify element is present
Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Dynamic Loading” link
Click on “Example 1...” and click on “Start”
Verify element with text “Hello World!” is displayed
Close the browser
 * */

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class Task3VerifyElementisEnabled extends CommonMethods {
	public static void main(String[] args) {
		
		setUp("chrome", "https://the-internet.herokuapp.com/");
		// Click Dynamic Controls
		driver.findElement(By.linkText("Dynamic Controls")).click();
		// Clicl on enable button
		driver.findElement(By.xpath("//button[contains(text(),'Enable')]")).click();
		// Add wait WebDriver
		WebDriverWait wait=new WebDriverWait(driver,30);
		// initialize
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(text(),'Disable')]")));
		//enter text "Hello" in box
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
		// get the value of the text entered
		String enteredText=driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
		// Click on the disable button after entering the text
		driver.findElement(By.xpath("//button[contains(text(),'Disable')]")).click();
		
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(text(),'Enable')]")));
		// get the text displaed
		String str=driver.findElement(By.xpath("//p[@id='message']")).getText();
		
		if(str.equals("It's disabled!")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		System.out.println("Enterer text is :"+enteredText);
	
		driver.close();
	}

}
