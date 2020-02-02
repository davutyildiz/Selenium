package com.class10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utils.CommonMethods;

/*
 * C 1: Drag and Drop verification
1. Open chrome browser
2. Go to “https://jqueryui.com/”
3. Clickon“Droppable”link
4. Using mouse drag “Drag me to my target” to the “Drop Here”
5. Close the browser
 */
public class DragandDrop extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","https://jqueryui.com/");
driver.findElement(By.linkText("Droppable")).click();
Thread.sleep(4000);
driver.switchTo().frame(driver.findElement(By.className("demo-frame")));


WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
Thread.sleep(4000);
WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));

Actions act=new Actions(driver);
Thread.sleep(4000);
act.dragAndDrop(drag, drop).perform();

String textdrop=drop.getText();

if(textdrop.equals("Dropped!")) {
	System.out.println("Test case Pass");
}else {
	System.out.println("Test case Fail");
}
TakesScreenshot ts=(TakesScreenshot)driver;
File screen=ts.getScreenshotAs(OutputType.FILE);
try {
	FileUtils.copyFile(screen, new File("screenshots/HRMS/AdminLogin.jpg"));
} catch (IOException e) {
	
	e.printStackTrace();
	
	
}
Thread.sleep(3000);
driver.quit();

	}

}
