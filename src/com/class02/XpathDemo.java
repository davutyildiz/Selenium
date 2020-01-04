package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login\\\\n");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sohilaryan");

		
		
		//input[@type='text']
		//form[starts-with(@action,'/humanresource')]
		//h1[text()='A place where knowledge becomes a creer']
		//h1[contains(text(),'Syntax')]
		//input[@type='hidden' and @name='actionID']
		//input[@type='hidden' or @name='actionID']
		
	}

}
