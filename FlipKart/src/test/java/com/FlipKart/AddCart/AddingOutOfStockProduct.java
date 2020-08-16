package com.FlipKart.AddCart;

import org.testng.annotations.Test;

import com.FlipKart.Home.FlipKartValidLogin;
import com.FlipKart.Pages.AddCartPage;
import com.FlipKart.Pages.OutOfStockProductPage;
import com.FlipKart.Pages.ProductsList;
import com.FlipKart.Pages.SearchBox;
import com.FlipKart.genericLib.BaseTest;
import com.FlipKart.genericLib.FileLib;
import com.FlipKart.genericLib.WebDriverCommonLib;

public class AddingOutOfStockProduct extends BaseTest{
	@Test
public void addingOutOfStock() throws Throwable
{
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		FileLib flib=new FileLib();	
		FlipKartValidLogin fvl=new FlipKartValidLogin();
		fvl.flipkartLogin();
		SearchBox sb=new SearchBox(driver);
		Thread.sleep(5000);
		wlib.waitForElementVisibility(sb.getSearch());
		sb.search(flib.getPropertyValue(PROPERTY_PATH, "oneMoreProduct"));
		Thread.sleep(2000);
		wlib.waitforAllElements(sb.enterOnProduct());
		sb.enterOnProduct(flib.getPropertyValue(PROPERTY_PATH, "nameOfProduct"));
		wlib.waitForPageTitle(flib.getPropertyValue(PROPERTY_PATH, "anotherProductTitle"));
		ProductsList pl=new ProductsList(driver);
		wlib.waitForElementVisibility(pl.getLowHigh());
		pl.setOutStockProduct();
	    wlib.handleWindow(flib.getPropertyValue(PROPERTY_PATH, "OutOfStockTitle"));
		wlib.waitForPageTitle(flib.getPropertyValue(PROPERTY_PATH, "OutOfStockTitle"));
		wlib.verifyPage(wlib.getPageTitle(), flib.getPropertyValue(PROPERTY_PATH,"OutOfStockTitle"), "product Details Page");
		
		AddCartPage ap=new AddCartPage(driver);
		wlib.waitForElementVisibility(ap.getPincode());
		ap.add1(flib.getPropertyValue(PROPERTY_PATH,"pincode"));
		
		OutOfStockProductPage osp=new OutOfStockProductPage(driver);
		wlib.waitForElementVisibility(osp.getOutofStock());
		osp.setOutofStock();
}
}
