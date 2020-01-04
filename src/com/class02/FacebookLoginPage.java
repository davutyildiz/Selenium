package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("ali@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("ali@123");
		driver.findElement(By.id("u_0_b")).click();
		
		driver.close();
		
	}

}