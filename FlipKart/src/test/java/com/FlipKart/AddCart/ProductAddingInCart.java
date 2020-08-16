package com.FlipKart.AddCart;

import org.testng.annotations.Test;

import com.FlipKart.Pages.AddCartPage;
import com.FlipKart.ProductsDetails.DisplayProducts;
import com.FlipKart.genericLib.BaseTest;
import com.FlipKart.genericLib.FileLib;
import com.FlipKart.genericLib.WebDriverCommonLib;

public class ProductAddingInCart extends BaseTest {
	@Test
	public void addingProduct() throws Throwable
	{
		WebDriverCommonLib wlib=new WebDriverCommonLib();
FileLib flib=new FileLib();	
DisplayProducts dp=new DisplayProducts();
dp.displaying();

Thread.sleep(3000);
wlib.handleWindow(flib.getPropertyValue(PROPERTY_PATH, "childWindowTitle"));
wlib.waitForPageTitle(flib.getPropertyValue(PROPERTY_PATH, "childWindowTitle"));
wlib.verifyPage(wlib.getPageTitle(), flib.getPropertyValue(PROPERTY_PATH,"childWindowTitle"), "product Details Page");
//wlib.verifyPage(wlib.getPageTitle(), flib.getPropertyValue(PROPERTY_PATH, "childWindowTitle"), "Product Details Page");

AddCartPage ap=new AddCartPage(driver);
wlib.waitForElementVisibility(ap.getPincode());
ap.add(flib.getPropertyValue(PROPERTY_PATH,"pincode"));
wlib.waitForPageTitle(flib.getPropertyValue(PROPERTY_PATH, "orderTitle"));
wlib.verifyPage(wlib.getPageTitle(), flib.getPropertyValue(PROPERTY_PATH, "orderTitle"),"Order Page");




}	
}