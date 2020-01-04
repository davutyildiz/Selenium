package com.class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class Task1 extends CommonMethods{
	public static final String url = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
	CommonMethods.setUp("chrome", url);
	driver.findElement(By.linkText("Alerts & Modals")).click();
	driver.findElement(By.linkText("Javascript Alerts")).click();
	driver.findElement(By.xpath("// button[@onclick='myAlertFunction()']")).click();
	Thread.sleep(2000);
	Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	Thread.sleep(2000);
	driver.findElement(By.xpath("// button[@onclick='myConfirmFunction()']")).click();
	System.out.println(alert.getText());
	alert.accept();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("// button[@onclick='myPromptFunction()']")).click();
	alert.sendKeys("Rodin");
	alert.accept();
	Thread.sleep(2000);
	
	String str=driver.findElement(By.id("prompt-demo")).getText();
	System.out.println(str);
	boolean el=driver.findElement(By.id("prompt-demo")).isDisplayed();
	
	System.out.println(el);
	
	driver.close();
	
	
	}

}
