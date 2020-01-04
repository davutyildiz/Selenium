package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://Amazon.com/");
		
		final String expectedTitle=("Amazon.com:Online Shopping for Electronics, Apparel,Computers,Books,DVDs & more");
		String actualTitle=driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Expected title match Actual title ");
		}else {
			System.out.println("Expected title did not match Actual title ");
		}

	}

}
