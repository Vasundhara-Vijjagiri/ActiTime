package com.FlipKart.Home;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.FlipKart.Pages.FlipKartLogout;
import com.FlipKart.Pages.LoginPage;
import com.FlipKart.genericLib.BaseTest;
import com.FlipKart.genericLib.WebDriverCommonLib;
@Listeners(com.FlipKart.genericLib.MyListener.class)

public class FlipLogout extends BaseTest {
 
		

	@Test
	public void flipkartLogout() throws Throwable
	{FlipKartValidLogin fvl=new FlipKartValidLogin();
	fvl.flipkartLogin();
	Assert.fail();
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	LoginPage lp=new LoginPage(driver);
		FlipKartLogout fkout=new FlipKartLogout(driver);
		wlib.waitForElementVisibility(fkout.getLogout());
		fkout.setLogout();
		wlib.waitForElementVisibility(fkout.getlog());
		fkout.setLog();
		wlib.waitForElementVisibility(lp.getLoginText());
		wlib.elementDisplyed(lp.getLoginText());
	}

}
