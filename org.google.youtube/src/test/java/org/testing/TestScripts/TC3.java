package org.testing.TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.Base.baseClass;
import org.testing.pages.home;
import org.testing.pages.login;
import org.testing.pages.logout;
import org.testing.utilities.screenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC3 extends baseClass{

@Test
public void test() throws InterruptedException, IOException
{
		//login
			login li=new login(driver, pr);
			li.signin("testhc84@gmail.com", "bbcl@123");	
			
		//click subscriptions
			home h=new home(driver, pr);
			h.clickSubscription();
			
		//take screenshot
			screenshot s=new screenshot();
			s.takeScreenshot(driver, "screenshot", ".png");
			
		//logout
			logout lo=new logout(driver, pr);
			lo.signout();
}


}
