package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	
	Properties pr;
	ChromeDriver driver;
	
	public login(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void signin(String username, String password) throws InterruptedException
	{
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath(pr.getProperty("login"))).click();
		driver.findElement(By.xpath(pr.getProperty("email"))).sendKeys(username);
		driver.findElement(By.xpath(pr.getProperty("email_next"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("password"))).sendKeys(password);
		driver.findElement(By.xpath(pr.getProperty("password_next"))).click();
		Thread.sleep(5000);
		
	}

}
