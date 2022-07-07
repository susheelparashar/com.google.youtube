package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class home {
	Properties pr;
	ChromeDriver driver;
	
	public home(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void clickTrending() throws InterruptedException
	{
		//click history
		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("explore"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("trending"))).click();
		Thread.sleep(5000);	
	}
	
	public void clickHistory() throws InterruptedException
	{
		//click history
		Thread.sleep(2000);
		driver.findElement(By.linkText(pr.getProperty("history"))).click();
		Thread.sleep(5000);	
	}
	
	public void clickSubscription() throws InterruptedException
	{
		//click subscriptions
		Thread.sleep(5000);
		driver.findElement(By.linkText(pr.getProperty("subscriptions"))).click();
		Thread.sleep(5000);	
	}
	
		
	public void clickWatchLater() throws InterruptedException
	{
		// click on watch later
		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("watchLater"))).click(); //click on comment
		Thread.sleep(5000);
	}
	
	public void clickLibrary() throws InterruptedException
	{
		// click on Library
		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("library"))).click(); //click on Library
		Thread.sleep(5000);
	}
}
