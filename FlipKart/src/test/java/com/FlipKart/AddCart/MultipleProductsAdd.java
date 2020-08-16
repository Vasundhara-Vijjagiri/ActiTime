package com.FlipKart.AddCart;
import org.testng.annotations.Test;

import com.FlipKart.Pages.AddCartPage;
import com.FlipKart.ProductsDetails.OnemoreProductList;
import com.FlipKart.genericLib.BaseTest;
import com.FlipKart.genericLib.FileLib;
import com.FlipKart.genericLib.WebDriverCommonLib;

public class MultipleProductsAdd extends BaseTest {
	@Test
	public void addingMultipleProduct() throws Throwable
	{
		WebDriverCommonLib wlib=new WebDriverCommonLib();
FileLib flib=new FileLib();	
OnemoreProductList opl=new OnemoreProductList();
opl.oneMoreDisplay();
AddCartPage ap=new AddCartPage(driver);
ap.add(flib.getPropertyValue(PROPERTY_PATH, "pincode"));
Thread.sleep(5000);
wlib.waitForPageTitle(flib.getPropertyValue(PROPERTY_PATH, "orderTitle"));
wlib.verifyPage(wlib.getPageTitle(), flib.getPropertyValue(PROPERTY_PATH, "orderTitle"), "Place Order Page");

}

}
