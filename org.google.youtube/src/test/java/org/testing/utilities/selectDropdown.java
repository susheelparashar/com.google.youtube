package org.testing.utilities;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropdown {
	
	Properties pr;
	ChromeDriver driver;
	
	public selectDropdown(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void selectByIndex(int input)
	{
		WebElement dd=driver.findElement(By.xpath(pr.getProperty("dropdown")));
		Select index=new Select(dd);
		index.selectByIndex(input);	
	}
	
	public void selectByVisibleText(int input)
	{
		WebElement dd=driver.findElement(By.xpath(pr.getProperty("dropdown")));
		Select text=new Select(dd);
		text.selectByIndex(input);	
	}
	
	public void selectByValue(String input)
	{
		WebElement dd=driver.findElement(By.xpath(pr.getProperty("dropdown")));
		Select value=new Select(dd);
		value.selectByValue(input);	
	}

}
