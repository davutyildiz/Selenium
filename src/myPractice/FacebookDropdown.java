package myPractice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class FacebookDropdown extends CommonMethods {
public static final String url="https://www.facebook.com";
	public static void main(String[] args) {
		CommonMethods.setUp("chrome", url);
		WebElement Dropdown=driver.findElement(By.xpath("//select[@id='month']"));
		//WebElement Dropdown=driver.findElement(By.cssSelector("select#month"));
		Select s=new Select(Dropdown);
		List<WebElement> values=s.getOptions();
		int totalvalues=values.size();
		System.out.println(totalvalues);
		
		Iterator<WebElement>it=values.iterator();
		while(it.hasNext()) {
			String str=it.next().getText();
			System.out.println(str);
		}
		
		WebElement Dropdown1=driver.findElement(By.xpath("//select[@id='day']"));
		Select s1=new Select(Dropdown1);
		List<WebElement> values1=s1.getOptions();
		int totalvalues1=values1.size();
		System.out.println(totalvalues1);
		
		
		WebElement Dropdown2=driver.findElement(By.xpath("//select[@id='year']"));
		Select s2=new Select(Dropdown2);
		List<WebElement> values2=s2.getOptions();
		int totalvalues2=values2.size();
		System.out.println(totalvalues2);
		
		driver.quit();
		
//		Iterator<WebElement>it=values2.iterator();
//		while(it.hasNext()) {
//			String str=it.next().getText();
//			System.out.println(str);
//		}
	}

}
