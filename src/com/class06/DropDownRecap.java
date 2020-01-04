package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class DropDownRecap extends CommonMethods{
	public static void main(String[] args) throws InterruptedException {

		setUp("chrome", "https://www.ebay.com/");
		WebElement dd=driver.findElement(By.cssSelector("input#gh-btn"));
		Select obj=new Select(dd);
		List<WebElement> options=obj.getOptions();
		//validate each option is clickable
//		for (WebElement option: options) {
//			option.click();
//			Thread.sleep(1000);
//		}
		
		//validate user can select "Music"
		obj.selectByVisibleText("music");
		boolean isSelected=false;
		for(WebElement option: options) {
			String text=option.getText();
			if(text.equals("music")) {
				obj.selectByVisibleText(text);
				isSelected=true;
				break;
			}
		}
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
