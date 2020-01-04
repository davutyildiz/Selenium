package myPractice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class AmazonDepartmentListVerification extends CommonMethods{
public static final String url="http://amazon.com/";
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", url);
		
WebElement Dropdown2=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
Select s2=new Select(Dropdown2);
List<WebElement> values2=s2.getOptions();
int totalvalues2=values2.size();
System.out.println(totalvalues2);

Iterator<WebElement>it=values2.iterator();
while(it.hasNext()) {
	String str=it.next().getText();
	Thread.sleep(500);
if(str.equalsIgnoreCase("Computers")) {
	it.next().click();
	Thread.sleep(1000);
	System.out.println(str);
}else {
	System.out.println(str);
}
}
driver.quit();


	}

}
