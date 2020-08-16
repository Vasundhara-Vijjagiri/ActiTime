package com.FlipKart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FlipKart.genericLib.WebDriverCommonLib;

public class ProductsList {
	
	@FindBy(xpath="//div[.='Price -- Low to High']") private WebElement lowHigh;
	
	public WebElement getLowHigh() {
		return lowHigh;
	}

	public void setLowHigh() {
	lowHigh.click();
	}
	
	@FindBy(xpath="//div[@class='_1xHtJz' and .='Discount']") private WebElement discount;
	public WebElement getDiscount() {
		return discount;
	}

	public void setDiscount() {
		discount.click();
	}

	@FindBy(xpath="//div[.='Realme 6 Pro (Lightning Orange, 64 GB)']") private WebElement mobilename;

	public WebElement getMobilename() {
		return mobilename;
	}

	public void setMobilename(){
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.mouseHoverAction(getMobilename());
		wlib.waitForElementVisibility(getMobilename());
		mobilename.click();
	}
	
	
	
	
	@FindBy(xpath="//div[.='Samsung 80cm (32 inch) HD Ready LED Smart TV  with Voice Search']") private WebElement tvname;
    public WebElement getTvname() {
		return tvname;
	}

	public void setTvname() throws Throwable
	{   
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.waitForElementVisibility(getTvname());
		Thread.sleep(5000);
		wlib.mouseHoverAction(getTvname());
		wlib.waitForElementVisibility(getTvname());
		tvname.click();
		
	}

	@FindBy(xpath="//div[@class='_1vC4OE _2rQ-NK' and .='₹14,499']") private WebElement outStockProduct;
	public WebElement getOutStockProduct() {
		return outStockProduct;
	}

	public void setOutStockProduct() {
		outStockProduct.click();
	}
	
	public void setoutOfStockTV()
	{WebDriverCommonLib wlib=new WebDriverCommonLib();
	wlib.waitForElementVisibility(getLowHigh());
		lowHigh.click();
		wlib.waitForElementVisibility(getOutStockProduct());
		wlib.mouseHoverAction(getOutStockProduct());
		outStockProduct.click();
		
	}
	
	
public  ProductsList(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}