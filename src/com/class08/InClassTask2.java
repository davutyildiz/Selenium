package com.class08;
/*
 * TC 1: Table headers and rows verification

1.Open chrome browser
2.Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
3.Login to the application
4.Verify customer “Susan McLaren” is present in the table
5.Click on customer details
6.Update customer details
7. Verify updated customers name is displayed in table
8.close browser

 */
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;
public class InClassTask2 extends CommonMethods{
	
	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		// login
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		//Search for Susan McLaren
		String expectedValue="Susan McLaren";
		List<WebElement>rows=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
		for(int i=1; i<rows.size();i++) {
			Thread.sleep(1000);
			String rowText=rows.get(i-1).getText();
			System.out.println(rowText);
			if(rowText.contains(expectedValue)) {
				Thread.sleep(1000);
				//driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+i+"]/td[1]")).click();
				//click on customer details
				driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+i+"]/td[13]")).click();
				break;
			}
		}
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']")));		
			// update constumer last name and creditcardNumber
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']")).sendKeys(" Susan Smith");
		Thread.sleep(1000);
		//update credit card number
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']")).sendKeys("112233445566");
		Thread.sleep(1000);
		// click update button
		driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_UpdateButton']")).click();
		Thread.sleep(1000);
		
		rows.clear();
		rows=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
		for(int i=1; i<rows.size();i++) {
			String rowsText=rows.get(i-1).getText();
			if(rowsText.contains("Susan Smith")) {
				System.out.println(rowsText);
				System.out.println("Table updated  and test case passed");
				
			}
		}
		
//		List<WebElement>list=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
//		String NewexpectedValue="Susan Smith";
//		for(int i=1; i<list.size();i++) {
//			Thread.sleep(1000);
//			String listText=list.get(i-1).getText();
//			//System.out.println(listText);
//			if(listText.contains(NewexpectedValue)) {
//				Thread.sleep(1000);
//				System.out.println(NewexpectedValue);
//				System.out.println("Table updated  and test case passed");
//			}
//		}
		
driver.quit();
		
	}
}
