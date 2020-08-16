package com.FlipKart.PlaceOrder;

import org.testng.annotations.Test;

import com.FlipKart.AddCart.ProductAddingInCart;
import com.FlipKart.Pages.PlaceOrderPage;
import com.FlipKart.genericLib.BaseTest;
import com.FlipKart.genericLib.FileLib;
import com.FlipKart.genericLib.WebDriverCommonLib;

public class PlaceOrder extends BaseTest {
	@Test
	public void orderPlace() throws Throwable
	{WebDriverCommonLib wlib=new WebDriverCommonLib();
	FileLib flib=new FileLib();
	ProductAddingInCart pac=new ProductAddingInCart();
		pac.addingProduct();
		wlib.waitForPageTitle(flib.getPropertyValue(PROPERTY_PATH, "orderTitle"));
		wlib.verifyPage(wlib.getPageTitle(), flib.getPropertyValue(PROPERTY_PATH, "orderTitle"),"Order Page");
		PlaceOrderPage pop=new PlaceOrderPage(driver);
		pop.setOrder();
	}

}