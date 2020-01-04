package myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class deneme01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ali@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("ali123");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(2000);
		driver.close();
		
	

	}

}
