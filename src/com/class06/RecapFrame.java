package com.class06;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class RecapFrame extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome", "http://jiravm.centralus.cloudapp.azure.com:8081/bootstrap-iframe.html");
		driver.switchTo().frame("FrameOne");
		Thread.sleep(2000);
		boolean isDisplayed=driver.findElement(By.xpath("//h3[text()='Syntax Technologies']")).isDisplayed();
		Thread.sleep(3000);
		if(isDisplayed) {
			System.out.println("Pass");
		}else {
			System.out.println("Failed");
		}
	
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.quit();
	}
}
