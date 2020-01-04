package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class Task1 extends CommonMethods{
/*TC 2: Radio Buttons Practice  
Open chrome browser
Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
Click on “Input Forms” links
Click on “Radio Buttons Demo” links
Click on any radio button in “Radio Button Demo” section.
Verify correct checkbox is clicked
Click on any radio button in “Group Radio Buttons Demo” section.
Verify correct checkbox is clicked
Quit browser
 */
	public static final String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", url);
		driver.manage().window().fullscreen();
		driver.findElement(By.linkText("Input Form")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		Thread.sleep(2000);
		WebElement maleRadioB = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
		System.out.println(maleRadioB.isSelected());
		maleRadioB.click();

	}

}
