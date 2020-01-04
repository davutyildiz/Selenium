package myPractice;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class deneme08 extends CommonMethods{
public static final String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
	CommonMethods.setUp("chrome", url);
	driver.findElement(By.linkText("Input Forms")).click();
	driver.findElement(By.linkText("Radio Buttons Demo")).click();
	driver.findElement(By.xpath("//input[@value='Male' and @name='optradio' ]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("buttoncheck")).click();
	String str=driver.findElement(By.xpath("// p[@class='radiobutton']")).getText();
	System.out.println(str);
	
	driver.findElement(By.xpath("// input[ @value='Male' and @name='gender']")).click();
	
	driver.findElement(By.xpath("//input[@value='5 - 15']")).click();
	driver.findElement(By.xpath("//button[@onclick]")).click();
	
	String str1=driver.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();
	System.out.println(str1);
	Thread.sleep(1000);
	driver.quit();
	}

}
