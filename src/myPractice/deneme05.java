package myPractice;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class deneme05 extends CommonMethods {
	public static final String url="http://166.62.36.207/humanresources/symfony/web/index.php/\n" + 
			"auth/login";
	public static void main(String[] args) {
		CommonMethods.setUp("chrome", url);
		driver.findElement(By.id("txtUsername")).sendKeys("VanEarl");
		//driver.findElement(By.id("txtPassword")).sendKeys("VanEarl@&12");
		driver.findElement(By.id("btnLogin")).click();
	String str=	driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
	System.out.println(str);
	}

}
