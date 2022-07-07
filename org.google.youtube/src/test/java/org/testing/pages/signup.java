package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class signup {
	
	Properties pr;
	ChromeDriver driver;
	
	public signup(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
		public void createAccount(String firstname, String lastname, String username) throws InterruptedException
	{
		driver.get("https://accounts.google.com/signup");
		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("firstname"))).sendKeys(firstname); 
		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("lastname"))).sendKeys(lastname); 
		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("username"))).sendKeys(username); 
		Thread.sleep(5000);
	}

}
