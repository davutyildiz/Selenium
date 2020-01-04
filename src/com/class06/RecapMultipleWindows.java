package com.class06;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class RecapMultipleWindows extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome", "http://jiravm.centralus.cloudapp.azure.com:8081/window-popup-modal-demo.html");
		String mainWindow=driver.getWindowHandle();
		System.out.println(mainWindow);
		driver.findElement(By.linkText("Follow On Instagram")).click();
		//1 getWindowHandles()
		//identify parent & child 
		// switch
		
		Set<String> allWindows=driver.getWindowHandles();
		Iterator<String> stringIterator=allWindows.iterator();
		String parent=stringIterator.next();
		System.out.println(parent);
		System.out.println("-------------------------");
		String child = stringIterator.next();
		System.out.println(child);
		
		driver.switchTo().window(child);
		String childTitle=driver.getTitle();
		System.out.println(childTitle);
		
		driver.switchTo().window(parent);
		String parentTitle=driver.getTitle();
		System.out.println(parentTitle);
	
		Thread.sleep(3000);
		driver.quit();
	}
}
