package com.FlipKart.Home;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.FlipKart.Pages.LoginPage;
import com.FlipKart.genericLib.BaseTest;
import com.FlipKart.genericLib.FileLib;
import com.FlipKart.genericLib.WebDriverCommonLib;
@Listeners(com.FlipKart.genericLib.MyListener.class)
public class FlipKartValidLogin extends BaseTest {
	@Test
	public void flipkartLogin() throws Throwable
	{
		LoginPage lp=new LoginPage(driver);
		FileLib flib=new FileLib();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.elementDisplyed(lp.getLoginText());
		lp.setLogin(flib.getPropertyValue(PROPERTY_PATH, "mobileno"),flib.getPropertyValue(PROPERTY_PATH, "password"));
		
		
	}

}
