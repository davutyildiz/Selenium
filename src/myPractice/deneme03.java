package myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class deneme03 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("Alisher");
		driver.findElement(By.id("password")).sendKeys("123");
		driver.findElement(By.cssSelector("input.btn_action")).click();
		String el=driver.findElement(By.cssSelector("button.error-button")).getText();
		System.out.println(el);
		

	}

}
