package com.FlipKart.Home;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.FlipKart.Pages.SearchBox;
import com.FlipKart.genericLib.BaseTest;
import com.FlipKart.genericLib.FileLib;
import com.FlipKart.genericLib.WebDriverCommonLib;
@Listeners(com.FlipKart.genericLib.MyListener.class)

public class SearchField extends BaseTest {
	@Test
	public void searchField() throws Throwable
	
	{ 
		FileLib flib=new FileLib();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		FlipKartValidLogin fkl=new FlipKartValidLogin();
		fkl.flipkartLogin();
		wlib.waitForPageTitle(flib.getPropertyValue(PROPERTY_PATH,"homeTitle"));
		wlib.verifyPage(wlib.getPageTitle(), flib.getPropertyValue(PROPERTY_PATH, "homeTitle"), "Home Page");
		Reporter.log(wlib.getPageTitle(),true);
		SearchBox sb=new SearchBox(driver);
	   wlib.waitForElementVisibility(sb.getSearch());
	   Thread.sleep(8000);
		sb.search(flib.getPropertyValue(PROPERTY_PATH, "product"));
		Thread.sleep(3000);
		wlib.waitforAllElements(sb.enterOnProduct());
	    sb.enterOnProduct(flib.getPropertyValue(PROPERTY_PATH, "correctproduct"));
	}
}
