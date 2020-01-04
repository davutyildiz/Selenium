package myPractice;



import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class SelectandDeselectValues extends CommonMethods {
public static final String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", url);
		driver.findElement(By.linkText("Input Forms")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Select Dropdown List")).click();
		driver.findElement(By.xpath("//select[@id='select-demo']")).click();
		
		WebElement Dropdown=driver.findElement(By.xpath("//select[@id='select-demo']"));
		Select select=new Select(Dropdown);
		select.selectByIndex(1);
		String selected_day=driver.findElement(By.xpath("//p [@class='selected-value']")).getText();
		System.out.println(selected_day);
		
		
		WebElement states=driver.findElement(By.xpath("//select[@name='States']"));
		Select s=new Select(states);
		boolean b=s.isMultiple();
		System.out.println(b);
		
		for(int i=1; i<=4; i++) {
		s.selectByIndex(i);
		Thread.sleep(1000);
		}
		
		s.deselectByIndex(2);
		
		
		driver.findElement(By.xpath("//button[@id='printAll']")).click();
		
		String str=driver.findElement(By.xpath("//p [@class='getall-selected']")).getText();
		
		System.out.println(str);
		
		driver.quit();
		
	
		
		
	}

}
