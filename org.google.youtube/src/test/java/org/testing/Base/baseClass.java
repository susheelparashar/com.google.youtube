 package org.testing.Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	
	public ChromeDriver driver;
	public Properties pr;
	
	@BeforeMethod
	public void bMethod() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--disable-notifications");
		o.addArguments("use-fake-ui-for-media-stream"); //turned on the real camera and mic.
		driver = new ChromeDriver(o);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		File f=new File("../org.google.youtube/config.properties"); 
		FileReader fr=new FileReader(f);
		pr=new Properties();
		pr.load(fr);
		
	}
	
	
	@AfterMethod
	public void aMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}

}
