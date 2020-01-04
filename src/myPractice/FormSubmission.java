package myPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class FormSubmission extends CommonMethods{
public static final String url="http://166.62.36.207/syntaxpractice/";
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", url);
		driver.findElement(By.linkText("Input Forms")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Input Form Submit")).click();
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@placeholder='First Name']")).click();
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("james");
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).click();
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Star");
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@placeholder='E-Mail Address']")).click();
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='E-Mail Address']")).sendKeys("JamesStar@yahoo.com");
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@placeholder='(845)555-1212']")).click();
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='(845)555-1212']")).sendKeys("(973)444-1313");
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@placeholder='Address']")).click();
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Address']")).sendKeys("155 Riverview Dr.");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='city']")).sendKeys("Wayne");
		Thread.sleep(1000);
		WebElement states=driver.findElement(By.xpath("//select[@name='state']"));
		Select select=new Select(states);
		Thread.sleep(1000);
		select.selectByVisibleText("New Jersey");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Zip Code']")).sendKeys("07470");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Website or domain name']")).sendKeys("www.JamesStar.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("// input[@type='radio' and @value='yes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@placeholder='Project Description']")).sendKeys("That is Final Project");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Thread.sleep(1000);
		
		
		
	}

}
