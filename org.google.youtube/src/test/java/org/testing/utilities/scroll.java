package org.testing.utilities;

import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {
	
	Properties pr;
	ChromeDriver driver;
	
	public scroll(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void scrollDown() throws InterruptedException
	{
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(10000);
	}

}
