package org.testing.TestScripts;

import java.io.IOException;

import org.testing.Base.baseClass;
import org.testing.pages.home;
import org.testing.pages.login;
import org.testing.pages.logout;
import org.testing.utilities.log4j;
import org.testing.utilities.screenshot;
import org.testng.annotations.Test;

public class TC1 extends baseClass{
		
@Test
public void test() throws InterruptedException, IOException
{
	/*//logs
	String className=this.getClass().getName();
	log4j logs=new log4j();	
	log4j.logInfo(className, "started browser successfully");
	log4j.logError(className, "this is error");
	*/
	//login
	login li=new login(driver, pr);
	li.signin("testhc84@gmail.com", "bbcl@123");
				
	//click trending
	home hp =new home(driver, pr);
	hp.clickTrending();
	
	//take screenshot
	screenshot s=new screenshot();
	s.takeScreenshot(driver, "screenshot", ".png");
		
	//logout
	logout lo =new logout(driver, pr);
	lo.signout();
	
}


}
