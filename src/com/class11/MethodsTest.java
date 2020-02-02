package com.class11;

import com.utils.CommonMethods;

public class MethodsTest extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","https://expedia.com");
		Thread.sleep(3000);
	scrollDown(1000);
	Thread.sleep(3000);
	scrollUp(1000);
	Thread.sleep(3000);
	driver.quit();
	}

}
