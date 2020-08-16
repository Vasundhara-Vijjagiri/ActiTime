package com.FlipKart.AddCart;

import org.testng.annotations.Test;

import com.FlipKart.Pages.AddCartPage;
import com.FlipKart.ProductsDetails.DisplayProducts;
import com.FlipKart.genericLib.BaseTest;
import com.FlipKart.genericLib.FileLib;
import com.FlipKart.genericLib.WebDriverCommonLib;

public class BuyNowProduct extends BaseTest {
	@Test
	public void buyProduct() throws Throwable
	{FileLib flib=new FileLib();
	WebDriverCommonLib wlib=new WebDriverCommonLib();
		DisplayProducts dp=new DisplayProducts();
		dp.displaying();
		wlib.handleWindow(flib.getPropertyValue(PROPERTY_PATH, "childWindowTitle"));
		wlib.waitForPageTitle(flib.getPropertyValue(PROPERTY_PATH, "childWindowTitle"));

		wlib.verifyPage(wlib.getPageTitle(), flib.getPropertyValue(PROPERTY_PATH, "childWindowTitle"), "Product Details Page");
		AddCartPage acp=new AddCartPage(driver);
		acp.buy(flib.getPropertyValue(PROPERTY_PATH, "pincode"));
		wlib.waitForPageTitle(flib.getPropertyValue(PROPERTY_PATH, "buyOrderTitle"));
		wlib.verifyPage(wlib.getPageTitle(), flib.getPropertyValue(PROPERTY_PATH, "buyOrderTitle"),"Order Summary Page");
		
		
		
	}

}
