package com.class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class FramesDemo extends CommonMethods{

	public static final String SYNTAX_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";

	public static void main(String[] args) throws InterruptedException {
		
		//The method is opening syntax Practice website using chrome browser
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		
		driver.findElement(By.linkText("Others")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Iframe")).click();
		Thread.sleep(2000);

		/*
		 * 1. opening the webpage, the of webdriver will be in the main window by default
		 * 2. some some action in the main window. I'm getting some text from main window
		 * 
		 * Now I want to do some action inside the frame.
		 * 
		 * 3. now I have to switch to that frame
		 * Now here inside the frame I want to do some other actions
		 * 
		 */
		String mainWText=driver.findElement(By.xpath("//h2[text()='IFrame practice']")).getText();
		
		//main window text
		System.out.println("This text is from main window: "+mainWText);
		
		
		Thread.sleep(2000);
		//Switch to Frame so you can perform action. 
		//you can switch by nameOrId, index by webelement/xpath
		driver.switchTo().frame(0);
		Thread.sleep(2000);

		//This text is inside the frame, I'm finding the element and getinng the text
		String insideFText=driver.findElement(By.xpath("//h4[text()='Practice Selenium Automation Testing Online']")).getText();

		//print text
		System.out.println("This text is from inside frame one: "+insideFText);

		//This method will take the focuse of your webdriver back to the main window
		driver.switchTo().defaultContent();
		
		
		//in main window see if below text is displayed
		boolean textDis=driver.findElement(By.xpath("//h2[text()='IFrame practice']")).isDisplayed();
		
		
		Thread.sleep(1000);
		System.out.println("Is text in main window Displayed: "+textDis);
		
		driver.close();
		
	}
}