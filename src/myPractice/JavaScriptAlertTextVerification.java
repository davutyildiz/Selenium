package myPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class JavaScriptAlertTextVerification extends CommonMethods {
public static final String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.ht\n" + 
		"ml";
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", url);
		driver.findElement(By.linkText("Alerts & Modals")).click();;
		Thread.sleep(1000);
		driver.findElement(By.linkText("Javascript Alerts")).click();;
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		
		

		driver.switchTo().alert();
		
		Alert alert=driver.switchTo().alert();
		driver.switchTo().alert();
		String str=alert.getText();
		System.out.println(str);
		alert.accept();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
		Thread.sleep(1000);
		
		driver.switchTo().alert();
		
		Alert alert1=driver.switchTo().alert();
		driver.switchTo().alert();
		String str2=alert1.getText();
		System.out.println(str2);
		alert1.accept();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("// button[@onclick='myPromptFunction()']")).click();
		driver.switchTo().alert();
		Alert alert2=driver.switchTo().alert();
		String str3=alert2.getText();
		System.out.println(str3);
		Thread.sleep(1000);
		alert2.sendKeys("Rodin");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//p[@id='prompt-demo']")).sendKeys("Rodin");
		alert2.accept();
		Thread.sleep(1000);
		String name=driver.findElement(By.xpath("//p[@id='prompt-demo']")).getText();
		System.out.println(name);

}
}