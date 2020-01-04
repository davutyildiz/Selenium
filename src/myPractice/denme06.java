package myPractice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class denme06 extends CommonMethods{
public static final String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", url);
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Checkbox Demo")).click();
		driver.findElement(By.id("isAgeSelected")).click();
		String str=driver.findElement(By.id("txtAge")).getText();
		System.out.println(str);
		
		List<WebElement> checkBox=driver.findElements(By.xpath("//input[@class='cb1-element']"));
		
		if(!checkBox.isEmpty()) {
		
		Iterator<WebElement>it=checkBox.iterator();
		while(it.hasNext()) {
			it.next().click();
			Thread.sleep(1000);
		}
		
		}else {
			System.err.println("CheckBox List is Empty");
		}
	}

}
