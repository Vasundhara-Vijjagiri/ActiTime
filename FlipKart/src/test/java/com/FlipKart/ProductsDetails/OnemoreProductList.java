package com.FlipKart.ProductsDetails;

import org.testng.annotations.Test;

import com.FlipKart.AddCart.ProductAddingInCart;
import com.FlipKart.Pages.ProductsList;
import com.FlipKart.Pages.SearchBox;
import com.FlipKart.genericLib.BaseTest;
import com.FlipKart.genericLib.FileLib;
import com.FlipKart.genericLib.WebDriverCommonLib;

public class OnemoreProductList extends BaseTest {
	@Test
	public void oneMoreDisplay() throws Throwable
	{
		ProductAddingInCart pac=new ProductAddingInCart();
		pac.addingProduct();
		FileLib flib=new FileLib();
		 WebDriverCommonLib wlib=new  WebDriverCommonLib();
		SearchBox sb=new SearchBox(driver);
		Thread.sleep(3000);
		wlib.waitForElementVisibility(sb.getSearch());
		Thread.sleep(5000);
		sb.setSearch(flib.getPropertyValue(PROPERTY_PATH,"oneMoreProduct"));
		Thread.sleep(3000);	
		wlib.waitforAllElements(sb.enterOnProduct());
		sb.enterOnProduct(flib.getPropertyValue(PROPERTY_PATH,"nameOfProduct"));
		Thread.sleep(5000);
		 wlib.verifyPage(wlib.getPageTitle(), flib.getPropertyValue(PROPERTY_PATH,"anotherProductTitle"), "One more ProductsList page");
		ProductsList pl=new ProductsList(driver);
	    wlib.waitForPageTitle(wlib.getPageTitle());
	    
	    Thread.sleep(3000);
	  pl.setDiscount();
	  wlib.waitForElementVisibility(pl.getTvname());
	    pl.setTvname();
	    wlib.waitForPageTitle(wlib.getPageTitle());
	   
	    wlib.handleWindow(flib.getPropertyValue(PROPERTY_PATH, "childWindowOfAnother"));
	    wlib.waitForPageTitle(flib.getPropertyValue(PROPERTY_PATH, "childWindowOfAnother"));
	    wlib.verifyPage(wlib.getPageTitle(), flib.getPropertyValue(PROPERTY_PATH, "childWindowOfAnother"), "another product details page");
	    
	    
	    
}

}