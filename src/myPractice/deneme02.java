package myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class deneme02 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Rodin");
		driver.findElement(By.name("lastName")).sendKeys("James");
		driver.findElement(By.name("phone")).sendKeys("123456789101010");
		driver.findElement(By.id("userName")).sendKeys("Rodin123@yahoo.com");
		driver.findElement(By.name("address1")).sendKeys("lafayetta Street ");
		driver.findElement(By.name("address2")).sendKeys("No 123/2");
		driver.findElement(By.name("city")).sendKeys("wayne");
		driver.findElement(By.name("state")).sendKeys("NJ");
		driver.findElement(By.name("postalCode")).sendKeys("07470");
		driver.findElement(By.name("country")).sendKeys("UNITED STATES");
		driver.findElement(By.id("email")).sendKeys("Rodin123@yahoo.com");
		driver.findElement(By.name("password")).sendKeys("Rodin1");
		driver.findElement(By.name("confirmPassword")).sendKeys("Rodin1");
		driver.findElement(By.name("register")).click();
	}

}
