package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.syntaxtechs.com/");
	Thread.sleep(2000);
	driver.navigate().to("https:// www.google.com/");
	driver.navigate().back();
	driver.navigate().refresh();
	


}
}
