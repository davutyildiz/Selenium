package com.class09;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utils.CommonMethods;
import com.utils.Constants;

/* US 34526: verify user is able to login with valid credentials
 */
public class ScreenShotDemo extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {

		setUp("chrome", Constants.HRMS_URL);
		// login into HRMS
		String userName = "Admin";
		String password = "Hum@nhrm123";
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		// validation that admin is logged in
		String welcomeText = driver.findElement(By.id("welcome")).getText();
		
		if (welcomeText.contains(userName)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
		//How to take screenshot using selenium?
		//We can use TakesScreenshot interface
		//step1: downcast webdriver to the type of TakesScreenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		//call method getScreenshotAs and specify output type
		File screen=ts.getScreenshotAs(OutputType.FILE);
		try {
			//copy file to the specified destination and give name and extension
			FileUtils.copyFile(screen, new File("screenshots/HRMS/AdminLogin.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		driver.quit();
		//from homework take screenshot as a proof that "No record message is displayed"
	}
}