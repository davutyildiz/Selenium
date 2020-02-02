package myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utils.CommonMethods;

public class SearchOnGoogle extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome","https:/google.com");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("iphone 11",Keys.ESCAPE);
		Thread.sleep(3000);
		// Action class
		
		Actions act=new Actions(driver);
		WebElement button=driver.findElement(By.name("btnK"));
		act.moveToElement(button).click().perform();
		
	}

}
