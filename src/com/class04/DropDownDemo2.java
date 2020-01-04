package com.class04;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;


public class DropDownDemo2 extends CommonMethods{
	
	public static final String SYNTAX_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";


	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		
		driver.findElement(By.linkText("Input Forms")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Select Dropdown List")).click();
		WebElement weekDropDown=driver.findElement(By.id("select-demo"));
		
		//We can use select class only if the DD tag starts with select tag
		Select select=new Select(weekDropDown);
		
		//Returns the list of all options present in the drop down
		List<WebElement> options = select.getOptions();
		
		//size of dd elements
		System.out.println("Size of the DD is= "+options.size());
		
		for(WebElement element:options) {
			String ddValue=element.getText();
			System.out.println(ddValue);
			if(ddValue.equals("Friday")) {
				element.click();
				Thread.sleep(1000);
			}
			element.click();
			Thread.sleep(1000);

		}
		
		Thread.sleep(3000);
		driver.close();
		
	}

}