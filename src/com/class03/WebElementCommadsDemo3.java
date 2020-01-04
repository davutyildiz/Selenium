package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommadsDemo3 {

	public static final String URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		
		//Storing webelement in a variable
		WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		
		//Entering username
		userName.sendKeys("Admin");
		//To get the hidden text from a textBox/text area
		//We use getAttribute(); method. hidden text will always get stored in "value" attribute
		String userN=userName.getAttribute("value");
		
		//printing the value of "value" attribute
		System.out.println(userN);
		
		//Sending password to password field
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
		
		//getAttribute() will give us the value of the attribute we provide. could be any attribute
		String attribute=driver.findElement(By.xpath("//input[@type='submit']")).getAttribute("class");
		System.out.println(attribute);
		
		//works similar as click();
		//If this causes the current page to change, it will wait for the new page to load.
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
	}

}
