package org.testing.TestScripts;
import java.io.IOException;
import org.testing.Base.baseClass;
import org.testing.pages.signup;
import org.testng.annotations.Test;

public class TC9 extends baseClass{

	@Test
	public void test() throws InterruptedException, IOException {
			
				//signup
				signup su=new signup(driver, pr);
				su.createAccount("lalit", "kumar", "lalit");
				
			}
	

}
