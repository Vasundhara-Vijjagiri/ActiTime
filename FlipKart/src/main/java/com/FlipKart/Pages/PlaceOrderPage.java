package com.FlipKart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPage {
	@FindBy(xpath="//span[.='Place Order']") private WebElement order;

	public WebElement getOrder() {
		return order;
	}

	public void setOrder() {
		order.click();
	}
public PlaceOrderPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}
