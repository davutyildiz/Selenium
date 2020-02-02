package com.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;
import com.utils.Constants;

public class HW1 extends CommonMethods {
	/*
	 * TC 1: Delete Employee Open chrome browser Go to
	 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth” Login into
	 * the application Add Employee Verify Employee has been added Go to Employee
	 * List Delete added Employee Quit the browser
	 */

	public static void main(String[] args) throws InterruptedException {

		setUp("chrome", Constants.HRMS_URL);
		// login into HRMS
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		// navigate to add employee
		driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(500);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add Employee")));

		driver.findElement(By.linkText("Add Employee")).click();

		// adding an employee
		String firstName = "John";
		String lastName = "Smith";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
		driver.findElement(By.id("firstName")).sendKeys(firstName);
		driver.findElement(By.id("lastName")).sendKeys(lastName);

		// store an employee id
		String empId = driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();

		// verify employee was added
		String empDetails = driver.findElement(By.id("profile-pic")).getText();
		if (empDetails.equals(firstName + " " + lastName)) {
			System.out.println("Employee added successfully");
		} else {
			System.out.println("Employee NOT added");
		}
		// navigate to the employee list
		driver.findElement(By.linkText("Employee List")).click();
		// define the flag variable
		boolean found = false;
		while (!found) {
			// Get all rows from from the employee list
			List<WebElement> rows_f = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
			for (int i = 1; i <= rows_f.size(); i++) {
				// get text from each row
				String rowsText = rows_f.get(i - 1).getText();
				// verify if row contains employee id
				if (rowsText.contains(empId)) {
					// change the flag variable
					found = true;
					// deleting an employee
					driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[1]")).click();
					Thread.sleep(5000);
					driver.findElement(By.id("btnDelete")).click();
					Thread.sleep(5000);
					driver.findElement(By.id("dialogDeleteBtn")).click();
					break;
				}
			}
			// if emp id was not found in the first page --> click next
			driver.findElement(By.xpath("//a[text()='Next']")).click();
		}
		driver.quit();
	}
}