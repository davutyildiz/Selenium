package com.class08;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.utils.CommonMethods;

/*naviagte to the WebOrders
 * login into WebOrders
 * Click checkbox next to Bob Feather
 * 
 */
//Username - Tester
//Password - test
public class DynamicTableDemo extends CommonMethods{

	public static void main(String[] args) {
		setUp("chrome","http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		// login
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		// search for Bob Feather
		String expectedValue="Bob Feather";
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		for(int i=1; i<rows.size();i++) {
			String rowText=rows.get(i-1).getText();
			//System.out.println(rowText);
			if(rowText.contains(expectedValue)) {
				driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+i+"]/td[1]")).click();
			}
		}

		
		driver.quit();
	}

}
