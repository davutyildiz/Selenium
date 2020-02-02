package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class ExplicitWaitDEmo2 extends CommonMethods{

/*
 * navigate to google
 * search for wegmans
 * click on link "Wegmans Grocery Delivery | Powered By Instacart‎"
 * once we refirected to the site click "Log In"
 */
	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome", "https://google.com");
		//send Wegmans text and hit enter
		driver.findElement(By.name("q")).sendKeys("Wegmans", Keys.ENTER);
		//click on first link on results page
		driver.findElement(By.xpath("//h3[@class='LC20lb']")).click();
		//click on sign in 
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("sign-in")));
		
		driver.findElement(By.id("sign-in")).click();
		System.out.println("button was clicked-----------------");
		
		Thread.sleep(3000);
		driver.quit();
	}
}