package com.FlipKart.PlaceOrder;

import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.FlipKart.AddCart.MultipleProductsAdd;
import com.FlipKart.Pages.PlaceOrderPage;
import com.FlipKart.genericLib.BaseTest;
import com.FlipKart.genericLib.FileLib;
import com.FlipKart.genericLib.WebDriverCommonLib;
@Listeners(com.FlipKart.genericLib.MyListener.class)
public class MultiplePlaceOrder extends BaseTest implements ITestListener {
	
	@Test
	public void multipleOrder() throws Throwable
	{
		FileLib flib=new FileLib();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
	MultipleProductsAdd mpa=new MultipleProductsAdd();
	mpa.addingMultipleProduct();
	PlaceOrderPage pop=new PlaceOrderPage(driver);
	pop.setOrder();
	wlib.waitForPageTitle(flib.getPropertyValue(PROPERTY_PATH, "orderSummaryPage"));
	wlib.verifyPage(wlib.getPageTitle(), flib.getPropertyValue(PROPERTY_PATH, "orderSummaryPage"),"Order Summary page");
	

}
}