package myPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class TotalNumberOfLinks extends CommonMethods {
public static final String url="https://www.amazon.com/";
	public static void main(String[] args) {
		
		CommonMethods.setUp("chrome", url);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Size of all Links "+links.size());
		
		for(WebElement link:links) {
			String allLink=link.getText();
			if(!allLink.isEmpty()) {
				System.out.println(allLink);
			}
		}
		
		//driver.quit();
	}

}
