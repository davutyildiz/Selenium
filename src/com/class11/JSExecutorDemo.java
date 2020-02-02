package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class JSExecutorDemo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome", Constants.HRMS_URL);
		// login into HRMS
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	WebElement loginBtn=driver.findElement(By.id("btnLogin"));
	js.executeScript("arguments[0].style.backgroundColor='Red'", loginBtn);
		Thread.sleep(5000);
		js.executeScript("arguments[0].click();", loginBtn);
		
		Thread.sleep(5000);
		driver.quit();
	}

}
