package myPractice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class deneme07 extends CommonMethods{
public static final String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", url);
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Simple Form Demo")).click();
	List<WebElement> element=	driver.findElements(By.xpath("//input[@type='text']"));
	Iterator<WebElement> it=element.iterator();
	
	while(it.hasNext()) {
		it.next().sendKeys("Hello");;
		Thread.sleep(2000);
	}
 driver.close();
	}

}
