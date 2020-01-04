package com.class05;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Task2 extends CommonMethods{
	public static final String url = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", url);
		driver.findElement(By.linkText("Others")).click();
		driver.findElement(By.linkText("Iframe")).click();
		
		driver.switchTo().frame("FrameOne");
		Thread.sleep(2000);
		driver.findElement(By.className("row")).click();
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame("FrameTwo");
		Thread.sleep(2000);
		boolean b=driver.findElement(By.xpath("//img[@alt='Syntax Technologies']")).isDisplayed();
		System.out.println(b);

		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
	}

}
