package com.class07;
/*
1. Open chrome browser
2. Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
3. Login into the application
4. Add Employee
5. Verify Employee has been added
6. Go to Employee List
7. Delete added Employee
8. Quit the browser
 */
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class AddEmployee extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome",Constants.HRMS_URL);
		// input user name
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		// input password
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		// click login
		driver.findElement(By.id("btnLogin")).click();
		// click PIM
		driver.findElement(By.linkText("PIM")).click();
		// click Add Employee
		driver.findElement(By.linkText("Add Employee")).click();
		// Full Name
		driver.findElement(By.id("firstName")).sendKeys("James");
		// Middle name
		driver.findElement(By.id("middleName")).sendKeys("Rodin");
		// Last Name
		driver.findElement(By.id("lastName")).sendKeys("Star");
		// create Employee ID
	String EmployeID=driver.findElement(By.id("employeeId")).getAttribute("value");
	System.out.println(EmployeID);
	Thread.sleep(2000);
		// add photograph
		//driver.findElement(By.xpath("//input[@id='photofile']")).click();
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		
		//Deleting the employee     
        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
      
     
        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		for(int i=1; i<rows.size();i++) {
			String rowsText=rows.get(i-1).getText();
			if(rowsText.contains("James Rodin Star")) {
				driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]")).click();
				System.out.println(rowsText);
				System.out.println("Table updated  and test case passed");
				break;
			}
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='btnDelete']")).click();
		driver.quit();
		

	}

}
