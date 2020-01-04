package myPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class WindowsHandling extends CommonMethods{
public static final String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", url);
		driver.findElement(By.linkText("Alerts & Modals")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Window Popup Modal")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Follow On Instagram")).click();
		Thread.sleep(1000);
		Set <String> allwindowsID=driver.getWindowHandles();
		//System.out.println("How man Windows opened: "+allwindowsID.size());
		Iterator<String> it = allwindowsID.iterator();
			//get the first id
				String parentW = it.next();
				//get the second id
				String childW = it.next();
				//printing parent id
				System.out.println("Parent Id: "+parentW);
				//printing child id
				System.out.println("Child Id: "+childW);
				//switch to child window
				driver.switchTo().window(childW);
				//get the title of child window and print it
				System.out.println("Title of the Child Window: "+driver.getTitle());
				driver.close();
				Thread.sleep(1000);
				driver.switchTo().window(parentW);
				Thread.sleep(1000);
			
		driver.findElement(By.linkText("Like us On Facebook")).click();
		Thread.sleep(1000);
		Set <String> allwindowsID1=driver.getWindowHandles();
		Iterator<String>it1=allwindowsID1.iterator();
		String parentW1=it1.next();
		String childW2=it1.next();
		System.out.println(parentW1);
		Thread.sleep(1000);
		System.out.println(childW2);
		Thread.sleep(1000);
		driver.switchTo().window(childW2);
		Thread.sleep(2000);;
		String str=	driver.getTitle();
		Thread.sleep(2000);
		System.out.println(str);
		Thread.sleep(1000);
		driver.close();
		driver.switchTo().window(parentW1);
		Thread.sleep(1000);
		driver.close();
			
				
	
		
	}

}
