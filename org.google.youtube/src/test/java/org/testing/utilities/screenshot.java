package org.testing.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
	
	
	public void takeScreenshot(ChromeDriver driver, String fileName,String extension) throws IOException
	{
		File f=driver.getScreenshotAs(OutputType.FILE);
		
		// Open the current date and time
		String timestamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		//System.out.println(timestamp);
		
		//Copy the screenshot on the desire location with different name using current date and time
		FileUtils.copyFile(f, new File("C:\\Users\\susheel.parashar\\Documents\\screenshot\\" + fileName+"_"+timestamp+extension));
		
	}

}
