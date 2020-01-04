package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class RecapAlert extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome", "http://jiravm.centralus.cloudapp.azure.com:8081/javascript-alert-box-demo.html");
		driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']")).click();
		
		Alert alert=driver.switchTo().alert();
		String alertText=alert.getText();
		System.out.println(alertText);
		alert.accept();
	
		Thread.sleep(3000);
		driver.quit();
	}
}
