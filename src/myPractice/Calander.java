package myPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

/*TC 1: Leave List Search Validation
1.Open chrome browser
2.Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
3.Login into the application
4.Select Leave List
5.Select from December 1, 2019 until January 31, 2020
6.Check only Pending approval
7.Click on Search
8.Validate “No Records Found” is displayed
9.Quit the browser
 */
public class Calander extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
	setUp("chrome","http://166.62.36.207/humanresources/symfony/web/index.php/auth");
	// login into HRMS
			String userName = "Admin";
			String password = "Hum@nhrm123";
			driver.findElement(By.id("txtUsername")).sendKeys(userName);
			driver.findElement(By.id("txtPassword")).sendKeys(password);
			driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(2000);
			driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
			driver.findElement(By.id("menu_leave_viewLeaveList")).click();
			Thread.sleep(2000);
			// call calander for from
			driver.findElement(By.id("calFromDate")).click();
			// select month --- for from
		WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
			Select select=new Select(month);
			select.selectByVisibleText("Dec");
			// select year --- for from
			WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
			Select select1=new Select(year);
			select1.selectByVisibleText("2019");
			// select day--- for from
			driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[1]/td[7]")).click();
			// call calander for To
			driver.findElement(By.id("calToDate")).click();
			// select month --- for TO
			WebElement month1=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
			Select select2=new Select(month1);
			select2.selectByVisibleText("Jan");
			// select year --- for To
			WebElement year1=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
			Select select3=new Select(year1);
			select3.selectByVisibleText("2020");
			// select day--- for To
			driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[5]/td[5]")).click();
			// click on Search
			driver.findElement(By.id("btnSearch")).click();
		Boolean isDisplay=	driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td")).isDisplayed();
		String str=	driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td")).getText();
			
			System.out.println(str);
			
			Thread.sleep(3000);
	driver.quit();

	}

}
