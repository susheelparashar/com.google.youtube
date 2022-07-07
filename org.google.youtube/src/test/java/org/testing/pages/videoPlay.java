package org.testing.pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class videoPlay {
	Properties pr;
	ChromeDriver driver;
	
	public videoPlay(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void playVideo() throws InterruptedException
	{
		Thread.sleep(5000);
		List<WebElement> videos=driver.findElements(By.id("content"));
		System.out.println("total videos: "+videos.size());
		Thread.sleep(5000);
		videos.get(3).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("like"))).click();
		Thread.sleep(2000);
	}
	
	public void likeVideo() throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("like"))).click();
		Thread.sleep(2000);
	}
	
	public void commentVideo() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath(pr.getProperty("commentIcon"))).click(); //click on comment
		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("commentBox"))).sendKeys("awsom video"); //enter comment
		driver.findElement(By.xpath(pr.getProperty("commentBox"))).sendKeys(Keys.CONTROL, Keys.ENTER); //click submit
		Thread.sleep(5000);
	}
	
	public void subscribeChannel() throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("subscribe"))).click();
		Thread.sleep(5000);
	}
	
	
}
