package com.class06;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class MultipleWindows extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome", "http://jiravm.centralus.cloudapp.azure.com:8081/window-popup-modal-demo.html");
		//store 1 parent id
		String mainWindow = driver.getWindowHandle();
		
		driver.findElement(By.linkText("Follow On Instagram")).click();
		driver.findElement(By.linkText("Like us On Facebook")).click();
		driver.findElement(By.linkText("Follow Instagram & Facebook")).click();
		//collect all window ids
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows.size());
		Iterator<String> it=allwindows.iterator();
		
		while(it.hasNext()) {
			String child=it.next();
			if(!child.equals(mainWindow)) {
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());
				driver.close();
				driver.switchTo().window(mainWindow);
			}
				
		}
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
