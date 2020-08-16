package com.FlipKart.OrderSummary;

import org.testng.annotations.Test;

import com.FlipKart.Pages.OrderSummaryPage;
import com.FlipKart.PlaceOrder.MultiplePlaceOrder;
import com.FlipKart.genericLib.BaseTest;
import com.FlipKart.genericLib.FileLib;
import com.FlipKart.genericLib.WebDriverCommonLib;

public class OrderSummary extends BaseTest {
	@Test
	public void orderSummary() throws Throwable
	{   FileLib flib=new FileLib();
	WebDriverCommonLib wlib=new WebDriverCommonLib();
		MultiplePlaceOrder mpo=new MultiplePlaceOrder();
		mpo.multipleOrder();
		OrderSummaryPage osp=new OrderSummaryPage(driver);
		wlib.waitForElementVisibility(osp.getConti());
		Thread.sleep(5000);
		osp.setConti();
		wlib.waitForPageTitle(flib.getPropertyValue(PROPERTY_PATH, "orderSummaryPage"));
		wlib.verifyPage(wlib.getPageTitle(), flib.getPropertyValue(PROPERTY_PATH, "orderSummaryPage"),"Payment Options Page");
		
		
		
	}

}

