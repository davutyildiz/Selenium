package com.class11;

import org.openqa.selenium.By;

import com.utils.CommonMethods;
/* navigate to "https://the-internet.herokuapp.com/upload"
 * upload the file
 * verify file is uploaded
 */
public class FileUpload extends CommonMethods{

	public static void main(String[] args) {
		setUp("chrome","https://the-internet.herokuapp.com/upload");
		// to upload file we can use senKeys method and provide full path to the file
		driver.findElement(By.id("file-upload")).sendKeys("‎⁨⁩‎⁨Macintosh HD⁩ /Users⁩ /⁨davutyildiz⁩ / ⁨Downloads/⁩id.jpeg");

	}

}
