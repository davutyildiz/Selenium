package com.class11;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Recap extends CommonMethods {

	public static void main(String[] args) {
		setUp("chrome","https://google.com");
		driver.findElement(By.name("q")).sendKeys("iphone pro 11");

	}

}
