package myPractice;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class SyntaxFrameVerification extends CommonMethods {
public static final String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.htm\n" + 
		"l";
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", url);

		driver.findElement(By.linkText("Others")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Iframe")).click();
		String id1=driver.getWindowHandle();
		System.out.println(id1);
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[1]/div/a")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame(1);
		boolean bl=driver.findElement(By.xpath("//*[@id=\"site-navigation\"]/div/a/img")).isDisplayed();
		System.out.println(bl);
	driver.findElement(By.xpath("//a[@class='enroll-btn']")).click();
	String id2=driver.getWindowHandle();
	System.out.println(id2);
	//driver.switchTo().window("http://jiravm.centralus.cloudapp.azure.com:8081/bootstrap-iframe.html");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		//driver.quit();
		
		
		
		
		
		
		
		
	}

}
