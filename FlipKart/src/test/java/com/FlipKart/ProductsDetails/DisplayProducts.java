package com.FlipKart.ProductsDetails;

import org.testng.annotations.Test;

import com.FlipKart.Home.SearchField;
import com.FlipKart.Pages.ProductsList;
import com.FlipKart.genericLib.BaseTest;
import com.FlipKart.genericLib.FileLib;
import com.FlipKart.genericLib.WebDriverCommonLib;

public class DisplayProducts extends BaseTest {
	@Test
	public void  displaying() throws Throwable
	{
		SearchField sf=new SearchField();
		sf.searchField();
	    ProductsList pl=new ProductsList(driver);
	    WebDriverCommonLib wlib=new  WebDriverCommonLib();
	    FileLib flib=new FileLib();
	    wlib.waitForPageTitle(wlib.getPageTitle());
	    Thread.sleep(6000);
	  wlib.waitForElementVisibility(pl.getLowHigh());
	  
	    pl.setLowHigh();
	    Thread.sleep(2000);
	    wlib.waitForElementVisibility(pl.getMobilename());
	    pl.setMobilename();
	    wlib.waitForPageTitle(wlib.getPageTitle());
	    wlib.verifyPage(wlib.getPageTitle(), flib.getPropertyValue(PROPERTY_PATH,"productsTitle"), "ProductsList page");
		
		}
	}


