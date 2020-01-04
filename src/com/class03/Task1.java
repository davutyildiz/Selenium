package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		
		WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		userName.sendKeys("sohilaryan");
		
		WebElement userPassword=driver.findElement(By.xpath("//input[@name='txtPassword']"));
		userPassword.sendKeys("Syntax@12");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
